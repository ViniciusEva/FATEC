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
carro.splice(0,1,"Gol")
console.log("splice: "+ carro)

//convertendo um array para uma String
let texto = carro.join(',')
console.log("join: "+ texto)

//localizar um elemento na Array com "FIND"
let localiza = carro.find(x=> x == 'Gol')
console.log("Find: "+ localiza) // quando não achar, retornada 'Undefined'


//includes um elemento na Array com 'Includes'
let existe = carro.includes('Gol')
console.log("Includes: "+ existe) // quando localiza é TRUE, o contrário é FALSE

//ordenar uma array em crecente (A-Z ou 0-N) ->SORT
carro.sort()
console.log("sort: " + carro)

//ordenar uma array em decrescente (Z-A ou N-0) ->Reverse
carro.reverse()
console.log("reverse: " + carro)

console.log(carro)

let numero = [1,2,3,4,5,6,7,8,9]
let dobra = numero.map(x=> x*2)
console.log(dobra)

//Array mesclada => com conteúdos de tipos diferentes
let mesclada = ['Ford','Ka',123,true,null,false,{cor:'vermelho'}]
console.log(mesclada)

//Array de Objetos
let aluno = [
    {nome: 'Giovana', idade:22},
    {nome: 'Yago', idade:21},
    {nome: 'Tayna', idade:20}
]
console.log(aluno)

//acesso direto com array simples
console.log(carro[1])
console.log(carro[2])
let veiculo = carro[3]
console.log(veiculo)

console.log(aluno[0]) //reucperando o objeto por completo
console.log(aluno[0].nome) // recuperando o valor do atributo que esta dentro do objeto

//o tamanho do vetor é verificado com "LENGHT"
console.log("Quantidade de carros: "+ carro.length)

//percorrendo uma Array
//for tradicional
for(let i = 0; i < carro.length; i++){
    console.log(carro[i])
}

for(let c of carro){
    console.log(c)
}