<?php
//1° Recuperar as informações do formulário
//$variavel_que_recebe_o_valor = $_GET["nome do campo name do form"]
$num1 = $_GET["num1"];
$num2 = $_GET["num2"];
$operacao = $_GET["operacao"];

if($operacao == "soma"){
    $resultado = $num1 + $num2;
    echo "O resultado da soma é: ". $resultado;
}else if($operacao == "subtracao"){
    $resultado = $num1 - $num2;
    echo "O resultado da subtração é: ". $resultado;
}else if($operacao == "divisao"){
    if($num2 == 0){
        echo "Não é possível realizar está operação";
    }
    else{
        $resultado = $num1 / $num2;
        echo "O resultado da divisão é: ". $resultado;
    }
}else if($operacao == "multiplicacao"){
    $resultado = $num1 * $num2;
    echo "O resultado da multiplicação é: ". $resultado;
}










//teste opcional
//echo $num1 . "<br><br>" . $num2 . "<br><br>" . $operacao;

//$resultado = $num1 + $num2;

//echo "A soma do valor 1: ". $num1 . " + o valor 2: ". $num2. " é = ". $resultado;  // o ponto final é a concatenação
//echo $resultado;  //imprime o resultado