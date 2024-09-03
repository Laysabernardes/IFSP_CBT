#include <iostream>
#include <fstream>
#include <string>
using namespace std;

//Exercício 3 - À partir de uma lista de nomes disponível em um arquivo TXT, transforma-los em nomes no formato agenda telefônica. Exemplo:
//  José Antonio Santos Silva
//  Silva, José Antonio Santos

// Transforma uma lista de nomes em formato de agenda telefônica
int main() {
    // Abre o arquivo de entrada
    std::ifstream arquivoEntrada("nomes.txt");
    if (!arquivoEntrada.is_open()) {
        std::cout << "Erro ao abrir o arquivo de entrada." << std::endl;
        return 1;
    }

    // Abre ou cria o arquivo de saída
    std::ofstream arquivoSaida("nomes_agenda.txt");
    if (!arquivoSaida.is_open()) {
        std::cout << "Erro ao abrir ou criar o arquivo de saída." << std::endl;
        return 1;
    }

    // Lê os nomes do arquivo de entrada e os transforma em formato de agenda telefônica
    std::string nome;
    while (std::getline(arquivoEntrada, nome)) {
        // Encontra o último espaço para separar o último sobrenome
        size_t posUltimoEspaco = nome.find_last_of(' ');
        if (posUltimoEspaco == std::string::npos) {
            // Se não encontrar espaço, escreve o nome original no arquivo de saída
            arquivoSaida << nome << std::endl;
        } else {
            // Obtém o último sobrenome e o resto do nome
            std::string ultimoSobrenome = nome.substr(posUltimoEspaco + 1);
            std::string restoNome = nome.substr(0, posUltimoEspaco);

            // Formata o nome no formato "Último Sobrenome, Resto do nome"
            std::string nomeFormatado = ultimoSobrenome + ", " + restoNome;

            // Escreve o nome formatado no arquivo de saída
            arquivoSaida << nomeFormatado << std::endl;
        }
    }

    // Fecha os arquivos
    arquivoEntrada.close();
    arquivoSaida.close();

    std::cout << "Nomes formatados com sucesso!" << std::endl;

    return 0;
}
