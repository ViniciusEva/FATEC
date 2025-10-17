import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        listaSimples();
    }

    public static void listaSimples(){
        ArrayList<String> listaCompras = new ArrayList<>();

        //Adicionando elementos na Lista
        listaCompras.add("pão");
        listaCompras.add("café");
        listaCompras.add("Leite");
        listaCompras.add("Manteiga");

        //acessando um elemento da lista
        System.out.println(listaCompras.get(0));

        //removendo um elemento da lista
        listaCompras.remove(0);

        //Exibindo a lista
        System.out.println(listaCompras.toString());

        //obtendo o tamanho da lista
        System.out.println(listaCompras.size());

        //verificando se a lista está vazia
        System.out.println(listaCompras.isEmpty());


    }

    public static void listaEncadeada(){
        LinkedList<String> veiculo = new LinkedList<>();

        veiculo.add("Gol");
        veiculo.add("Uno");

        //Adicionando elementos no fim
        veiculo.addLast("HB20");
        veiculo.addLast("HRV");

        //Adicionando elementos no inicio
        veiculo.addFirst("Palio");
        veiculo.addFirst("Corsa");

        //Exibindo elementos
        System.out.println(veiculo.toString());

        //Removendo elementos da lista
        veiculo.removeLast();

        //no inicio
        veiculo.removeFirst();

        //uma posição específica
        veiculo.remove(0);

        //recuperando um veículo
        System.out.println(veiculo.get(0));

        //tamanho da lista
        System.out.println(veiculo.size());

        //limpando a lista
        veiculo.clear();
        System.out.println(veiculo.size());
    }
}