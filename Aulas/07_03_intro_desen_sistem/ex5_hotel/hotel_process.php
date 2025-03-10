<?php
    $nome = $_GET["nome"];
    $apartamento = $_GET["apartamento"];
    $apartam_A = 150;
    $apartam_B = 100;
    $apartam_C = 75;
    $apartam_D = 50;
    $diaria = $_GET["diaria"];
    $consumo_interno = $_GET["consumo_interno"];
    

    if($apartamento = "A"){
        $diaria_total = $diaria * $apartam_A;
        $valor_unitario = 150;
    }else if($apartamento = "B"){
        $diaria_total = $diaria * $apartam_B;
        $valor_unitario = 100;
    }else if($apartamento = "C"){
        $diaria_total = $diaria * $apartam_C;
        $valor_unitario = 75;
    }else if($apartamento = "D"){
        $diaria_total = $diaria * $apartam_D;
        $valor_unitario = 50;
    }else{
        echo "Opção Inválida";
    }
    $subtotal = $diaria_total + $consumo_interno;
    $taxa_de_serviço = $subtotal * 0.1;
    $total_geral = $subtotal + $taxa_de_serviço;

    echo "Valor Total das Diárias: ". $diaria_total . "<br>";
    echo "Valor do Subtotal: ". $subtotal . "<br>";
    echo "Taxa de Serviço: ". $taxa_de_serviço . "<br>";
    echo "Valor Geral: ". $total_geral . "<br>";

    echo "====================================Informações====================================" . "<br>";
    echo "Nome: ". $nome . "<br>";
    echo "Diárias: ". $diaria . "<br>";
    echo "Consumo Interno: " . $consumo_interno . "<br>";
    echo "Valor Unitário: " . $valor_unitario . "<br>";
    echo "Valor total das diárias: " . $diaria_total . "<br>";
    echo "Subtotal: " . $subtotal . "<br>";
    echo "Taxa de Serviço: " . $taxa_de_serviço . "<br>";
    echo "Total Geral: " . $total_geral . "<br>";



