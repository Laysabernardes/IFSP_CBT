# Algoritmo A* (A-star) - Busca do Caminho mais Curto

Este projeto implementa o **Algoritmo A*** para encontrar o **caminho mais curto** entre duas cidades em um grafo, utilizando heurísticas e distâncias reais. É ideal para entender como funcionam algoritmos de busca informada, estruturas de grafos e filas de prioridade.

---

## 💡 Funcionalidades

- Carregar **heurísticas** de estimativas de distância.
- Representação das cidades e conexões usando **grafos**.
- Implementação do **Algoritmo A*** para busca eficiente do caminho mais curto.
- Geração de um **mapa visual** com o trajeto calculado.

---

## 📂 Estrutura do Projeto

### Arquivos
- **`heuristicas.txt`**: Contém as heurísticas (estimativas de distância).
- **`cidades.txt`**: Lista das cidades e suas coordenadas.
- **`grafoCidades.txt`**: Descreve as conexões entre cidades e as distâncias.
- **`main.py`**: Código principal para executar o programa.

---

### Funções principais do código

#### `obter_heuristicas()`
Carrega as heurísticas do arquivo `heuristicas.txt` e retorna um dicionário:
```python
{'Arad': 366, 'Sibiu': 253, 'Bucharest': 0}

```
#### `obter_cidades()`
Carrega as cidades e suas coordenadas do arquivo cidades.txt.

#### `criar_grafo()`
Carrega as conexões entre cidades do arquivo grafoCidades.txt e as organiza em um grafo.

#### `algoritmo_a_estrela()`
Implementa o algoritmo A* para encontrar o caminho mais curto entre duas cidades.

#### `desenhar_mapa()`
Desenha um mapa com o grafo e o caminho encontrado utilizando matplotlib

![image](https://github.com/user-attachments/assets/9b55a8e3-bae7-4412-89b6-e2ef93f3f223)


## 🛠️ Tecnologias Utilizadas
- Python: Linguagem principal para o desenvolvimento.
- Matplotlib: Para geração de gráficos e mapas.
- Queue.PriorityQueue: Para implementação da fila de prioridade.

## 📖 Conceitos Aprendidos
- Grafos e suas representações.
- Busca informada com heurísticas.
- Algoritmos otimizados para caminhos mínimos.
- Visualização de dados com Python.

# 👨‍💻 Autores
- Beatriz Bastos
- Eduardo Miranda
- Laysa Bernardes
- Lucas Lopes
- Maria Eduarda Fodor
- Miguel Luizatto Alves
- Pedro Xavier
