<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/listaProdutos" var="listaProdutos" />
<c:url value="/novoProduto" var="novoProduto" />

<c:url value="/alteraProduto" var="linkAlteraProduto"/>
<c:url value="/removeProduto" var="linkRemoverProduto"/>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="ISO-8859-1">
    <title>Lista produtos</title>
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
            text-decoration: none;
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
            padding: 20px 30px;
            overflow-x: auto;
        }
        h2 {
            color: #2e7d32;
            margin-bottom: 20px;
            text-align: center;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            background-color: white;
            border-radius: 12px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.1);
            overflow: hidden;
        }
        thead {
            background-color: #4CAF50;
            color: white;
        }
        th, td {
            padding: 12px 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        tbody tr:hover {
            background-color: #f1f9f1;
        }
        a {
            color: #4CAF50;
            font-weight: 600;
            text-decoration: none;
            transition: color 0.3s ease;
        }
        a:hover {
            color: #388e3c;
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
        /* Responsividade simples */
        @media(max-width: 600px) {
            th, td {
                padding: 8px 10px;
                font-size: 14px;
            }
            header h1 {
                font-size: 20px;
            }
            nav.menu a {
                margin-left: 10px;
                font-size: 14px;
            }
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
        <h2>Lista de produtos:</h2>

        <table>
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Descrição</th>
                    <th>Unidade Compra</th>
                    <th>Qtd Previsto Mes</th>
                    <th>Preço Max Comprado</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${produtos}" var="produto">
                    <tr>
                        <td>${produto.nome}</td>
                        <td>${produto.descricao}</td>
                        <td>${produto.unidadeCompra}</td>
                        <td>${produto.qtdPrevistoMes}</td>
                        <td>${produto.precoMaxComprado}</td>
                        <td><a href="${linkAlteraProduto}?id=${produto.id}">Editar</a></td>
                        <td><a href="${linkRemoverProduto}?id=${produto.id}">Remover</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </main>

    <footer>
        Desenvolvido por Laysa Bernardes e Lucas Lopes
    </footer>
</body>
</html>
