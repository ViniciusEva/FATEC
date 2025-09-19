let v1=10;
let v2=20;
let res=0;

// soma
res = v1 +v2
console.log(res)

//subtracao 
res = v2-v1
console.log(res)

//multiplicacao
res= v2*v1
console.log(res)

//divisao
res = v2/v1
console.log(res)

// operadores de comparação
res = v2>v1
console.log(res)

res = v2<v1
console.log(res)

res = v2==v1
console.log(res)

res = v2!=v1
console.log(res)

// as diferenças dos iguais
// = atribuição de valores
// == verificar o conteudo dos valores
// === verificar o conteudo dos valores E a tipagem do dado

texto = "10"
console.log(v1==texto) // 10 == 10: true
console.log(v1===texto) // 10 === "10": false

// operadores lógicos
res = v1 == 10 && v2==30
console.log(res) //false

res = v1 == 10 && v2==20
console.log(res) //true

res = v1 == 10 || v2==30
console.log(res) //true