// declaração de variaveis em JS
// var
// const
// let

var idade = 30
let nome = "Francisco"
const cidade = "Ferraz de Vasc."

console.log(idade, nome, cidade)

// É permitido definir a variavel uma unica vez dentro do bloco de código

//toda que vez que declara é necessário inicializar ela
// const cidade_ <- exemplo errado


// no var nao é respeitado o escopo de um bloco de código

if (true) {
    //re-declarando a mesma variavel do escopo principal
    // var idade = 25;
    console.log("Linha 23: " + idade)
}
console.log("Linha 25: " + idade)

if (true) {
    //re-declarando a mesma variavel, mas o escopo será respeitado
    let idade = 26
    console.log("Linha 30: "+idade)
}
console.log("Linha 32: "+idade)