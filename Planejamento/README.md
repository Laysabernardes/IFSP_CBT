# Planejamento do Artigo: "A Força de Trabalho em Tecnologia no Brasil"

## Estrutura e Conteúdo do Artigo
O artigo seguirá a estrutura acadêmica padrão, focando em apresentar os dados de forma clara e em extrair insights relevantes.

### Título Provisório:
A Força de Trabalho em Tecnologia no Brasil.

### Resumo (Abstract)
-  **Objetivo:** Apresentar uma análise detalhada do perfil dos profissionais de Tecnologia da Informação e Comunicação (TIC) no Brasil.
-  **Metodologia:** Utilização dos microdados da Pesquisa Nacional por Amostra de Domicílios Contínua (PNAD Contínua) do IBGE. A identificação dos profissionais foi feita com base nos códigos da Classificação de Ocupações Domiciliares (COD).
-  **Principais Resultados:** Sumarizar as descobertas sobre distribuição geográfica, perfil de gênero e raça, nível educacional, faixa etária e rendimento médio, destacando possíveis disparidades.
-  **Conclusão:** Reforçar a importância do setor e as implicações dos achados para políticas públicas e estratégias de mercado.

### Introdução
-  **Contextualização:** Discutir a crescente importância do setor de tecnologia para a economia brasileira (transformação digital, inovação, geração de empregos). Citar dados de mercado sobre a alta demanda por esses profissionais.
-  **Problema de Pesquisa/Justificativa:** Apontar a necessidade de um retrato atualizado e detalhado da força de trabalho em TIC, que vá além de relatórios de consultoria, utilizando uma fonte de dados oficial e abrangente como a PNAD. A análise de microdados permite um nível de detalhe demográfico impossível de obter em relatórios agregados.
-  **Objetivos:**
    -  **Geral:** Analisar o perfil demográfico, educacional e de rendimento dos profissionais de TIC no Brasil.
    -  **Específicos:**
        1.  Mapear a distribuição geográfica dos profissionais de TIC pelas Unidades da Federação.
        2.  Analisar a composição da força de trabalho por gênero, cor/raça e idade.
        3.  Verificar o nível de escolaridade predominante no setor.
        4.  Investigar o rendimento médio e as disparidades salariais com base em gênero, raça e região.
    -  Estrutura do Artigo: Descrever brevemente o que será abordado nas seções seguintes.

### Metodologia
-  **Fonte de Dados:**  PNAD Contínua do IBGE. Descrever brevemente a pesquisa (abrangência nacional, periodicidade, relevância estatística).
-  **Definição da Amostra:** Explicar o critério de seleção dos "profissionais de TIC". Detalhar que a filtragem foi realizada a partir da variável `V4010` (Ocupação no trabalho principal), utilizando uma lista pré-definida de códigos da "Classificação de Ocupações Domiciliares (COD)". Listar alguns exemplos de ocupações incluídas (ex: Analistas de Sistemas, Desenvolvedores, Técnicos de Redes, etc.).
-  **Variáveis de Análise:** Apresentar as variáveis selecionadas do questionário da PNAD (`UF`, `V2007`, `V2009`, `V2010`, `VD3004`, `VD4020`) e o que cada uma representa.
-  **Ferramentas e Procedimentos de Análise**:
    1.  Mencionar o uso da linguagem Python com a biblioteca `pandas` para o processamento dos dados.
    2.  Descrever o processo: leitura da estrutura dos arquivos a partir do `input.sas`, leitura dos arquivos de dados brutos (.txt) em chunks (pedaços) para otimização de memória.
    3.  Detalhar a filtragem dos registros com base nos códigos de ocupação e a concatenação dos resultados em um único `DataFrame`.
    4.  Explicar que a análise estatística descritiva (médias, medianas, distribuições de frequência) e a criação de visualizações (gráficos e tabelas) serão feitas a partir do `DataFrame` final gerado (`profissionais_tic_encontrados.csv`).

### Resultados e Análise
1.  **Perfil Geral e Distribuição Geográfica:**
    -  Apresentar o número total de profissionais de TIC encontrados na amostra consolidada.
    -  Mostrar distribuição por Estado (UF) e/ou Região (Sudeste, Sul, etc) por tabela/mapa de calor/gráfico de barras.
2.  **Perfil Demográfico: Gênero e Cor/Raça:**
    -  Apresentar a distribuição percentual por Gênero (`V2007`).
        -  Se possível comparar com a distribuição na força de trabalho geral do país.
    -  Apresentar a distribuição percentual por Cor/Raça (`V2010`).
        -  Se possível contrastar com a composição racial da população brasileira.
3.  **Faixa Etária e Nível Educacional:**
    -  Criar um histograma para mostrar a distribuição dos profissionais por Faixa Etária (`V2009`). Calcular a idade média e mediana.
    -  Apresentar um gráfico de barras com o Nível de Escolaridade (`VD3004`). Destacar a alta qualificação do setor (ex: % com Superior Completo ou mais).
4.  **Análise de Rendimento e Disparidades:**
    -  Apresentar estatísticas do Rendimento Mensal (`VD4020`): média, mediana, quartis.
    -  Análise de Disparidade Salarial:
        -  Gênero: Comparar o rendimento mediano de homens e mulheres (usar um `boxplot`). Calcular o gender pay gap.
        -  Cor/Raça: Comparar o rendimento mediano entre brancos, pretos e pardos (usar `boxplot`). Calcular o racial pay gap.
        -  Região: Comparar o rendimento mediano entre as Grandes Regiões.
    -  Análise Cruzada (se houver tempo/espaço): Analisar o rendimento de mulheres negras vs. homens brancos, por exemplo, para mostrar a interseccionalidade das desigualdades.

### Discussão
-  **Interpretação dos Resultados:** O que os números significam? Ex: A concentração no Sudeste reflete a localização dos polos tecnológicos. A baixa representatividade de mulheres e negros, especialmente em cargos de maior rendimento, indica barreiras estruturais.
-  **Diálogo com a Literatura:** Comparar seus achados com relatórios de associações como a Brasscom, ou com estudos acadêmicos sobre o mercado de trabalho em tecnologia no Brasil. Seus dados confirmam ou contradizem as tendências apontadas por outras fontes?
-  **Limitações do Estudo:** Ser transparente sobre os limites. Ex: A PNAD é uma pesquisa amostral (sujeita a erro amostral), o rendimento é autodeclarado e a lista de códigos de ocupação, embora abrangente, pode não capturar 100% dos profissionais da área.

### Conclusão
-  **Síntese dos Achados:** Recapitular as principais descobertas de forma concisa.
-  **Implicações:** Discutir as implicações práticas dos resultados para empresas (políticas de Diversidade, Equidade e Inclusão), governo (políticas de incentivo à formação e à descentralização regional) e para os próprios profissionais.
-  **Sugestões para Pesquisas Futuras:** Apontar caminhos para novas investigações. Ex: Acompanhar a evolução desses indicadores ao longo do tempo (análise longitudinal), incluir outras variáveis da PNAD (tipo de contrato, horas trabalhadas), ou aprofundar a análise em uma ocupação específica.

## Tarefas de Execução
-  [x] Finalizar o planejamento do artigo
-  [ ] Elaborar script Python para gerar um arquivo com os dados.
-  [ ] Análise exploratória. Gerar as tabelas de frequência, estatísticas descritivas (médias, medianas) e os gráficos principais (mapas, barras, boxplots). O objetivo é ter todos os "números" e visualizações prontos.
-  [ ] Escrever as seções de Introdução e Metodologia.
-  [ ] Escrever a seção de Resultados e Análise. Esta é a parte mais densa.
-  [ ] Escrever as seções de Discussão e Conclusão.
-  [ ] Escrever o Resumo, formatar todo o documento (citações, referências, numeração de páginas, etc.), e fazer uma revisão completa do texto, procurando por erros de digitação, gramática e clareza.
-  [ ] Fazer uma última leitura do trabalho antes de enviar ao professor.