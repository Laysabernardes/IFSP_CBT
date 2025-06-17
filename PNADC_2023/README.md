link para a base: https://ftp.ibge.gov.br/Trabalho_e_Rendimento/Pesquisa_Nacional_por_Amostra_de_Domicilios_continua/Anual/Microdados/Trimestre/Trimestre_4/Dados/

Análise com as seguintes features:
```python
features = [
  'Gênero', 'Cor_Raça', 'Anos_Estudo', 'Horas_Trabalhadas_Semana',
  'Posição_Ocupacional', 'Atividade_Principal', 'Carteira_Assinada', 'Regiao',
  'Experiencia_Estimada', 'Faixa_Etaria'
]
```
Resultado:
```bash
--- Iniciando Etapa 2: Modelagem de Machine Learning ---
Base de dados carregada com 4336 registros válidos para modelagem.
Dados separados em: 1788 profissionais de nível superior e 2548 de nível técnico/médio.
------------------------------------------------------------

>>>> INICIANDO ANÁLISE DO GRUPO: NÍVEL SUPERIOR <<<<

--- Otimizando hiperparâmetros do modelo... ---
Fitting 5 folds for each of 50 candidates, totalling 250 fits

Melhor Acurácia encontrada na validação cruzada: 71.61%
Melhores Hiperparâmetros: {'classifier__subsample': 1.0, 'classifier__n_estimators': 300, 'classifier__max_depth': 3, 'classifier__learning_rate': 0.05, 'classifier__colsample_bytree': 0.9}

--- Avaliação Final no Conjunto de Teste com o Melhor Modelo ---
Resultado Acurácia Final: 68.72%
Relatório de Classificação Detalhado:
               precision    recall  f1-score   support

Salário Baixo       0.75      0.64      0.69       193
 Salário Alto       0.64      0.75      0.69       165

     accuracy                           0.69       358
    macro avg       0.69      0.69      0.69       358
 weighted avg       0.70      0.69      0.69       358

------------------------------------------------------------

>>>> INICIANDO ANÁLISE DO GRUPO: NÍVEL TÉCNICO <<<<

--- Otimizando hiperparâmetros do modelo... ---
Fitting 5 folds for each of 50 candidates, totalling 250 fits

Melhor Acurácia encontrada na validação cruzada: 73.60%
Melhores Hiperparâmetros: {'classifier__subsample': 1.0, 'classifier__n_estimators': 500, 'classifier__max_depth': 5, 'classifier__learning_rate': 0.01, 'classifier__colsample_bytree': 0.7}

--- Avaliação Final no Conjunto de Teste com o Melhor Modelo ---
Resultado Acurácia Final: 72.55%
Relatório de Classificação Detalhado:
               precision    recall  f1-score   support

Salário Baixo       0.73      0.73      0.73       257
 Salário Alto       0.73      0.72      0.72       253

     accuracy                           0.73       510
    macro avg       0.73      0.73      0.73       510
 weighted avg       0.73      0.73      0.73       510

--- ANÁLISE COMPLETA CONCLUÍDA ---
```
