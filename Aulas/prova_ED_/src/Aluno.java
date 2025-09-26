// public class App {
//     public static void main(String[] args) throws Exception {
//         //Criação do Objeto
//         Aluno a = new Aluno(0, null, null, 0, 0, null);

//         a.setNome(null);
//         a.exibirDados();
//         System.out.println(a.getNome());
//     }
// }


//===========================================================================================
//===========================================================================================


public class Aluno {
    //atributos
    private int ra;
    private String nome;
    private String datNasc;
    private int cpf;
    private int telefone;
    private String email;

    //construtor
    public Aluno (int ra, String nome, String DataNasc, int cpf, int telefone, String email){
        this.ra = ra;
        this.cpf = cpf;
        this.telefone = telefone;
        this.datNasc = datNasc;
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
        System.out.println("A Data de nascimento é:"+datNasc);
        System.out.println("CPF é:"+cpf);
        System.out.println("email é:"+email);
    }

    public void setNome(String entrada){
        if(entrada == null || entrada.trim().isEmpty()){
            System.out.println("O nome está vazio");
        }else{
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



//===========================================================================================
//===========================================================================================


// import java.util.Arrays;

// public class App {
//     public static void main(String[] args) throws Exception {
//         //Declaração de um vetor de inteiros comtamanho 5
//         int[] meu_array = new int[5];

//         //Inicialização do vetor
//         meu_array[0] = 10;
//         meu_array[1] = 20;
//         meu_array[2] = 30;
//         meu_array[3] = 40;
//         meu_array[4] = 50;

//         //Exibindo o conteúdo de uma determinada posição
//         System.out.println(meu_array[0]);
//         System.out.println(meu_array[1]);

//         //Recuperando o conteúdo de array de uma determinada posiçãp
//         int e1 = meu_array[0];
//         int e2 = meu_array[1];

//         System.out.println("O Conteúdo: "+e1);
//         System.out.println("O Conteúdo: "+e2);

//         //Percorrer um array sequencial
//         for(int i = 0; i < meu_array.length; i++){
//             System.out.println("A posição "+i);
//             System.out.println("O Elemento "+ meu_array[i]);
//         }

//         //criando um array de tamanho implicito
//         String[] alunos = {"Rafael","Gabriel","Guilherme","Giovana"};

//         //percorrendo um array (sequencialmente) - for each
//         for(String aluno:alunos){
//             System.out.println(aluno);
//         }
//         //realizando um print no vetor
//         System.out.println(Arrays.toString(alunos));

//         //Quantidades de elementos que há no vetor: length
//         System.out.println(alunos.length);

//         //Clone de um vetor: clone
//         String[] copia = alunos.clone();

//         //Copiando uma parte do vetor para outro: copyof
//         String[] copia_parcial = Arrays.copyOf(alunos,2);
//         System.out.println(Arrays.toString(copia_parcial));

//         //ordenando valores dentro do array
//         Arrays.sort(alunos);
//         System.out.println(Arrays.toString(alunos));
//     }
// }


//===========================================================================================
//===========================================================================================


// public class App {
//     public static void main(String[] args) throws Exception {
//         int [] [] matriz = new int[2] [3]; //2 linhas e 3 colunas

//         matriz[0][0] = 1;
//         matriz[0][1] = 2;
//         matriz[0][2] = 3;
//         matriz[1][0] = 4;
//         matriz[1][1] = 5;
//         matriz[1][2] = 6;

//         //criando e inicializando
//         int [][] matriz_2 = {{7,8,9},{10,11,12}};

//         //percorrendo uma matriz
//         for (int linha = 0; linha < matriz_2.length; linha++){
//             for (int coluna = 0; coluna < matriz_2[linha].length; coluna++){
//                 System.out.println(matriz_2[linha][coluna]);
//             }
//         }
//     }
// }



//===========================================================================================
//===========================================================================================



// As funções são necessárias para criar sub-blocos
//  function nome (paramentro) { bloco-code}

//  Uma função simples
// function ola() {
//     console.log('Ola Mundo em JS')
// }

// // chamando a função para execução
// ola()

// //  função com parametros de entrada
// function soma(v1, v2) {
//     let res = v1 + v2
//     console.log(res)
// }
// soma(10,10)

// // função com valor padrão no parametro
// function subtracao(v1 = 10, v2) {
//     let res = v1 - v2
//     console.log(res)
// }
// subtracao(undefined,2)
// subtracao(8,2)
// // função com retorno
// function multiplicacao(v1, v2) {
//     let res = v1 * v2
//     return res;
// }

// // função anonima (normalmente é atribuida a uma variavel)
// let divisao = function (v1, v2) {
//     return v1 / v2;
// }

// // função anomima com seta
// let maior = (v1, v2) => {
//     return v1 > v2
// }
// let m = multiplicacao(10,10);
// console.log(m)
// console.log(maior(10,5))
// console.log(divisao(10,2))




//===========================================================================================
//===========================================================================================



//multidimensional, horizontal e vertical
// let matriz = [[1,2,3], [4,5,6], [7,8,9]]
// console.log(matriz)

// //acessando uma matriz
// console.log(matriz[0][0])
// console.log(matriz[0][1])
// console.log(matriz[0][2])

//percorrendo uma Matriz com 2 FOR
//1° FOR -> Linha
//2° FOR -> Coluna

// for(let l=0; matriz.length;l++){
//     for(c=0; matriz[l].length;c++){
//         console.log(matriz[l][c])
//     }
// }

//percorrendo uma Matriz com ForEach
// matriz.forEach((linha, i)=>{
//     linha.forEach((coluna,valor)=>{
//         console.log(valor)
//     })
// })

// matriz.forEach(linha=>{
//     linha.forEach(valor =>{
//         console.log(valor)
//     })
// })


//Criando um Array
let carro = ['Gol', 'Corsa', 'Pálio', 'Kwid', 'Mobi', 'HB20', 'Onix', 'KA']

//Criando uma Array e inicializando com valores com Array()

let marcas = new Array('Fiat','Ford','Jeep')

//Criando uma Array vazio

let acessorios = []
let categoria = new Array();

//Criar uma array com um valor fixo
let cor = Array(5)

console.log(carro)
console.log(marcas)

console.log(categoria)
console.log(acessorios)
console.log(cor)

//adicionar um novo elemento no final do Array com "PUSH"
carro.push('Logan')
console.log(carro)

//adcionar um novo elemento no inicio do Array com "UNSHIFT"
carro.unshift('compass')
console.log(carro)

//remover um elemento no final do Array com "POP"
carro.pop()
console.log(carro)

//remover um elemento no inicio da ARRAY COM "SHIFT"
carro.shift()
console.log(carro)

//remover um elemento através da sua posição com "SPLICE"
carro.splice(1,1) //remove 1 elemento a partir do index 1

//remover um elemento através de um valor especificado
carro = carro.filter(f=> f !='HB20') //tudo que for diferente de HB20 permace
console.log("filter: "+ carro)

//substituir um elemento com "SPLICE"
// carro.splice(0,1,"Gol")
// console.log("splice: "+ carro)

//convertendo um array para uma String
// let texto = carro.join(',')
// console.log("join: "+ texto)

//localizar um elemento na Array com "FIND"
// let localiza = carro.find(x=> x == 'Gol')
// console.log("Find: "+ localiza) // quando não achar, retornada 'Undefined'


//includes um elemento na Array com 'Includes'
// let existe = carro.includes('Gol')
// console.log("Includes: "+ existe) // quando localiza é TRUE, o contrário é FALSE

//ordenar uma array em crecente (A-Z ou 0-N) ->SORT
// carro.sort()
// console.log("sort: " + carro)

//ordenar uma array em decrescente (Z-A ou N-0) ->Reverse
// carro.reverse()
// console.log("reverse: " + carro)

// console.log(carro)

// let numero = [1,2,3,4,5,6,7,8,9]
// let dobra = numero.map(x=> x*2)
// console.log(dobra)

//Array mesclada => com conteúdos de tipos diferentes
// let mesclada = ['Ford','Ka',123,true,null,false,{cor:'vermelho'}]
// console.log(mesclada)

//Array de Objetos
// let aluno = [
//     {nome: 'Giovana', idade:22},
//     {nome: 'Yago', idade:21},
//     {nome: 'Tayna', idade:20}
// ]
// console.log(aluno)

//acesso direto com array simples
// console.log(carro[1])
// console.log(carro[2])
// let veiculo = carro[3]
// console.log(veiculo)

// console.log(aluno[0]) //reucperando o objeto por completo
//console.log(aluno[0].nome) // recuperando o valor do atributo que esta dentro do objeto

//o tamanho do vetor é verificado com "LENGHT"
//console.log("Quantidade de carros: "+ carro.length)

//percorrendo uma Array
//for tradicional
// for(let i = 0; i < carro.length; i++){
//     console.log(carro[i])
// }

// for(let c of carro){
//     console.log(c)
// }



