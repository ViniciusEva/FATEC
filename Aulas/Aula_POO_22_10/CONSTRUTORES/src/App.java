import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        TiposPrimitivos();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int a = sc.nextInt();

        System.out.println("Digite um numero: ");
        int b = sc.nextInt();

        //OpAritmeticos(a, b);
        OpLogicos();
        
    }

    public static void TiposPrimitivos(){
        //inteiros
        int i = 300000000;
        short s = 13200;
        byte b = 100;
        long l = 1100000000;
        //ponto flutuante
        float p = 3.14f;
        double d = 3.14;
        //texto
        char c = 'A';
        //booleano
        boolean t = true;
        boolean f = false;
    }

    public static void OpAritmeticos(double a, double b){
        //O + em numeros realiza a soma
        //O + em numero com texto realiza a junção
        System.out.println("Soma: "+(a+b));
        System.out.println("Subtração: "+(a-b));
        System.out.println("Multiplicação: "+(a*b));
        System.out.println("Divisão: "+(a/b));
        System.out.println("Resto da Divisão: "+(a%b));

    }

    public static void OpLogicos(){
        //Comparação
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int a = sc.nextInt();

        System.out.println("Digite um numero: ");
        int b = sc.nextInt();

        if (a>b){
            System.out.println("A é maior que B");
        }else{
            System.out.println("B é maior que A");
        }

        if (a>=b){
            System.out.println("A é maior OU igual a B");
        }else{
            System.out.println("B é maior que A");
        }
    }
}
