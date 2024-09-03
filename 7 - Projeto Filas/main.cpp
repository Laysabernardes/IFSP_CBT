// Laysa Bernardes Campos da Rocha - CB3024873 e Lucas Lopes Cruz - CB3025284

#include <iostream>
using namespace std;

// Definição da estrutura do nó da fila
struct No {
    int dado; // Dado armazenado no nó
    No *prox; // Ponteiro para o próximo nó na fila
};

// Definição da estrutura da fila
struct Fila {
    No *ini; // Ponteiro para o primeiro nó da fila
    No *fim; // Ponteiro para o último nó da fila
};

// Função para inicializar a fila
Fila* init() {
    Fila *f = new Fila; // Aloca memória para a fila
    f->ini = NULL; // Inicializa o ponteiro de início com null
    f->fim = NULL; // Inicializa o ponteiro de fim com null
    return f; // Retorna a fila inicializada
}

// Função para verificar se a fila está vazia
bool isEmpty(Fila *f) {
    return (f->ini == NULL); // Retorna verdadeiro se o ponteiro de início for null
}

// Função para enfileirar um elemento na fila
void enqueue(Fila *f, int v) {
    No *no = new No; // Cria um novo nó
    no->dado = v; // Atribui o valor ao dado do nó
    no->prox = NULL; // Inicializa o próximo do nó como null

    if (isEmpty(f)) { // Se a fila estiver vazia
        f->ini = no; // O início da fila aponta para o novo nó
    } else {
        f->fim->prox = no; // Caso contrário, o próximo do último nó aponta para o novo nó
    }
    f->fim = no; // Atualiza o fim da fila para o novo nó
}

// Função para desenfileirar um elemento da fila
int dequeue(Fila *f) {
    if (isEmpty(f)) { // Verifica se a fila está vazia
        return -1; // Retorna -1 se a fila estiver vazia
    } else {
        No *no = f->ini; // Obtém o primeiro nó da fila
        int ret = no->dado; // Obtém o dado do primeiro nó
        f->ini = no->prox; // Atualiza o início da fila para o próximo nó
        if (f->ini == NULL) { // Se o início se tornar nulo (fila ficar vazia)
            f->fim = NULL; // Atualiza o fim da fila para nulo também
        }
        delete no; // Libera a memória do nó desenfileirado
        return ret; // Retorna o dado do nó desenfileirado
    }
}

// Função para contar o número de elementos na fila
int count(Fila *f) {
    int qtde = 0; // Inicializa a variável para contar os elementos
    No *no = f->ini; // Começa do início da fila

    while (no != NULL) { // Percorre todos os nós da fila
        qtde++; // Incrementa o contador
        no = no->prox; // Move para o próximo nó
    }
    return qtde; // Retorna a quantidade de elementos na fila
}

// Função para liberar a memória alocada para a fila
void freeFila(Fila *f) {
    No *no = f->ini; // Começa do início da fila

    while (no != NULL) { // Enquanto houver nós na fila
        No *temp = no->prox; // Guarda o próximo nó
        delete no; // Libera a memória do nó atual
        no = temp; // Move para o próximo nó
    }
    delete f; // Libera a memória da estrutura da fila
}

// Função principal
int main() {
    Fila *senhasGeradas = init(); // Inicializa a fila de senhas geradas
    Fila *senhasAtendidas = init(); // Inicializa a fila de senhas atendidas
    int opcao; // Variável para armazenar a opção do usuário
    int senhaAtual = 0; // Variável para controlar o número da próxima senha a ser gerada

    do {
        // Menu de opções
        cout << "Selecione uma opcao:\n";
        cout << "0. Sair\n";
        cout << "1. Gerar senha\n";
        cout << "2. Realizar atendimento\n";
        cout << "Senhas aguardando atendimento: " << count(senhasGeradas) << "\n"; // Exibe a quantidade de senhas na fila de geradas
        cin >> opcao; // Lê a opção do usuário

        switch(opcao) {
            case 0:
                if (!isEmpty(senhasGeradas)) { // Verifica se há senhas aguardando atendimento
                    cout << "Ainda existem senhas aguardando atendimento. Continue o atendimento antes de sair.\n"; // Mensagem de aviso
                    opcao = -1; // Para evitar sair do loop se houver senhas aguardando
                } else {
                    cout << "Quantidade de senhas atendidas: " << count(senhasAtendidas) << "\n"; // Exibe a quantidade de senhas atendidas ao sair
                }
                break;
            case 1:
                senhaAtual++; // Incrementa o número da senha atual
                enqueue(senhasGeradas, senhaAtual); // Enfileira a nova senha gerada
                cout << "Senha gerada: " << senhaAtual << "\n"; // Exibe a senha gerada
                break;
            case 2:
                if (!isEmpty(senhasGeradas)) { // Verifica se há senhas para atendimento
                    int senha = dequeue(senhasGeradas); // Desenfileira a próxima senha a ser atendida
                    enqueue(senhasAtendidas, senha); // Enfileira a senha na fila de senhas atendidas
                    cout << "Atendendo senha: " << senha << "\n"; // Exibe a senha que está sendo atendida
                } else {
                    cout << "Nao ha senhas para atendimento.\n"; // Mensagem de aviso se não houver senhas para atendimento
                }
                break;
            default:
                cout << "Opcao invalida. Tente novamente.\n"; // Mensagem de opção inválida
                break;
        }
    } while (opcao != 0); // Continua o loop até o usuário escolher sair

    freeFila(senhasGeradas); // Libera a memória da fila de senhas geradas
    freeFila(senhasAtendidas); // Libera a memória da fila de senhas atendidas

    return 0; // Retorna 0 para indicar que o programa terminou com sucesso
}