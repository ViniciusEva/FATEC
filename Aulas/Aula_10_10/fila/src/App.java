import java.util.LinkedList;
import java.util.Queue;


public class App {
    public static void main(String[] args) throws Exception {
        Queue<String> veiculos = new LinkedList<>();

        //Adicionando veículos da fila
        veiculos.offer("Corsa");
        veiculos.offer("Astra");
        veiculos.offer("Uno");
        veiculos.offer("Kwid");
        veiculos.offer("Mobi");

        //Visualizar o primeiro elemento da fila
        System.out.println("1° veículo da fila: "+veiculos.peek());

        //Remover o elemento da Fila
        System.out.println("Veiculo removido: "+veiculos.poll());

        //Verificar se a fila esta vazia
        System.out.println("A fila esta vazia? "+veiculos.isEmpty());

        //verifica o tamanho da fila
        System.out.println("Tamanho da fila: "+veiculos.size());

        //Percorrer uma fila
        int i = 1;
        for(String veiculo: veiculos){
            System.out.println("Posição da fila: ["+i+"]"+veiculo);
            i++;
        }

    }
}
