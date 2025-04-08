<?php
    //Declarar variáveis com as informações do servidor
    $server = "sge_fatec.mysql.dbass.com.br";
    $server_user = "sge_fatec";
    $server_password = "Fatec25ADS!";
    $database_name = "sge_fatec";

    //Declarar uma variável para receber a função de conexão com o Banco de Dados (XAMPP)
    $conexao = mysqli_connect($server,$server_user,$server_password,$database_name);
?>