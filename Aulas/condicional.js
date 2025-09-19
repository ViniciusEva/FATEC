// estrutura condicional
if (true) {
    console.log('Sou um if')
}

if (false) {

} else {
    console.log('Sou um else')
}

if (false) {

} else if (true) {
    console.log('So um else if')
} else {

}

if (!false) {
    console.log('Sou um if "com valor invertido"')
}

let op = 1;
switch (op) {
    case 0:
        console.log('Sou opção 0')
        break
    case 1:
        console.log('Sou a opção 1')
        break
    case 2:
        console.log('Sou opção 2')
        break
    default:
        console.log('Nenhuma opção')
        break
}
// o que seria o ponto-virgula (;) no JS:
// indicação de um fim do comando (ou instrução)
// Porém com a quebra-linha não é mais necessário colocar o ;

// Em algumas situações ainda é necessário colocar o ;
// Quando há duas ou mais instruções na mesma linha:
console.log("Teste");
console.log("Teste novamente")


// Ternário: é uma simplificação da lógica if-else

let idade = 18
let res = idade > 18 ? "Maior idade" : "Menor de idade"

// if (idade > 18) {
//     
// } else {

// }


console.log(res)