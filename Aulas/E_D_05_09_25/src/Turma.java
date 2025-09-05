public class Turma{
    //1 Turma tem N alunos
    //Vetor ou Array

    private Aluno alunos[]; //Vetor de Alunos 1 ->N
    private String semestre;
    private int capacidade; //quantidade máxima
    private int tamanho; //Quantidade atual

    public Turma (int capacidade, String semestre){
        if (capacidade <= 0){
            //System.out.println("Capacidade Inválida");
            throw new IllegalArgumentException("Capacidade inválida");

        }else{
            this.alunos = new Aluno[capacidade];
            this.semestre = semestre;
            this.tamanho = 0;
        }
    }

    public boolean inserir(Aluno aluno){
        if(tamanho == alunos.length){
            return false; //caso tamanho seja igual a capacidade da turma, significa que a turma está cheia
        }else {
            alunos[tamanho++] = aluno;
            return true; //aluno inserido no vetor
        }
    }

    public Aluno[] listar(){
        Aluno[] copia = new Aluno[tamanho];
        for(int i = 0; i < tamanho; i++){
            copia[i] = alunos[i];
        }
        return copia;
    }

    public boolean remover(int ra){
        for (int i = 0; i < tamanho; i++){
            if (alunos[i].getRa() == ra){
                alunos[i] = alunos[tamanho - 1];
                alunos[tamanho - 1] = null;
                tamanho--;
                
                return true;
            }
        }
        return false;
    }

    public Aluno LocalizarRa(int ra){
        for(int i = 0; i < tamanho; i++){
            if(alunos[i].getRa() == ra){
                return alunos [i];
            }
        }
        return null;
    }

    public int capacidadeTurma(){
        return alunos.length - tamanho;
    }
}