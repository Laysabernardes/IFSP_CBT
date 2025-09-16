<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Documento sem título</title>
</head>

<body>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {

  // Verifica se o arquivo foi enviado com sucesso
  if (isset($_FILES["upload"]) && $_FILES["upload"]["error"] == UPLOAD_ERR_OK) {
    $tmp_name = $_FILES["upload"]["tmp_name"];
    $name = $_FILES["upload"]["name"];

    // Move o arquivo para o diretório desejado
    move_uploaded_file($tmp_name, "upload/" . $name);

    // Exibe uma mensagem de sucesso
    echo "Arquivo enviado com sucesso!<br>";
  } else {
    // Exibe uma mensagem de erro
    echo "Ocorreu um erro ao enviar o arquivo.<br>";
  }
   
  // Exibe os valores enviados pelo formulário
  echo $_POST['campo1'] . "<br>";
  echo $_POST['campo2'] . "<br>";
  echo $_POST['campo4'] . "<br>";
  echo $_POST['placa'] . "<br>";
  echo $_POST['cep'] . "<br>";
}
?>

</body>
</html>

