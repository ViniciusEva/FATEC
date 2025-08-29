import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //Declaração de um vetor de inteiros comtamanho 5
        int[] meu_array = new int[5];

        //Inicialização do vetor
        meu_array[0] = 10;
        meu_array[1] = 20;
        meu_array[2] = 30;
        meu_array[3] = 40;
        meu_array[4] = 50;

        //Exibindo o conteúdo de uma determinada posição
        System.out.println(meu_array[0]);
        System.out.println(meu_array[1]);

        //Recuperando o conteúdo de array de uma determinada posiçãp
        int e1 = meu_array[0];
        int e2 = meu_array[1];

        System.out.println("O Conteúdo: "+e1);
        System.out.println("O Conteúdo: "+e2);

        //Percorrer um array sequencial
        for(int i = 0; i < meu_array.length; i++){
            System.out.println("A posição "+i);
            System.out.println("O Elemento "+ meu_array[i]);
        }

        //criando um array de tamanho implicito
        String[] alunos = {"Rafael","Gabriel","Guilherme","Giovana"};

        //percorrendo um array (sequencialmente) - for each
        for(String aluno:alunos){
            System.out.println(aluno);
        }
        //realizando um print no vetor
        System.out.println(Arrays.toString(alunos));

        //Quantidades de elementos que há no vetor: length
        System.out.println(alunos.length);

        //Clone de um vetor: clone
        String[] copia = alunos.clone();

        //Copiando uma parte do vetor para outro: copyof
        String[] copia_parcial = Arrays.copyOf(alunos,2);
        System.out.println(Arrays.toString(copia_parcial));

        //ordenando valores dentro do array
        Arrays.sort(alunos);
        System.out.println(Arrays.toString(alunos));
    }
}
