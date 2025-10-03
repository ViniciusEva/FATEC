public class Caixa {
    private int id;
    private String descricao;

    public Caixa (int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public void Exibir(){
        System.out.println(id);
        System.out.println(descricao);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    

}
