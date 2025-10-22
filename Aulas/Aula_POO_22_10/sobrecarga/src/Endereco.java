public class Endereco {
    private int numero;
    private long cep;
    private String logradouro, bairro, cidade, complemento, ponto_ref;

    //Construtor Completo: Tem a função em atribuir os valores em todos
    //Ele obriga todos os atributos recebem algum valor na instancia do objeto
    public Endereco(long cep, int numero, String logradouro, String bairro, String cidade, String complemento, String ponto_ref){
        this.cep = cep;
        this.numero = numero;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
        this.ponto_ref = ponto_ref;
    }
    
    //Construtor Flexível: Apenas alguns atributos receberam um valor
    public Endereco(int cep, String logradouro, String bairro, String cidade){
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    //Construtor vazio: Nenhum atributo recebe valores na inicialização do objeto
    //Esse constutor só faz sentido quando há metodos setters
    public Endereco(){

    }

    //Sobrecarga de Construtores (versionamento de Construtores):
    //Construtor completo + Construtor Flexível + Construtor Vazio

    public String getLogradouro(){
        return logradouro;
    }

    public long getCep(){
        return cep;
    }
}
