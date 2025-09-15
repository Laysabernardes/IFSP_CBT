//Alunos: LLaysa Bernardes Campos da Rocha - CB3024873 e Lucas Lopes Cruz - CB3025284 
#include <iostream>
#include <time.h>
#include <string>
#include <locale.h>

using namespace std;

int main(int argc, char** argv)
{
    setlocale(LC_ALL, ""); // Configura o ambiente para usar caracteres especiais

    // Matriz para armazenar o baralho de cartas
    string baralho[2][52];

    // Matriz para armazenar as mãos de cada jogador
    string mao[4][11];

    // Matriz para rastrear se uma carta já foi distribuída ou não
    bool cartasDistribuidas[2][52] = {false};

    // Inicialização do baralho
    for (int n = 0; n < 4; n++)
    {
        for (int c = 0; c < 13; c++)
        {
            for (int b = 0; b < 2; b++)
            {
                // Cada carta é representada por uma string no formato "número-naipe", onde o número é de 01 a 13 e o naipe é de 1 a 4
                baralho[b][n * 13 + c] = to_string(n + 1) + "-" + (c < 9 ? "0" : "") + to_string(c + 1) + "-" + to_string(b + 1);
            }
        }
    }

    // Randomização das cartas para as mãos dos jogadores
    srand(time(0)); // Semente para gerar números aleatórios
    for (int j = 0; j < 4; j++)
    {
        for (int c = 0; c < 11; c++)
        {
            int n = rand() % 2; // Gera um número aleatório entre 0 e 1 para selecionar o naipe
            int i = rand() % 52; // Gera um número aleatório entre 0 e 51 para selecionar a carta
            // Verifica se a carta já foi distribuída
            while (cartasDistribuidas[n][i])
            {
                n = rand() % 2;
                i = rand() % 52;
            }
            mao[j][c] = baralho[n][i]; // Distribui a carta para a mão do jogador
            cartasDistribuidas[n][i] = true; // Marca a carta como distribuída
        }
    }

    // Exibição das mãos dos jogadores
    for (int j = 0; j < 4; j++)
    {
        cout << "Mão do jogador " << j + 1 << ":" << endl;
        for (int c = 0; c < 11; c++)
        {
            cout << mao[j][c] << endl;
        }
        cout << endl;
    }
    return 0;
}
