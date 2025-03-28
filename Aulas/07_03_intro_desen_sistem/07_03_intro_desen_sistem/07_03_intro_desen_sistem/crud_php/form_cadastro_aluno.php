<!-- INSERT INTO `sge_alunos` (`id_aluno`, `nome_aluno`, `email_aluno`, `celular_aluno`) VALUES ('1', 'vinicius', 'vinicius.souza160@fatec.sp.gov.br', '(11)93045-8346'); -->
<?php require_once "header.php"; ?>

<h3>Formulário de Cadastro</h3>
<a href="index.php"><img src="images\icons\voltar.png" alt="voltar"></a>
<form action="cadastro_aluno.php" method="post">
    <label for="nome_aluno">Nome: </label>
    <input type="text" name="nome_aluno" id="nome_aluno"> <br>

    <label for="email_aluno">Email: </label>
    <input type="text" name="email_aluno" id="email_aluno"> <br>

    <label for="celular_aluno">Celular: </label>
    <input type="text" name="celular_aluno" id="celular_aluno"> <br>

    <input type="submit" value="Cadastrar Aluno">
</form>

<?php include_once "footer.php"; ?>