<?php
    $idade = $_GET["idade"];

    if($idade < 1 or $idade > 120){
        echo "idade inválida";
    }else if($idade < 16){
        echo "Não eleitor";
    }else if($idade >= 18 and $idade <=65){
        echo "Eleitor Obrigatório";
    }else{
        echo "Eleitor Facultativo";
    }