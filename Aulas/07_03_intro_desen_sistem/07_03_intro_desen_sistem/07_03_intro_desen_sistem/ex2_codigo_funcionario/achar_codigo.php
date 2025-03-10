<?php

    $achar_codigo = $_GET["achar_codigo"];

    if($achar_codigo == 1){
        echo "Escriturário";
    }else if($achar_codigo == 2){
        echo "Secretária";
    }else if($achar_codigo == 3){
        echo "Caixa";
    }else if ($achar_codigo == 4){
        echo "Gerente";
    }else if($achar_codigo == 5){
        echo "Diretor";
    }else{
        echo "Código Inválido";
    }