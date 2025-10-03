import Caixa from "./Caixa.js"

let pilhaCaixas = []

pilhaCaixas.push(new Caixa(1, 'Caixa do Mouse Lenovo'))
pilhaCaixas.push(new Caixa(2,'Caixa do Mouse DELL'))
pilhaCaixas.push(new Caixa(3, 'Caixa do Mouse HP'))

console.log(pilhaCaixas)

console.log(pilhaCaixas[0].toString)