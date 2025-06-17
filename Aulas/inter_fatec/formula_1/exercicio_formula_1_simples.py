# Tabela de pontos com chaves como strings, dicionário
tabela_pontos = {
    "1": 25, "2": 18, "3": 13, "4": 10, "5": 9,
    "6": 7, "7": 5, "8": 3, "9": 2, "10": 1
}

# Entrada do usuário
entrada = input("Digite as posições dos corredores: ")
#retirando os espaços da entrada
posicoes = entrada.split()

# Soma os pontos usando as chaves do dicionário
soma_pontos = sum(tabela_pontos[pos] for pos in posicoes)
#mostrando o resultado no terminal
print("Total de pontos:", soma_pontos)