class Caixa{
    constructor(id,descricao){
        this.id=id
        this.descricao = descricao
    }
    toString(){
        return 'ID: '+ this.id +' '+'Descrição: '+ this.descricao
    }
}

module.exports = Caixa;