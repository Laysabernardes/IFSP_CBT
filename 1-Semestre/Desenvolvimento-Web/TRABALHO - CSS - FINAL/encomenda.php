<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=5">
    <meta name="description" content="Encomende agora uma peça totamente personalizada e única com o Atelie Simone Rocha">

    <meta name="keywords" content="preço tapete de croche do relampago mcqueen, preço tapete de croche do rei leão, preço jogo de tapete de crochê da minnie">

    <link rel="shortcut icon" href="imagem/croche.png" type="image/x-icon">

    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/header.css">
    <link rel="stylesheet" href="css/footer.css">
    <link rel="stylesheet" href="css/sousplat.css">


    <!-- Google tag (gtag.js) -->
		<script async src="https://www.googletagmanager.com/gtag/js?id=G-68P5GZ19QK"></script>
		<script>
	  		window.dataLayer = window.dataLayer || [];
	  		function gtag(){dataLayer.push(arguments);}
	  		gtag('js', new Date());
			gtag('config', 'G-68P5GZ19QK');
	    </script>

    <!--Bootstrap-->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <title>Encomendas</title>
</head>
<body id="topo">

        <?php
			session_start();
			if (isset($_SESSION['mensagem'])) {
				echo '<p>' . $_SESSION['mensagem'] . '</p>';
				unset($_SESSION['mensagem']);
			}
		?>

		<iframe src="header.html" frameborder="0" scrolling="no" id="meu-iframe"></iframe>	
		<br>

		 <h1>Faça sua Encomenda: </h1> 
		 		<p>Preecha o <b>formulario</b> para adiquirir uma malhavilhosa peça de crôche. É não se preocupe, este formulário é apenas um contato inicial, e tem como intuito o controle de demanda. Logo mais, entraremos em contato para conversarmos sobre mais detalhes, fornecer explicações e tirar duvidas sobre sua peça.</p>

        <form action="recebe-formulario.php" method="post" style="margin-left:135px">

            <label for="nome_id">Nome: </label>
                <input
                    id="nome_id" 
                    type="text" 
                    name="nome"
                    placeholder="Insira seu nome."
                    required><br>
                
            <label for="email_id">Email: </label>
                <input
                    id="email_id" 
                    type="email" 
                    name="email"
                    placeholder="Insira seu e-mail."
                    required><br>

            <label for="telefone_id">Telefone: </label>
                <input
                    id="telefone_id" 
                    type="tel" 
                    name="telefone"
                    placeholder="Insira seu telefone."
                    required><br>	

            <label for="cor_id">Cor da Peça: </label>
            <input id="cor_id" name="cor" type="color"><br><br>

            <label for="mensagem_id">Descreva como quer sua peça: </label><br>
                <textarea 
                    id="mensagem_id" 
                    name="mensagem"
                    rows="5"
                    cols="50"
                    maxlength="300"
                    placeholder="Descreva como quer sua peça:"
                    required
                ></textarea><br>

            <input 
                id="cm_id" 
                type="checkbox" 
                value="sim" 
                name="newsletter" 
                checked>
                <label for="cm_id">Deixe a caixa marcada para receber nossos e-mails </label><br>

            <input type="submit" value="Enviar">
        </form>  

        <button id="btn-topo">
            <img src="imagem/seta3.png" alt="voltar ao topo" style="float:left; width:50px;height: 40px;">
        </button>

        <script>
            var btnTopo = document.getElementById("btn-topo");
            btnTopo.addEventListener("click", function() {
                window.scrollTo({
                    top: 0,
                    behavior: "smooth"
                });
                });
        </script>
		<!--Footer-->
        <iframe src="footer.html" style="width: 100%;" frameborder="0" scrolling="no" id="meu-iframe"></iframe>
	</body>
</html>