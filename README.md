# Sistema de Atendimento Versão 2.0
## Integrante

- Laysa Bernardes Campos da Rocha - CB3024873
-  Lucas Lopes Cruz - CB3025284

Disciplina de Estrutura de Dados I

## Descrição

Este projeto implementa a versão 2.0 de um sistema de atendimento, com um menu interativo que oferece cinco opções:

1. **Gerar senha**
2. **Abrir guichê**
3. **Realizar atendimento**
4. **Listar senhas atendidas**
5. **Sair**

## Funcionalidades
### 0. Sair
- Encerra o programa.
- O programa só poderá ser encerrado quando a fila de senhas geradas (`senhasGeradas`) estiver vazia.
- Ao encerrar, informa a quantidade total de senhas atendidas.

### 1. Gerar senha
- Incrementa o controle de senhas, gerando e enfileirando uma nova senha na fila `senhasGeradas`.
- Exibe a quantidade de senhas ainda aguardando atendimento.

### 2. Abrir guichê
- Adiciona um novo guichê a uma lista de guichês.
- Cada guichê é representado por uma estrutura (`struct`) que contém um ID e uma fila (`senhasAtendidas`) para armazenar as senhas atendidas por ele.
- Exibe a quantidade de senhas ainda aguardando atendimento e o número de guichês abertos.

### 3. Realizar atendimento
- Solicita a digitação do ID do guichê que está chamando a próxima senha.
- Enfileira a senha atendida na fila `senhasAtendidas` do respectivo guichê.
- Exibe a quantidade de senhas ainda aguardando atendimento.

### 4. Listar senhas atendidas
- Solicita a digitação do ID do guichê.
- Lista todas as senhas que foram atendidas pelo guichê especificado.

