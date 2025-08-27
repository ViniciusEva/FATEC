public class Aluno {
    //atributos separados

    // private int ra;
    // private String nome;
    // private String dataNascimento;
    // private int cpf;
    // private int telefone;
    // private String email;

    //ou
 
    //atributos agrupados

    private int ra, cpf, telefone;
    private String dataNascimento, nome, email;

    //todo construtor é definido após a criação dos atributos
    public Aluno(int ra, int cpf, int telefone, String dataNascimento, String nome, String email){
        this.ra = ra;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        if(validaNome(nome)){
            this.nome = nome;
        }
        this.email = email;
    }

    //criando metodos

    public void exibirDados(){
        System.out.println("Nome é:"+nome);
        System.out.println("Telefone é:"+telefone);
        System.out.println("RA é:"+ra);
        System.out.println("A Data de nascimento é:"+dataNascimento);
        System.out.println("CPF é:"+cpf);
        System.out.println("email é:"+email);

    }

    public void setNome(String entrada){
        if(entrada == null || entrada.trim().isEmpty()){
            System.out.println("O nome está vazio");
        }else{
            this.nome = entrada;
        }
    
        if(validaNome(entrada)){
            this.nome = entrada;
        }
    }

        

    public boolean validaNome(String nome){
        if(nome == null || nome.trim().isEmpty()){
            System.out.println("O nome está vazio");
            return false;
        }else{
            return true;
        }

    }
    public String getNome(){
        return this.nome;
    }
}


