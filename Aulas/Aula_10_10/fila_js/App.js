//declarando uma fila vazia
//Em JS nativo não há uma estrutura  de fila
//é utilizado ArrayList para copiar esse comportamento


let veiculo = []

veiculo.push('Corsa')
veiculo.push('Astra')
veiculo.push('Uno')

//Exibindo a fila

console.log(veiculo)

//primeiro elemento da fila
console.log(veiculo[0])

//removendo elemento da fila
veiculo.shift()
console.log(veiculo)

//tamanho da fila
console.log(veiculo.length)

//fila está vazia?
