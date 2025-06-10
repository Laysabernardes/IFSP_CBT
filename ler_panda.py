import pandas as pd

# --- 1. CONFIGURAÇÃO ---
arquivos_dados = [
    'PNADC_012024.txt',
    'PNADC_022024.txt',
    'PNADC_032024.txt',
    'PNADC_042024.txt'
]
caminho_input = 'input_PNADC_trimestral.sas' 

# Usando os códigos da "Classificação de Ocupações Domiciliares (COD)" para a coluna V4010
codigos_ti_v4010 = [
    1330,  # Dirigentes de serviços de tecnologia da informação e comunicações
    2511,  # Analistas de sistemas
    2512,  # Desenvolvedores de programas e aplicativos (software)
    2513,  # Desenvolvedores de páginas de internet (web) e multimídia
    2514,  # Programadores de aplicações
    2519,  # Desenvolvedores e analistas de programas e aplicativos (software) e multimídia não classificados anteriormente
    2521,  # Desenhistas e administradores de bases de dados
    2522,  # Administradores de sistemas
    2523,  # Profissionais em rede de computadores
    2529,  # Especialistas em base de dados e em redes de computadores não classificados anteriormente
    3511,  # Técnicos em operações de tecnologia da informação e das comunicações
    3512,  # Técnicos em assistência ao usuário de tecnologia da informação e das comunicações
    3513,  # Técnicos de redes e sistemas de computadores
    3514,  # Técnicos da web
    7422,  # Instaladores e reparadores em tecnologia da informação e comunicações
    2356,  # instrutores em tecnologias da informação
    2434,  # Profissionais de vendas de tecnologia da informação e comunicações
]

# Variáveis que vamos usar na análise final
colunas_necessarias = [
    'UF', 'V2007', 'V2009', 'V2010', 'VD3004', 'V4010', 'VD4020'
]

# Dicionários para traduzir os códigos em texto claro
mapa_uf = {
    11: 'Rondônia', 12: 'Acre', 13: 'Amazonas', 14: 'Roraima', 15: 'Pará', 16: 'Amapá', 17: 'Tocantins',
    21: 'Maranhão', 22: 'Piauí', 23: 'Ceará', 24: 'Rio Grande do Norte', 25: 'Paraíba', 26: 'Pernambuco',
    27: 'Alagoas', 28: 'Sergipe', 29: 'Bahia', 31: 'Minas Gerais', 32: 'Espírito Santo', 33: 'Rio de Janeiro',
    35: 'São Paulo', 41: 'Paraná', 42: 'Santa Catarina', 43: 'Rio Grande do Sul', 50: 'Mato Grosso do Sul',
    51: 'Mato Grosso', 52: 'Goiás', 53: 'Distrito Federal'
}
mapa_genero = {1: 'Homem', 2: 'Mulher'}
mapa_educacao = {
    1: 'Sem instrução e fundamental incompleto',
    2: 'Fundamental completo e médio incompleto',
    3: 'Médio completo e superior incompleto',
    4: 'Superior completo',
    5: 'Pós-graduação, mestrado ou doutorado',
}

# --- 2. LER O SCRIPT DE INPUT PARA EXTRAIR A ESTRUTURA ---
print("Iniciando o processo...")
nomes_colunas = []
posicoes_colunas = []
try:
    with open(caminho_input, 'r', encoding='latin-1') as f:
        for linha in f:
            linha = linha.strip()
            if linha.startswith('@'):
                partes = linha.split()
                pos_inicial = int(partes[0].replace('@', ''))
                nome_variavel = partes[1]
                tamanho_str = partes[2].replace('.', '').replace('$', '')
                tamanho = int(tamanho_str)
                pos_final = pos_inicial + tamanho
                nomes_colunas.append(nome_variavel)
                posicoes_colunas.append((pos_inicial - 1, pos_final - 1))
except FileNotFoundError:
    print(f"ERRO: Arquivo de input não encontrado em '{caminho_input}'.")
    exit()
print(f"Estrutura lida com sucesso! {len(nomes_colunas)} colunas encontradas.")

# --- 3. LER E PROCESSAR TODOS OS ARQUIVOS EM PEDAÇOS (CHUNKS) ---
print("Lendo e filtrando os microdados pela coluna V4010...")
lista_de_chunks_ti = []

for arquivo_dados in arquivos_dados:
    print(f"\n--- Processando o arquivo: {arquivo_dados} ---")
    
    tamanho_do_chunk = 100000
    try:
        leitor_de_chunks = pd.read_fwf(
            arquivo_dados,
            colspecs=posicoes_colunas, names=nomes_colunas,
            header=None, chunksize=tamanho_do_chunk
        )
        
        for i, chunk in enumerate(leitor_de_chunks):
            print(f"Processando pedaço {i+1}...")
            
            # FILTRANDO PELA COLUNA CORRETA (V4010)
            chunk.dropna(subset=['V4010'], inplace=True)
            chunk['V4010'] = chunk['V4010'].astype(int)
            chunk_ti = chunk[chunk['V4010'].isin(codigos_ti_v4010)]
            
            if not chunk_ti.empty:
                lista_de_chunks_ti.append(chunk_ti[colunas_necessarias])
    except FileNotFoundError:
        print(f"AVISO: Arquivo '{arquivo_dados}' não encontrado. Pulando para o próximo.")
        continue

# --- 4. ANÁLISE FINAL E EXIBIÇÃO DOS RESULTADOS ---
print("\nJuntando os dados dos profissionais de TI de todos os trimestres...")

if not lista_de_chunks_ti:
    print("\n--- ANÁLISE CONCLUÍDA ---")
    print("Nenhum profissional de TI encontrado com os códigos COD fornecidos na coluna V4010.")
else:
    df_ti_final = pd.concat(lista_de_chunks_ti, ignore_index=True)
    print("\n--- ANÁLISE DO PERFIL DA FORÇA DE TRABALHO EM TECNOLOGIA (ANO COMPLETO) ---")
    print(f"Total de profissionais de TI na amostra final: {len(df_ti_final)}")

    # ANÁLISE GEOGRÁFICA
    print("\n--- 1. Distribuição Geográfica ---")
    df_ti_final['UF_Nome'] = df_ti_final['UF'].map(mapa_uf)
    dist_uf = df_ti_final['UF_Nome'].value_counts(normalize=True).mul(100).round(2)
    print("Distribuição percentual por Estado:")
    print(dist_uf)

    # ANÁLISE DE GÊNERO
    print("\n--- 2. Perfil de Gênero ---")
    df_ti_final['Gênero'] = df_ti_final['V2007'].map(mapa_genero)
    dist_genero = df_ti_final['Gênero'].value_counts(normalize=True).mul(100).round(2)
    print("Distribuição percentual por Gênero:")
    print(dist_genero)

    # ANÁLISE DE RENDA
    print("\n--- 3. Perfil de Renda (R$) ---")
    renda_valida = df_ti_final[df_ti_final['VD4020'].notna()]
    print(f"Salário Médio: R$ {renda_valida['VD4020'].mean():.2f}")
    print(f"Salário Mediano: R$ {renda_valida['VD4020'].median():.2f}")
    
    renda_por_genero = renda_valida.groupby('Gênero')['VD4020'].mean().round(2)
    print("\nSalário médio por Gênero:")
    print(renda_por_genero)

    # ANÁLISE DE EDUCAÇÃO
    print("\n--- 4. Perfil Educacional ---")
    df_ti_final['Educação'] = df_ti_final['VD3004'].map(mapa_educacao)
    dist_educacao = df_ti_final['Educação'].value_counts(normalize=True).mul(100).round(2)
    print("Distribuição percentual por Nível de Escolaridade:")
    print(dist_educacao)

    # ANÁLISE DE IDADE
    print("\n--- 5. Perfil de Idade ---")
    print("Estatísticas de Idade:")
    print(df_ti_final['V2009'].describe().round(1))