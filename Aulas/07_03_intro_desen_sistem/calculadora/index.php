<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora</title>
</head>
<body>
    <h2>Informe dois números para realizar uma operação matemática</h2>
    <form action="calcular.php" method="get">
        <label for="num1">Valor 1: </label>
        <input type="number" name="num1" id="num1"><br><br>
        <label for="num2">Valor 2:</label>
        <input type="number" name="num2" id="num1"><br><br>
        <label for="operacao">Informe a operação matemática: </label>
        <select name="operacao" id="operacao">
            <option value="soma">Soma</option>
            <option value="subtracao">Subtração</option>
            <option value="divisao">Divisão</option>
            <option value="multiplicacao">Multiplicação</option>
        </select>
        <input type="submit" value="Calculator">
    </form>
</body>
</html>