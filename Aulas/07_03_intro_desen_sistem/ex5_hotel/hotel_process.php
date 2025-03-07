<?php
    $nome = $_GET["nome"];
    $apartamento = $_GET["apartamento"];
    $apartam_A = 150;
    $apartam_B = 100;
    $apartam_C = 75;
    $apartam_D = 50;
    $diaria = $_GET["diaria"];

    if($apartamento = "A"){
        $diaria_total = $diaria * $apartam_A;
    }else if($apartamento = "B"){
        $diaria_total = $diaria 8 $apartam_B;
    }else if($apartamento = "C"){
        $diaria_total = $diaria 8 $apartam_C;
    }else if($apartamento = "D"){
        $diaria_total = $diaria 8 $apartam_D;
    }else{
        echo "Opção Inválida";
    }

    echo "Valor Total das Diárias: ". 


