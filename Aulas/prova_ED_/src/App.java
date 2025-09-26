public class App {
    public static void main(String[] args) throws Exception {
        //Criação do Objeto
        Aluno a = new Aluno(0, null, null, 0, 0, null);

        a.setNome(null);
        a.exibirDados();
        System.out.println(a.getNome());
    }
}
