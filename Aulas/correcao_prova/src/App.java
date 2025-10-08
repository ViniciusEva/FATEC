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


        //


        Produto p1 = new Produto("Coxinha", 10);
        Produto p2 = new Produto("Coquinha", 15);

        p1.setPreco(6.00);
        p2.setPreco(2.00);

        System.out.println("Produto: "+p1.getNome());
        System.out.println("Valor Total R$ "+p1.calcularTotal());
        System.out.println("Produto "+p2.getNome());
        System.out.println("Valor Total R$ "+p2.calcularTotal());
    }
}