# TRABALHO PRÁTICO 04

**Aluna:** Laysa Bernardes Campos da Rocha - CB3024873

**Aluno:** Lucas Lopes Cruz - CB3025284

Obs: O vídeo demonstrando o funcionamento da aplicação esta listado abaixo.

# Cookie - Projeto Web: Preferência de Cotação de Moedas

## 1. Descrição do Projeto

Este projeto implementa e estende um exemplo de manipulação de Cookies com Java Servlets. A base da aplicação demonstra o uso da seguinte API de Servlets para manipulação de cookies:

* **`HttpServletRequest#getCookies()`**, que retorna um array contendo os objetos `Cookie` enviados por um navegador web.
* **`HttpServletResponse#addCookie(Cookie cookie)`**, que adiciona o cookie especificado à resposta para que o navegador web possa armazená-lo.
* Criação de um objeto **`Cookie`** e o entendimento de seus métodos.

O exemplo recupera e armazena um cookie contendo a informação de um par de moedas selecionado pelo usuário (ex: USD/EUR), que é usado para exibir a taxa de câmbio correspondente entre as múltiplas requisições.

Além da funcionalidade base de Cookies, este trabalho evolui integra um **banco de dados MySQL** para persistir as preferências do usuário de forma permanente, utilizando o padrão de arquitetura DAO (Data Access Object).

# ✨ Teste 
![Teste Funcionando](./tp4.gif)
