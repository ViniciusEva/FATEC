// Tipagens de variaveis no JS são interpretradas


let idade =30 // int
let nome= "Francisco" //String
let cidade = 'Ferraz de Vasconcelos' //String
let altura=1.75 //double ou number
let v=true //boolean 
let f=false //boolean

console.log(typeof(idade)+": "+idade)
console.log(typeof(nome)+": "+nome)
console.log(typeof(cidade)+": "+cidade)
console.log(typeof(altura)+": "+altura)
console.log(typeof(v)+": "+v)
console.log(typeof(f)+": "+f)

let vazio = null
let indef 

console.log(typeof(vazio)+": "+vazio)

// Não declarar uma tipagem o JS irá assumir o Undefined
// Não é o mesmo que NULL
console.log(typeof(indef)+": "+indef)


// objeto anônimo -> é um objeto que não tem referência a uma classe
// normalmento só possui os atributos e não tem métodos
let aluno = {
    nome: 'Giovana',
    curso: 'ADS',
    faculdade: 'Fatec FV'
}

//objeto com sub-objeto (ou objeto aninhado)

let aluno_2 ={
    nome:'Yago',
    curso: 'ADS',
    faculdade: 'FATEC FV',
    endereco:{
        rua:'Rua abc',
        cidade:'Ferraz de Vasc',
        bairro:'Jardim Guaianases'
    }
}

console.log(aluno)
console.log(aluno_2)

//declarando um array/vetor
let cores = ['Azul','Amarelo', 'Vermelho', 'Roxo', 'Preto', 'Branco']
console.log(typeof(cores)+": "+cores)