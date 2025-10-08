public class App{
    public static void main(String[] args) throws Exception {
        Aluno a = new Aluno("Francisco",18);
        Aluno a1 = new Aluno("Thiago",18);

        a.setNota(5);
        a1.setNota(8);

        System.out.println("Nome: "+a.getNome());
        System.out.println("Situação: "+a.aprovado());

        System.out.println("Nome: "+a1.getNome());
        System.out.println("Situação: "+a1.aprovado());
    }
}