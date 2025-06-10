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

Os dados utilizados são da Pesquisa Nacional por Amostra de Domicílios Contínua (PNAD Contínua), originalmente disponibilizados pelo IBGE.

Para este projeto, os arquivos de dados brutos (`.txt`) estão centralizados no seguinte link do Google Drive:

-   **Link do Google Drive:** [https://drive.google.com/drive/folders/1KqGLXvdGr9-QZdZLtxpmVXser4n5lg9q](https://drive.google.com/drive/folders/1KqGLXvdGr9-QZdZLtxpmVXser4n5lg9q)

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
    -   `1330`: Gerentes de tecnologia da informação
    -   `2121`: Analistas de sistemas
    -   `2122`: Desenvolvedores de páginas de internet (web) e multimídia
    -   `2123`: Desenvolvedores de aplicativos e programas computacionais
    -   `2129`: Outros especialistas em tecnologia da informação
    -   `3131`: Técnicos em operação de computadores
    -   `3132`: Técnicos em manutenção de TICs
    -   `3134`: Técnicos de redes e de suporte ao usuário de TICs
4.  **Geração dos Resultados:** Calcula e exibe estatísticas sobre a distribuição geográfica, perfil de gênero, renda, educação e idade dos profissionais encontrados.
