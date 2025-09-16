<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/listaProdutos" var="listaProdutos" />
<c:url value="/novoProduto" var="novoProduto" />

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="ISO-8859-1">
    <title>Home</title>
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
            margin:0px 20px;
            transition: color 0.3s ease;
        }
        nav.menu a:hover {
            color: #388e3c;
        }
        main {
            flex: 1;
            margin: 90px auto 70px auto;  /* Corrigido para centralizar */
            padding: 20px 30px;
            max-width: 900px;
            background-color: white;
            border-radius: 12px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.1);
        }
        h2 {
            color: #2e7d32;
            margin-bottom: 20px;
            text-align: center;
        }
        ol {
            padding-left: 20px;
            color: #333;
            font-size: 16px;
        }
        ol li {
            margin-bottom: 10px;
        }
        .obs {
            display: block;
            font-style: italic;
            color: #666;
            margin-top: 20px;
            margin-bottom: 20px;
            font-size: 14px;
            line-height: 1.4;
            border-left: 4px solid #4CAF50;
            padding-left: 10px;
            background-color: #f9fdf9;
            border-radius: 4px;
        }
        img {
            display: block;
            max-width: 100%;
            height: auto;
            margin: 20px auto 0 auto;
            border-radius: 8px;
            box-shadow: 0 5px 15px rgba(0,0,0,0.1);
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
        /* Responsividade */
        @media(max-width: 600px) {
            header h1 {
                font-size: 20px;
            }
            nav.menu a {
                margin-left: 10px;
                font-size: 14px;
            }
            main {
                padding: 15px 20px;
                font-size: 14px;
            }
            ol {
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
        <h2>Enunciado:</h2>

        <ol>
            <li>Obrigatório o nome da dupla nos arquivos .java na forma de comentários.</li>
            <li>Deverá entregar o projeto em forma compactada (toda a pasta) ou então através de endereço no GITHUB informado no email até a data combinada.</li>
            <li>Mandar junto um print da aplicação.</li>
            <li>Criar um menu que direcione o usuário quando ele iniciar a aplicação (index.html ou index.jsp)</li>
            <li>Diferencial: Criar uma página específica para créditos da dupla.</li>
        </ol>

        <span class="obs">Para este exercício usar como base o material apresentado na aula 06 de SWII5,
            criar uma aplicação completa (CRUD), com um banco de dados em memória (solução
            semelhante a apresentada na classe Banco.java) para a entidade PRODUTOS abaixo
            apresentada:
        </span>

        <img alt="tabela com as props de produto" src="img.png" />
    </main>

    <footer>
        Desenvolvido por Laysa Bernardes e Lucas Lopes
    </footer>
</body>
</html>
