public class App {
    public static void main(String[] args) throws Exception {
        Arvore<String> a = new Arvore<String>("José");
        No<String> n1 = new No<String>("Fernando");
        No<String> n2 = new No<String>("Maria");

        a.getRaiz().addFilho(n1);
        a.getRaiz().addFilho(n2);

        No<String> n3 = new No<String>("Enzo");
        No<String> n4 = new No<String>("Letícia");
        No<String> n5 = new No<String>("Paloma");

        No<String> n6 = new No<String>("Erick");
        No<String> n7 = new No<String>("Fernanda");

        n1.addFilho(n3);
        n1.addFilho(n4);
        n1.addFilho(n5);
        n1.addFilho(n6);
        n1.addFilho(n7);


        System.out.println("Pré-Ordem: ");
        a.preOrdem();

        System.out.println("Pós-Ordem: ");
        a.posOrdem();
    }
}
