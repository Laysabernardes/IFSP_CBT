<?php
session_start();

if (isset($_POST['nome'])) {
    // O formulário foi submetido, processar os dados aqui

    // Dados do Banco de Dados
    $servidor = "sql210.epizy.com";
    $usuario = "epiz_33892870";
    $senha = "K8TvD1n1kXMN8c";
    $banco = "epiz_33892870_encomenda";

    // Conexão com o Banco de Dados
    $conexao = mysqli_connect($servidor, $usuario, $senha, $banco);

    // Verifica se a conexão foi realizada com sucesso
    if (!$conexao) {
        die("Conexão falhou: " . mysqli_connect_error());
    }

    // Recupera os dados do formulário
    $nome = $_POST['nome'];
    $email = $_POST['email'];
    $telefone = $_POST['telefone'];
    $cor = $_POST['cor'];
    $mensagem = $_POST['mensagem'];
    $newsletter = isset($_POST['newsletter']) ? $_POST['newsletter'] : 'não';

    // Prepara a consulta SQL
    $sql = "INSERT INTO encomendas (nome, email, telefone, cor, mensagem, newsletter) VALUES ('$nome', '$email', '$telefone', '$cor', '$mensagem', '$newsletter')";

    // Executa a consulta SQL
    if (mysqli_query($conexao, $sql)) {
        $_SESSION['mensagem'] = "Encomenda salva com sucesso!";
    } else {
        echo "Erro ao salvar encomenda: " . mysqli_error($conexao);
    }

    // Fecha a conexão com o Banco de Dados
    mysqli_close($conexao);

    // Redireciona para a página encomenda.php
    header('Location: encomenda.php');
    exit;
}
