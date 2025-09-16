<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/listaProdutos" var="listaProdutos" />
<c:url value="/novoProduto" var="novoProduto" />
<c:url value="/alteraProduto" var="linkServletAlterarProduto" />

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="ISO-8859-1">
    <title>Alterar produto</title>
    <style>
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

        main {
            flex: 1;
            margin-top: 90px; /* espaço para o header fixo */
            margin-bottom: 70px; /* espaço para footer */
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
        }

        .card {
            background-color: white;
            padding: 40px 30px;
            border-radius: 16px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
            max-width: 450px;
            width: 100%;
        }

        .card h2 {
            margin-bottom: 25px;
            font-size: 28px;
            color: #2e7d32;
            text-align: center;
        }

        form label {
            display: block;
            margin-bottom: 15px;
            font-weight: 600;
            color: #333;
        }

        form input[type="text"],
        form input[type="number"] {
            width: 100%;
            padding: 8px 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 6px;
            font-size: 16px;
            transition: border-color 0.3s ease;
        }

        form input[type="text"]:focus,
        form input[type="number"]:focus {
            border-color: #4CAF50;
            outline: none;
        }

        form input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 8px;
            padding: 12px 24px;
            font-size: 16px;
            cursor: pointer;
            margin-top: 20px;
            width: 100%;
            transition: background-color 0.3s ease;
        }

        form input[type="submit"]:hover {
            background-color: #388e3c;
        }

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
            <h2>Alterar produto:</h2>

            <form action="${linkServletAlterarProduto}" method="post">
                <label>Nome:
                    <input type="text" name="nome" value="${ produto.nome }" required/>
                </label>
                <label>Unidade Compra:
                    <input type="number" name="unidadeCompra" value="${ produto.unidadeCompra }" required/>
                </label>
                <label>Descrição:
                    <input type="text" name="descricao" value="${ produto.descricao }" required/>
                </label>
                <label>Qtd Previsto Mes:
                    <input type="number" name="qtdPrevistoMes" value="${ produto.qtdPrevistoMes }" required/>
                </label>
                <label>Preço Max Comprado:
                    <input type="number" name="precoMaxComprado" value="${ produto.precoMaxComprado }" required step="0.01" />
                </label>

                <input type="hidden" name="id" value="${ produto.id }" />

                <input type="submit" value="Alterar" />
            </form>
        </div>
    </main>

    <footer>
        Desenvolvido por Laysa Bernardes e Lucas Lopes
    </footer>
</body>
</html>
