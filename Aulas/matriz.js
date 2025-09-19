//multidimensional, horizontal e vertical
let matriz = [[1,2,3], [4,5,6], [7,8,9]]
console.log(matriz)

//acessando uma matriz
console.log(matriz[0][0])
console.log(matriz[0][1])
console.log(matriz[0][2])

//percorrendo uma Matriz com 2 FOR
//1° FOR -> Linha
//2° FOR -> Coluna

for(let l=0; matriz.length;l++){
    for(c=0; matriz[l].length;c++){
        console.log(matriz[l][c])
    }
}

//percorrendo uma Matriz com ForEach
// matriz.forEach((linha, i)=>{
//     linha.forEach((coluna,valor)=>{
//         console.log(valor)
//     })
// })

matriz.forEach(linha=>{
    linha.forEach(valor =>{
        console.log(valor)
    })
})
