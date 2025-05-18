<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/listaProdutos" var="listaProdutos" />
<c:url value="/novoProduto" var="novoProduto" />

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="ISO-8859-1">
    <title>Créditos</title>
    <style>
        /* Reset básico */
        * {
            box-sizing: border-box;
        }

        body, html {
            margin: 0;
            padding: 0;
            height: 100%;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f4f8;
            display: flex;
            flex-direction: column;
        }

        /* Header fixo no topo */
        header {
            background-color: white;
            box-shadow: 0 2px 8px rgba(0,0,0,0.1);
            padding: 15px 30px;
            position: fixed;
            top: 0;
            left: 0;
            right: 0;
            height: 70px;
            display: flex;
            align-items: center;
            justify-content: space-between;
            z-index: 100;
        }

        header h1 {
            margin: 0;
            font-size: 24px;
            color: #2e7d32;
        }

        nav.menu a {
            text-decoration: none;
            color: #4CAF50;
            font-weight: 600;
            margin-left: 20px;
            transition: color 0.3s ease;
        }

        nav.menu a:hover {
            color: #388e3c;
        }

        /* Espaço para não ficar escondido atrás do header */
        main {
            flex: 1;
            margin-top: 90px; /* espaço para o header fixo */
            margin-bottom: 70px; /* espaço para footer */
            display: flex;
            justify-content: center;
            align-items: center;
        }

        /* Card centralizado */
        .card {
            background-color: white;
            padding: 40px 30px;
            border-radius: 16px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
            text-align: center;
            max-width: 400px;
            width: 100%;
        }

        .card h2 {
            margin-bottom: 25px;
            font-size: 28px;
            color: #2e7d32;
        }

        .card strong {
            display: block;
            margin: 10px 0;
            font-size: 18px;
            color: #4CAF50;
        }

        /* Botão voltar */
        .botao-voltar {
            display: inline-block;
            margin-top: 20px;
            background-color: #4CAF50;
            color: white;
            padding: 12px 24px;
            border: none;
            border-radius: 8px;
            font-size: 16px;
            cursor: pointer;
            text-decoration: none;
            transition: background-color 0.3s ease;
        }

        .botao-voltar:hover {
            background-color: #388e3c;
        }

        /* Footer fixo no rodapé */
        footer {
            background-color: white;
            box-shadow: 0 -2px 8px rgba(0,0,0,0.1);
            height: 50px;
            display: flex;
            justify-content: center;
            align-items: center;
            color: #4CAF50;
            font-weight: 600;
            position: fixed;
            bottom: 0;
            left: 0;
            right: 0;
            user-select: none;
            z-index: 100;
        }
    </style>
</head>
<body>
    <header>
        <a href="/produtos" style="text-decoration:none;">
            <h1>Sistemas web - TP02</h1>
        </a>
        <nav class="menu">
            <a href="${listaProdutos}">Lista de produtos</a>
            <a href="${novoProduto}">Criar Produto</a>
            <a href="/produtos/creditos.jsp">Créditos</a>
        </nav>
    </header>

    <main>
        <div class="card">
            <h2>Trabalho desenvolvido por:</h2>
            <strong>Laysa Bernardes</strong>
            <strong>Lucas Lopes</strong>

            <a href="${listaProdutos}" class="botao-voltar">Voltar para Lista de Produtos</a>
        </div>
    </main>

    <footer>
        Desenvolvido por Laysa Bernardes e Lucas Lopes
    </footer>
</body>
</html>
