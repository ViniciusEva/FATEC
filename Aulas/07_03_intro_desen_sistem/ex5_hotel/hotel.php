<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hospedagem</title>
</head>
<body>
    <form action="hotel_process.php" method="get">
        <select name="apartamento" id="apartamento">
            <option value="A">Apartamento A = R$150,00</option>
            <option value="B">Apartamento B = R$100,00</option>
            <option value="C">Apartamento C = R$75,00</option>
            <option value="D">Apartamento D = R$50,00</option>
        </select> <br>
        <label for="nome">Informe o seu nome: </label>
        <input type="text" name="nome" id="nome"> <br>
        <label for="diaria">Informe o numero de diárias: </label>
        <input type="number" name="diaria" id="diaria"> <br>

        <label for="consumo_interno">informe o valor de consumo: </label>
        <input type="number" name="consumo_interno" id="consumo_interno">

        <input type="submit" value="Agendar">
    </form>
</body>
</html>