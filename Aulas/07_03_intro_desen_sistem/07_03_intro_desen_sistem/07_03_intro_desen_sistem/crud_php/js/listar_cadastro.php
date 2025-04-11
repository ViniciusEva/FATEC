<?php 
    //Importar o arquivo de conexão com o banco de dados
    require "database.php";
    //Importar o módulo de cabeçalho da página
    require_once "header.php"; 

    //Comando em SQL
    $sql_listar = "SELECT * FROM sge_alunos";

    //Conecta ao BD e executar o comando em SQL
    $consulta_bd = mysqli_query($conexao, $sql_listar);


?>

<main>
    <table border="1px">
        <thead>
            <tr>
                <th>Nome:</th>
                <th>E-mail:</th>
                <th>Celular:</th>
            </tr>
        </thead>
        <tbody>
            <?php while($dados_db = mysqli_fetch_assoc($consulta_bd)):?>
            <tr>
                <td><?php echo $dados_db['nome_aluno']?></td>
                <td><?php echo $dados_db['email_aluno']?></td>
                <td><?php echo $dados_db['celular_aluno']?></td>

            </tr>
            <?php endwhile; ?>
        </tbody>
    </table>
</main>

<?php require "footer.php"; ?>