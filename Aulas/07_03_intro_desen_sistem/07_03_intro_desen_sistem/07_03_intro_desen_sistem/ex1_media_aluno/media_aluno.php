<?php
    //Receber a média informada pelo formulário

    $media_aluno = $_GET['media_aluno'];

    if($media_aluno >= 0 and $media_aluno <= 10){
        if($media_aluno >= 5){
            echo "Aluno Aprovado";
        }else if ($media_aluno < 3){
            echo "Reprovado";
        }else{
            echo "Exame";
        }
    }else{
        echo "Média Inválida";
    }