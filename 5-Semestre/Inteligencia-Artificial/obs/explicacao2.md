# Conceito Central do Código
O programa utiliza o Algoritmo A*, um dos algoritmos de busca informada mais conhecidos, que encontra o caminho mais curto em um grafo. Ele combina:
O custo acumulado (a distância real já percorrida).
Uma heurística (uma estimativa do custo restante para chegar ao destino).
Isso torna o algoritmo eficiente, pois ele evita explorar caminhos menos promissores, escolhendo sempre o que aparenta ser mais curto.

### O programa:
- Lê dados de arquivos como heurísticas e conexões entre cidades.
- Constrói representações de cidades e conexões (grafo).
- Usa o A* para encontrar o melhor caminho entre duas cidades.
- Desenha o mapa e o caminho encontrado.

## Explicação Detalhada do Código

## 1. Importação de Bibliotecas
```
import queue  # Manipula filas de prioridade
import matplotlib.pyplot as plt  # Cria gráficos e visualizações

```
- queue.PriorityQueue: Uma estrutura que armazena elementos de acordo com a sua prioridade (o menor valor é processado primeiro).
- matplotlib.pyplot: Permite criar gráficos e visualizar o mapa e as conexões das cidades.

## 2. Função obter_heuristicas()
```
def obter_heuristicas():
    heuristicas = {}
    arquivo = open("heuristicas.txt")

    for linha in arquivo.readlines():
        valores = linha.split()
        heuristicas[valores[0]] = int(valores[1])
    return heuristicas
```

#### Propósito: 
Lê o arquivo heuristicas.txt e carrega as heurísticas (estimativas de distâncias).
##### Como funciona:
Cada linha do arquivo contém o nome da cidade e seu valor de heurística.
Converte esses dados em um dicionário: {cidade: valor_heuristica}.

## 3. Função obter_cidades()
```
def obter_cidades():
    cidade = {}
    codigos_cidades = {}
    arquivo = open("cidades.txt")
    indice = 1

    for linha in arquivo.readlines():
        valores = linha.split()
        cidade[valores[0]] = [int(valores[1]), int(valores[2])]
        codigos_cidades[indice] = valores[0]
        indice += 1
    return cidade, codigos_cidades
```
#### Propósito: 
 Lê o arquivo cidades.txt, que contém as coordenadas das cidades, e gera dois dicionários:
- {cidade: [coordenada_x, coordenada_y]}.
- {indice: cidade} para criar um mapeamento numérico das cidades.

## 4. Função criar_grafo()
```
def criar_grafo():
    grafo = {}
    arquivo = open("grafoCidades.txt")

    for linha in arquivo.readlines():
        valores = linha.split()
        cidade1, cidade2, distancia = valores[0], valores[1], valores[2]

        if cidade1 in grafo and cidade2 in grafo:
            grafo[cidade1].append([cidade2, distancia])
            grafo[cidade2].append([cidade1, distancia])
        elif cidade1 in grafo:
            grafo[cidade1].append([cidade2, distancia])
            grafo[cidade2] = [[cidade1, distancia]]
        elif cidade2 in grafo:
            grafo[cidade2].append([cidade1, distancia])
            grafo[cidade1] = [[cidade2, distancia]]
        else:
            grafo[cidade1] = [[cidade2, distancia]]
            grafo[cidade2] = [[cidade1, distancia]]

    return grafo
```
#### Propósito:  
Lê o arquivo grafoCidades.txt e cria o grafo das cidades e suas conexões.

####  Saída: 
Um dicionário onde cada cidade é mapeada para suas cidades vizinhas e a distância:
```
{'Arad': [['Sibiu', 140], ['Timisoara', 118]]}
```

## 5. Função algoritmo_a_estrela()
```
def algoritmo_a_estrela(cidade_inicio, heuristicas, grafo, cidade_destino="Bucharest"):
    fila_prioridade = queue.PriorityQueue()
    distancia_total = 0
    caminho = []

    fila_prioridade.put((heuristicas[cidade_inicio] + distancia_total, [cidade_inicio, 0]))

    while fila_prioridade.empty() == False:
        atual = fila_prioridade.get()[1]
        caminho.append(atual[0])
        distancia_total += int(atual[1])

        if atual[0] == cidade_destino:
            break

        fila_prioridade = queue.PriorityQueue()

        for vizinho in grafo[atual[0]]:
            if vizinho[0] not in caminho:
                fila_prioridade.put(
                    (heuristicas[vizinho[0]] + int(vizinho[1]) + distancia_total, vizinho)
                )

    return caminho, distancia_total
```

#### Propósito: 
 Implementa o Algoritmo A* para encontrar o caminho mais curto.

#### Etapas:

- Adiciona a cidade inicial à fila de prioridade com:
- Prioridade: heuristica + distancia_acumulada.
- Processa os vizinhos do nó atual, adicionando-os à fila com suas respectivas prioridades.
- Para quando o destino é alcançado

#### Saída: 
O caminho completo e a distância total.

## 6. Função desenhar_mapa()
```
def desenhar_mapa(cidades, caminho_a_estrela, grafo):
    for nome_cidade, coordenadas in cidades.items():
        plt.plot(coordenadas[0], coordenadas[1], "ro")
        plt.annotate(nome_cidade, (coordenadas[0] + 5, coordenadas[1]))

        for conexao in grafo[nome_cidade]:
            cidade_conectada = cidades[conexao[0]]
            plt.plot([coordenadas[0], cidade_conectada[0]],
                     [coordenadas[1], cidade_conectada[1]], "gray")

    for i in range(len(caminho_a_estrela)):
        try:
            cidade_atual = cidades[caminho_a_estrela[i]]
            proxima_cidade = cidades[caminho_a_estrela[i + 1]]

            plt.plot([cidade_atual[0], proxima_cidade[0]],
                     [cidade_atual[1], proxima_cidade[1]], "blue")
        except:
            continue

    plt.errorbar(1, 1, label="A*", color="blue")
    plt.legend(loc="lower left")
    plt.show()
```

#### Propósito: 
Desenha um mapa visual que mostra o grafo e o caminho encontrado.

#### Como funciona:
Usa as coordenadas das cidades para desenhar pontos e conexões.
Destaca o caminho encontrado pelo A* em azul.

## 7. Função main()
```
def main():
    heuristicas = obter_heuristicas()
    grafo = criar_grafo()
    cidades, codigos_cidades = obter_cidades()

    for codigo, nome in codigos_cidades.items():
        print(codigo, nome)

    while True:
        codigo_cidade = int(input("Digite o código da cidade desejada (0 para sair): "))
        if codigo_cidade == 0:
            break
        nome_cidade = codigos_cidades[codigo_cidade]

        a_estrela, distancia_total = algoritmo_a_estrela(nome_cidade, heuristicas, grafo)
        print("ASTAR => ", a_estrela)
        print("Custo total: ", distancia_total)
        desenhar_mapa(cidades, a_estrela, grafo)

main()
```
#### Propósito:  
É o ponto de partida do programa.

#### O que faz:

- Lê os dados dos arquivos.
- Interage com o usuário para obter a cidade inicial.
- Executa o A* e exibe os resultados no terminal e no mapa.
