# -*- coding: utf-8 -*-
# VERSÃO FINAL COM GERAÇÃO DE GRÁFICOS
import pandas as pd
import xgboost as xgb
from sklearn.model_selection import train_test_split, RandomizedSearchCV
from sklearn.preprocessing import StandardScaler, OneHotEncoder
from sklearn.compose import ColumnTransformer
from sklearn.pipeline import Pipeline
from sklearn.metrics import accuracy_score, classification_report
import warnings
import matplotlib.pyplot as plt
import seaborn as sns

warnings.filterwarnings('ignore', category=UserWarning)

print("\n\n--- Iniciando Etapa 2: Modelagem e Visualização ---")

# --- 1. CARREGAR E PREPARAR OS DADOS DO CSV ---
try:
    df = pd.read_csv('profissionais_tic_encontrados_anual.csv')
except FileNotFoundError:
    print(f"ERRO: Arquivo 'profissionais_tic_encontrados_anual.csv' não encontrado.")
    print("Por favor, execute primeiro o script 'ler_pandas.py' para gerar este arquivo.")
    exit()

# --- 1.1 ETAPA CRÍTICA DE LIMPEZA: REMOVER SALÁRIOS ZERADOS E NULOS ---
df.dropna(subset=['Renda_Mensal'], inplace=True)
df = df[df['Renda_Mensal'] > 0]
df.dropna(subset=['Horas_Trabalhadas_Semana'], inplace=True)

print(f"Base de dados carregada com {len(df)} registros válidos para modelagem.")

# --- Feature Engineering Básica ---
mapa_uf_para_nome = {
    11: 'Rondônia', 12: 'Acre', 13: 'Amazonas', 14: 'Roraima', 15: 'Pará', 16: 'Amapá', 17: 'Tocantins',
    21: 'Maranhão', 22: 'Piauí', 23: 'Ceará', 24: 'Rio Grande do Norte', 25: 'Paraíba', 26: 'Pernambuco',
    27: 'Alagoas', 28: 'Sergipe', 29: 'Bahia', 31: 'Minas Gerais', 32: 'Espírito Santo', 33: 'Rio de Janeiro',
    35: 'São Paulo', 41: 'Paraná', 42: 'Santa Catarina', 43: 'Rio Grande do Sul', 50: 'Mato Grosso do Sul',
    51: 'Mato Grosso', 52: 'Goiás', 53: 'Distrito Federal'
}
mapa_regiao = {
    'Rondônia': 'Norte', 'Acre': 'Norte', 'Amazonas': 'Norte', 'Roraima': 'Norte', 'Pará': 'Norte', 'Amapá': 'Norte', 'Tocantins': 'Norte',
    'Maranhão': 'Nordeste', 'Piauí': 'Nordeste', 'Ceará': 'Nordeste', 'Rio Grande do Norte': 'Nordeste', 'Paraíba': 'Nordeste', 'Pernambuco': 'Nordeste', 'Alagoas': 'Nordeste', 'Sergipe': 'Nordeste', 'Bahia': 'Nordeste',
    'Minas Gerais': 'Sudeste', 'Espírito Santo': 'Sudeste', 'Rio de Janeiro': 'Sudeste', 'São Paulo': 'Sudeste',
    'Paraná': 'Sul', 'Santa Catarina': 'Sul', 'Rio Grande do Sul': 'Sul',
    'Mato Grosso do Sul': 'Centro-Oeste', 'Mato Grosso': 'Centro-Oeste', 'Goiás': 'Centro-Oeste', 'Distrito Federal': 'Centro-Oeste'
}

df['Nome_Estado'] = df['Estado'].map(mapa_uf_para_nome)
df['Regiao'] = df['Nome_Estado'].map(mapa_regiao)
df['Experiencia_Estimada'] = (df['Idade'] - df['Anos_Estudo'] - 6).clip(lower=0)
faixas_idade = [14, 24, 34, 44, 54, 110]
rotulos_idade = ['14-24', '25-34', '35-44', '45-54', '55+']
df['Faixa_Etaria'] = pd.cut(df['Idade'], bins=faixas_idade, labels=rotulos_idade, right=False)

# --- 2. SEPARAR CARREIRAS (TÉCNICO VS. SUPERIOR) ---
codigos_superior = [1330, 2151, 2153, 2166, 2356, 2434, 2511, 2512, 2513, 2514, 2519, 2521, 2522, 2523, 2529]
codigos_tecnico = [3113, 3114, 3522, 3511, 3512, 3513, 3514, 3521, 7421, 7422, 4131, 4132]
df_superior = df[df['Código_Ocupação_TI'].isin(codigos_superior)]
df_tecnico = df[df['Código_Ocupação_TI'].isin(codigos_tecnico)]
print(f"Dados separados em: {len(df_superior)} profissionais de nível superior e {len(df_tecnico)} de nível técnico/médio.")
print("-" * 60)

# --- 3. FUNÇÃO PARA RODAR OS MODELOS E GERAR GRÁFICOS ---
def analisar_grupo(df_grupo, nome_grupo):
    if len(df_grupo) < 50:
        print(f"\n>>>> GRUPO '{nome_grupo.upper()}' tem dados insuficientes para análise. <<<<")
        return

    print(f"\n>>>> INICIANDO ANÁLISE DO GRUPO: {nome_grupo.upper()} <<<<")
    
    features = [
        'Gênero', 'Cor_Raça', 'Anos_Estudo', 'Horas_Trabalhadas_Semana',
        'Posição_Ocupacional', 'Atividade_Principal', 'Carteira_Assinada', 'Regiao',
        'Experiencia_Estimada', 'Faixa_Etaria'
    ]
    
    X = df_grupo[features]
    y_class = (df_grupo['Renda_Mensal'] > df_grupo['Renda_Mensal'].median()).astype(int)
    
    colunas_numericas = ['Anos_Estudo', 'Horas_Trabalhadas_Semana', 'Experiencia_Estimada']
    colunas_categoricas = ['Gênero', 'Cor_Raça', 'Posição_Ocupacional', 'Atividade_Principal', 'Carteira_Assinada', 'Regiao', 'Faixa_Etaria']
    
    X_train, X_test, y_train, y_test = train_test_split(X, y_class, test_size=0.2, random_state=42, stratify=y_class)
    
    preprocessor = ColumnTransformer(
        transformers=[
            ('num', StandardScaler(), colunas_numericas),
            ('cat', OneHotEncoder(handle_unknown='ignore', drop='first'), colunas_categoricas)
        ],
        remainder='passthrough'
    )
    
    pipeline = Pipeline(steps=[
        ('preprocessor', preprocessor),
        ('classifier', xgb.XGBClassifier(eval_metric='logloss', use_label_encoder=False, random_state=42))
    ])

    param_dist = {
        'classifier__n_estimators': [100, 200, 300],
        'classifier__learning_rate': [0.01, 0.05, 0.1],
        'classifier__max_depth': [3, 5],
        'classifier__subsample': [0.8, 1.0],
        'classifier__colsample_bytree': [0.8, 1.0]
    }
    
    random_search = RandomizedSearchCV(pipeline, param_distributions=param_dist, n_iter=30, scoring='accuracy', cv=5, n_jobs=-1, random_state=42, verbose=0)
    random_search.fit(X_train, y_train)

    best_model = random_search.best_estimator_
    y_pred = best_model.predict(X_test)
    
    print(f"Resultado Acurácia Final: {accuracy_score(y_test, y_pred):.2%}")
    print("Melhores Hiperparâmetros:", random_search.best_params_)
    print("Relatório de Classificação Detalhado:")
    print(classification_report(y_test, y_pred, target_names=['Salário Baixo', 'Salário Alto']))
    
    print("\n--- Importância das Features ---")
    try:
        feature_names = best_model.named_steps['preprocessor'].get_feature_names_out()
        importances = best_model.named_steps['classifier'].feature_importances_
        df_importances = pd.DataFrame({'feature': feature_names, 'importance': importances}).sort_values('importance', ascending=False)
        print(df_importances.head(10))
        
        # --- NOVO BLOCO: GERAR E SALVAR O GRÁFICO ---
        print(f"\n--- Gerando gráfico para o grupo: {nome_grupo} ---")
        
        plt.figure(figsize=(10, 8))
        sns.barplot(x='importance', y='feature', data=df_importances.head(15), palette='viridis', hue='feature', legend=False)
        
        plt.title(f'Top 15 Features Mais Importantes - {nome_grupo}', fontsize=16)
        plt.xlabel('Importância Relativa (XGBoost)', fontsize=12)
        plt.ylabel('Feature', fontsize=12)
        plt.xticks(fontsize=10)
        plt.yticks(fontsize=10)
        
        plt.tight_layout()
        
        nome_arquivo_grafico = f"grafico_importancia_{nome_grupo.replace(' ', '_').lower()}.png"
        plt.savefig(nome_arquivo_grafico, dpi=300)
        plt.close() # Fecha a figura para liberar memória
        print(f"Gráfico salvo com sucesso como: '{nome_arquivo_grafico}'")
        
    except Exception as e:
        print(f"Ocorreu um erro ao gerar o gráfico: {e}")

    print("-" * 60)

# --- 4. EXECUTAR A ANÁLISE PARA CADA GRUPO ---
analisar_grupo(df_superior, "Nível Superior")
analisar_grupo(df_tecnico, "Nível Técnico")

print("\n\n--- ANÁLISE COMPLETA CONCLUÍDA ---")