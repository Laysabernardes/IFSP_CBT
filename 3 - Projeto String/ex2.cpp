#include <iostream>
#include <string>
#include <locale.h>
using namespace std;

//Exercício 2  - Receber através de digitação uma mensagem. 
//Informar se esta mensagem é ou não um dado palíndromo (no caso de haver espaços no texto, desconsiderá-los para a verificação). Exemplos:
//  OVO
//  ARARA
//  SOCORRAM ME SUBI NO ONIBUS EM MARROCOS


// Recebe uma mensagem e verifica se é um palíndromo
int main(int argc, char** argv) {
    setlocale(LC_ALL, "");

    // Solicita ao usuário que digite uma mensagem para verificar se é um palíndromo
    string mensagem;
    cout << "Insira uma mensagem para verificar se é um palíndromo: ";
    getline(cin, mensagem);

    // Remove os espaços da mensagem
    string textoSemEspacos;
    for (char c : mensagem) {
        if (!isspace(c)) {
            textoSemEspacos += c;
        }
    }

    // Verifica se a mensagem sem espaços é um palíndromo
    bool palindromo = true;
    int tam = textoSemEspacos.length();
    for (int i = 0; i < tam / 2; i++) {
        if (tolower(textoSemEspacos[i]) != tolower(textoSemEspacos[tam - i - 1])) {
            palindromo = false;
            break;
        }
    }

    // Exibe o resultado da verificação
    if (palindromo) {
        cout << "A mensagem \"" << mensagem << "\" é um palíndromo." << endl;
    } else {
        cout << "A mensagem \"" << mensagem << "\" não é um palíndromo." << endl;
    }

    return 0;
}
