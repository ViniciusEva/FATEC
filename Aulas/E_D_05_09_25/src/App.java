import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Turma turma = new Turma(3,"3SEM_ADS");

        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        do{
            try {
                System.out.println("\n [1] Inserir \n [2] Buscar \n [3] Remover \n [4] Listar \n [5] Capacidade da Turma \n [0] Sair");
                System.out.println("Opcao: ");
                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.print("RA: ");
                        int ra = Integer.parseInt(sc.nextLine());

                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        boolean status = turma.inserir(new Aluno (ra, nome));

                        //condicao_logica ? true:false
                        //condicao_logica ? se:senao
                        System.out.println(status ? "Inserido com Sucesso": "Falha ao inserir"); //ternário
                        break;
                
                    case 2:
                        System.out.println("RA: ");
                        ra = Integer.parseInt(sc.nextLine());
                        Aluno a = turma.LocalizarRa(ra);

                        System.out.println(a!=null ? "Nome: " + a.getNome() : "Não Encontrado");

                        break;
                    
                    case 3:
                        System.out.print("RA: ");
                        ra = Integer.parseInt(sc.nextLine());
                        System.out.println(turma.remover(ra) ? "Removido": "Não localizado");
                    case 4:
                        for(Aluno a1: turma.listar()){
                            System.out.println(a1.getRa()+"|"+a1.getNome());
                        }
                        System.out.println("Vagas livres: "+turma.capacidadeTurma());
                        break;
                    case 0:
                        System.out.println("Encerrando!");
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            } catch (Exception e) {
                
            }

        }while (opcao != 0);
        sc.close();

        Aluno a1 = new Aluno(1,"Francisco");
        Aluno a2 = new Aluno(1,"Gabriel");
        Aluno a3 = new Aluno(1,"Yago");

        //Exibe o valor original da capacidade da turma
        System.out.println(turma.capacidadeTurma());
        //adiciona os alunos ao length do vetor
        turma.inserir(a1);
        turma.inserir(a2);
        turma.inserir(a3);
        //Se na linha 3 definimos a capacidade de alunos, agora no final temos o desconto de tamanho dentro do vetor, caso ele encha, ele retorna 0 de capacidade final
        System.out.println(turma.capacidadeTurma());
    }
}
