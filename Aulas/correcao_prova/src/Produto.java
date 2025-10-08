public class Produto{
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double getPreco(){
        return this.preco;
    }

    public String getNome(){
        return this.nome;
    }

    public double calcularTotal(){
        return preco*quantidade;
    }


}