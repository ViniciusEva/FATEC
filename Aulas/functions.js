// As funções são necessárias para criar sub-blocos
//  function nome (paramentro) { bloco-code}

//  Uma função simples
function ola() {
    console.log('Ola Mundo em JS')
}

// chamando a função para execução
ola()

//  função com parametros de entrada
function soma(v1, v2) {
    let res = v1 + v2
    console.log(res)
}
soma(10,10)

// função com valor padrão no parametro
function subtracao(v1 = 10, v2) {
    let res = v1 - v2
    console.log(res)
}
subtracao(undefined,2)
subtracao(8,2)
// função com retorno
function multiplicacao(v1, v2) {
    let res = v1 * v2
    return res;
}

// função anonima (normalmente é atribuida a uma variavel)
let divisao = function (v1, v2) {
    return v1 / v2;
}

// função anomima com seta
let maior = (v1, v2) => {
    return v1 > v2
}
let m = multiplicacao(10,10);
console.log(m)
console.log(maior(10,5))
console.log(divisao(10,2))
