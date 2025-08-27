public class App {
    public static void main(String[] args) throws Exception {
        //Toda vez que precisamos utilizar uma classe é necessário CRIAR UM OBJETO

    Aluno a = new Aluno(1,239666777,930223344,"13/03/20","viny", "vinicius000@gmail.com"); //OBJETO

    

    //É necessário mencionar o nome do objeto para utilizar-la
    //nomeObjeto.variável
    //nomeObjeto.metodo ->Public
    // a.nome = "Vinicius Evangelista";
    

    //re-atribuir o valor

    a.setNome(null);
    // a.setNome("Vinicius Evangelista");
    a.exibirDados();
    System.out.println(a.getNome());
    }
}
