// PILHA vazia
let pilha = []

//pilha Preenchida
let pilha_dados = ['Prato Azul','Prato Verde','Prato Vermelho']

//Empilhando elementos PUSH
pilha_dados.push('Prato Branco')
pilha_dados.push('Prato Amarelo')

//Exibir dados da pilha
console.log(pilha_dados)

//Visualizar elemento do Topo
console.log(pilha_dados[pilha_dados-1])

//Verificar se a pilha esta vazio
console.log(pilha_dados.length === 0)

//Vereficar o tamanho da pilha: propriedade length
console.log(pilha_dados.length)

//Percorrendo uma pilha
for(let i = pilha_dados.length-1; i>=0;i--){
    console.log(pilha);
}
