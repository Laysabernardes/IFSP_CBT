# Análise do Perfil da Força de Trabalho em Tecnologia no Brasil

Este projeto realiza uma análise quantitativa dos microdados da Pesquisa Nacional por Amostra de Domicílios Contínua (PNAD Contínua) do IBGE para traçar o perfil dos profissionais de Tecnologia da Informação (TI) no Brasil. O script em Python processa os dados brutos, filtra as ocupações relevantes e gera estatísticas descritivas sobre o perfil demográfico, geográfico, educacional e de renda desses profissionais.

---

## Estrutura do Projeto

O diretório está organizado com os seguintes arquivos:

-   `PNADC_012024.txt`, `PNADC_022024.txt`, etc.: Arquivos de microdados brutos da PNAD Contínua para cada trimestre de 2024.
-   `input_PNADC_trimestral.sas`: Arquivo de layout fornecido pelo IBGE, utilizado pelo script para entender a estrutura e as posições das colunas nos arquivos de dados.
-   `Estrutura_Ocupacao_COD.xls`: Documento oficial do IBGE com a "Classificação de Ocupações para Pesquisas Domiciliares (COD)". Essencial para identificar os códigos corretos para filtrar os profissionais de TI na coluna `V4010`.
-   `ler_panda.py`: O script principal em Python que executa todo o processo de leitura, filtragem e análise dos dados.
-   `README.md`: Este arquivo, com a documentação do projeto.

---

## Fonte dos Dados

Os dados utilizados são da Pesquisa Nacional por Amostra de Domicílios Contínua (PNAD Contínua), originalmente disponibilizados pelo IBGE estão centralizados no seguinte link:

-   **Microdados 2024:** [https://ftp.ibge.gov.br/Trabalho_e_Rendimento/Pesquisa_Nacional_por_Amostra_de_Domicilios_continua/Trimestral/Microdados/2024](https://ftp.ibge.gov.br/Trabalho_e_Rendimento/Pesquisa_Nacional_por_Amostra_de_Domicilios_continua/Trimestral/Microdados/2024)
-   **Microdados 2023:** [https://ftp.ibge.gov.br/Trabalho_e_Rendimento/Pesquisa_Nacional_por_Amostra_de_Domicilios_continua/Trimestral/Microdados/2023](https://ftp.ibge.gov.br/Trabalho_e_Rendimento/Pesquisa_Nacional_por_Amostra_de_Domicilios_continua/Trimestral/Microdados/2023)

---

## Pré-requisitos

Para executar a análise, você precisará ter o seguinte software instalado:

-   Python 3.x
-   Biblioteca `pandas` do Python

Se você não tiver a biblioteca `pandas` instalada, pode instalá-la usando o pip:
```bash
pip install pandas
```

---

## Como Executar

1.  **Baixe os Arquivos:** Faça o download de todos os arquivos do link do Google Drive fornecido e coloque-os no mesmo diretório que o script `ler_panda.py`.
2.  **Execute o Script:** Abra um terminal na pasta do projeto e execute o seguinte comando:
    ```bash
    python3 ler_panda.py
    ```
3.  **Acompanhe a Saída:** O script processará os quatro trimestres e, ao final, imprimirá a análise completa diretamente no terminal.

---

## Detalhes da Análise

O script realiza as seguintes etapas lógicas:

1.  **Leitura da Estrutura:** Utiliza o arquivo `input_PNADC_trimestral.sas` para mapear as 420 colunas dos arquivos de dados brutos.
2.  **Processamento em Chunks:** Lê os arquivos de dados trimestrais em pedaços (chunks) para não sobrecarregar a memória RAM.
3.  **Filtro de Profissionais de TI:** A identificação dos profissionais de TI é feita na coluna `V4010` (Código da ocupação). Os códigos utilizados são baseados na **"Classificação de Ocupações para Pesquisas Domiciliares (COD)"** do IBGE e incluem as seguintes famílias:
    -   Dirigentes e Gerentes
        -   `1330`: Gerentes de tecnologia da informação
    -   Profissionais de Nível Superior
        -   `2151`: Engenheiros em eletrônicos
        -   `2153`: Engenheiros em telecomunicações
        -   `2166`: Desenhistas gráficas e de multimídia
        -   `2356`: Instrutores em tecnologias da informação
        -   `2434`: Profissionais de vendas de tecnologia da informação e comunicações
    -   Profissionais de Tecnologias da Informação e Comunicações (Categoria Principal)
        -   `2511`: Analistas de sistemas
        -   `2512`: Desenvolvedores de programas e aplicativos (software)
        -   `2513`: Desenvolvedores de páginas de internet (web) e multimídia
        -   `2514`: Programadores de aplicações
        -   `2519`: Desenvolvedores e analistas de programas e aplicativos (software) e multimídia não classificados anteriormente
        -   `2521`: Desenhistas e administradores de bases de dados
        -   `2522`: Administradores de sistemas
        -   `2523`: Profissionais em rede de computadores
        -   `2529`: Especialistas em base de dados e em redes de computadores não classificados anteriormente
    -   Técnicos e Profissionais de Nível Médio
        -   `3113`: Eletrotécnicos
        -   `3114`: Técnicos em eletrônica
        -   `3522`: Técnicos de engenharia de telecomunicações
    -   Técnicos de Nível Médio da Tecnologia da informação e das Comunicações (Categoria Principal)
        -   `3511`: Técnicos em operações de tecnologia da informação e das comunicações
        -   `3512`: Técnicos em assistência ao usuário de tecnologia da informação e das comunicações
        -   `3513`: Técnicos de redes e sistemas de computadores
        -   `3514`: Técnicos da web
        -   `3521`: Técnicos em radiodifusão e gravação audivisual
    -   Trabalhadores Especializados em Eletrônica e Eletricidade
        -   `7421`: Mecânicos e reparadores em eletrônica
        -   `7422`: Instaladores e reparadores em tecnologia da informação e comunicações
    -   Trabalhadores de Apoio a Operadores
        -   `4131`: Operadores de máquina de processamento de texto e mecanógrafos
        -   `4132`: Operadores de entrada de dados
4.  **Geração dos Resultados:** Calcula e exibe estatísticas sobre a distribuição geográfica, perfil de gênero, renda, educação e idade dos profissionais encontrados.
