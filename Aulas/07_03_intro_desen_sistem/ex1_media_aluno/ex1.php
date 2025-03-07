<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de  Exercício - Ex-1</title>
</head>
<body>
    <h2>Algoritmo para Calcular a Média</h2>
    <p>1 - Criar um algoritmo que receba a média de um aluno e mostre a situação do aluno: <br>
    a - Aprovado -> média maior ou igual a 5 <br>
    b - Exame -> média entre 3 e 5 <br>
    c - Reprovado -> media menor do que 3 <br>
    </p>
    <form action="media_aluno.php" method="get">
        <label for="media_aluno">Média do aluno: </label>
        <input type="number" name="media_aluno" id="media_aluno">

        <input type="submit" value="Calcular a situação do aluno">
    </form>
</body>
</html>