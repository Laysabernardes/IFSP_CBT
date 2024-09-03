//Alunos: Laysa Bernardes Campos da Rocha - CB3024873 e Lucas Lopes Cruz - CB3025284

#include <iostream>
using namespace std;

// Função para imprimir o vetor
void print(int t, int *a) {
    for (int i = 0; i < t; ++i) {
        cout << "Elemento " << i << " = " << a[i] << endl;
    }
    cout << "----------------" << endl;
}

// Função para ordenar o vetor usando Insertion Sort
void insertion_sort(int t, int *a) {
    // Percorre cada elemento do vetor começando do segundo elemento
    for (int i = 1; i < t; ++i) {
        int key = a[i]; // Elemento atual a ser inserido na parte ordenada
        int j = i - 1;

        // Exibe a tentativa de inserir o elemento atual na posição correta
        cout << "Inserindo " << key << " na posicao correta." << endl;

        // Move os elementos da parte ordenada que são maiores que 'key' para a direita
        while (j >= 0 && a[j] > key) {
            cout << "Comparando " << key << " com " << a[j] << " - TROCOU!!!" << endl;
            a[j + 1] = a[j]; // Move o elemento para a direita
            j = j - 1; // Passa para o elemento anterior
        }
        
        // Insere o 'key' na posição correta
        a[j + 1] = key;

        // Imprime o vetor após cada inserção
        print(t, a);
    }
}

int main() {
    // Inicializa o vetor com os valores fornecidos
    int v[8] = {49, 38, 58, 87, 34, 93, 26, 13};
    print(8, v);
    insertion_sort(8, v);
    print(8, v);
    return 0;
}
