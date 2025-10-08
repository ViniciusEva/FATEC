

public class Aluno {
    private String nome;
    private double nota;
    private int idade;

    //Construtor
    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    // Alterar/Incluir dados em um determinado atributo
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    //void: método sem retorno -> ou seja, não retorna um dado
    //tipo_dado: Por exemplo String, é obrigatório retorna esse dado com esse tipo
    //é obrigado colocar o comando return em GET

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double getNota(){
        return this.nota;
    }

    //método aprovado
    public Boolean aprovado(){
        if(nota >= 6){
            return true;
        }else{
            return false;
        }
    }

}
