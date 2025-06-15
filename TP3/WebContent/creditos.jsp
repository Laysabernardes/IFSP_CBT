<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Creditos</title>
	    <style>
        * {
            padding: 0;
            margin: 0;
            outline: none;
            box-sizing: border-box;
        }

        body {
            display: flex;
            background: #ebe3aa;
            flex-direction: column;
            justify-content: space-between;
            height: 100vh;
            font-family: Arial, sans-serif;
            color: #5d4157;
        }

        header {
            background-color: #a8caba;
            overflow: hidden;
            padding: 10px 20px;
            text-align: left;
            color: #5d4157;
            font-size: 22px;
            font-weight: bold;
        }

        nav {
            display: flex;
            align-items: center;
            justify-content: space-between;
        }

        h1 {
            color: #5d4157;
        }

        nav a {
            color: #5d4157;
            text-align: center;
            padding: 10px 16px;
            text-decoration: none;
            font-size: 17px;
            transition: color 0.3s;
        }

        nav a:hover {
            color: #838689;
        }

        li {
            font-size: 18px;
        }

        footer {
            background-color: #f2f2f2;
            color: #838689;
            padding: 10px;
            text-align: right;
        }

        main {
            align-items: center;
            display: flex;
            justify-content: center;
            flex-direction: column;
            flex: 1;
        }

        h2 {
            color: #5d4157;
            font-size: 36px;
            margin-bottom: 20px;
        }

        strong {
            font-size: 20px;
        }

        .obs, ol {
            font-size: 18px;
            max-width: 800px;
        }

        form {
            display: flex;
            flex-direction: column;
            gap: 15px;
            padding-top: 30px;
            width: 100%;
            max-width: 500px;
        }

        input {
            font-size: 16px;
            width: 100%;
            padding: 8px;
            border-radius: 5px;
            outline: none;
            border: 1px solid #838689;
            margin-top: 5px;
        }

        input[type="submit"] {
            background-color: #838689;
            color: white;
            border: none;
            cursor: pointer;
            font-weight: bold;
            text-transform: uppercase;
            padding: 10px;
        }

        table {
            border-collapse: collapse;
            width: 100%;
            max-width: 800px;
            margin: 15px auto;
            background-color: white;
        }

        th {
            background-color: #838689;
            color: white;
            padding: 10px;
            border: 1px solid #5d4157;
        }

        td {
            background-color: #a8caba;
            padding: 10px;
            border: 1px solid #5d4157;
        }

        caption {
            margin-bottom: 10px;
        }

        a {
            color: #5d4157;
        }

        a:hover {
            color: #838689;
        }
        
        footer{
        	background: #a8caba;
        	color: #5d4157;
    
        }
    </style>
</head>
<body>
	<header>
		<center>
		<nav class="menu">
			<a href="/Bookstore">
				<h1>Sistemas web - TP03</h1>
			</a>
			<div>
				<a href="/Bookstore/list">Lista de livros</a>
				<a href="/Bookstore/new">Adicionar Livro</a>
				<a href="/Bookstore/creditos.jsp">Creditos</a>
			</div>
		</nav>
		</center>
	</header>
	
	<main>
			<h2>Trabalho desenvolvido por:</h2>
			
			<br/>
			<br/>
			<br/>
			<br/>
			
			<strong>Laysa Bernardes</strong><br/>
			<strong>Lucas Lopes</strong>
	</main>
	
	<footer>
		Desenvolvido por Laysa Bernardes e Lucas Lopes
	</footer>
</body>
</html>