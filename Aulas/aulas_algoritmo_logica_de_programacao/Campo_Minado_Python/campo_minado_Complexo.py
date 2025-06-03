#Campo Minado - Game
import random

# Configurações
LINHAS = 8
COLUNAS = 8
MINAS = 10

# Função para criar o tabuleiro
def criar_tabuleiro(linhas, colunas, minas):
    tabuleiro = [[' ' for _ in range(colunas)] for _ in range(linhas)] #cria a matriz do tabuleiro
    minas_pos = set() # set para evitar repetição
    while len(minas_pos) < minas:
        x = random.randint(0, linhas - 1) #Adiciona-se "-1" devido as colunas começar em 0 e não em 1
        y = random.randint(0, colunas - 1)
        minas_pos.add((x, y))
    return tabuleiro, minas_pos

# Função para contar minas ao redor
def contar_minas(tabuleiro, minas_pos, x, y):
    cont = 0
    for i in range(max(0, x - 1), min(LINHAS, x + 2)):
        for j in range(max(0, y - 1), min(COLUNAS, y + 2)):
            if (i, j) in minas_pos:
                cont += 1
    return cont

# Função para revelar células
def revelar(tabuleiro, minas_pos, visivel, x, y):
    if visivel[x][y]:
        return
    visivel[x][y] = True
    if (x, y) in minas_pos:
        return
    minas_ao_redor = contar_minas(tabuleiro, minas_pos, x, y)
    tabuleiro[x][y] = str(minas_ao_redor) if minas_ao_redor > 0 else ' '
    if minas_ao_redor == 0:
        for i in range(max(0, x - 1), min(LINHAS, x + 2)):
            for j in range(max(0, y - 1), min(COLUNAS, y + 2)):
                if not visivel[i][j]:
                    revelar(tabuleiro, minas_pos, visivel, i, j)

# Função para imprimir o tabuleiro
def imprimir_tabuleiro(tabuleiro, visivel):
    print("   " + " ".join([str(i) for i in range(COLUNAS)]))
    for i in range(LINHAS):
        linha = [tabuleiro[i][j] if visivel[i][j] else '#' for j in range(COLUNAS)]
        print(f"{i}  " + " ".join(linha))

# Função para checar vitória
def checar_vitoria(visivel, minas_pos):
    total_visiveis = sum([sum(linha) for linha in visivel])
    return total_visiveis == (LINHAS * COLUNAS - len(minas_pos))

# Função principal
def jogar():
    tabuleiro, minas_pos = criar_tabuleiro(LINHAS, COLUNAS, MINAS)
    visivel = [[False for _ in range(COLUNAS)] for _ in range(LINHAS)]

    while True:
        imprimir_tabuleiro(tabuleiro, visivel)
        try:
            x = int(input("Escolha a linha: "))
            y = int(input("Escolha a coluna: "))
        except ValueError:
            print("Entrada inválida, use números.")
            continue

        if (x, y) in minas_pos:
            print("BOOM! Você perdeu!")
            for (mx, my) in minas_pos:
                tabuleiro[mx][my] = '*'
                visivel[mx][my] = True
            imprimir_tabuleiro(tabuleiro, visivel)
            break
        else:
            revelar(tabuleiro, minas_pos, visivel, x, y)
            if checar_vitoria(visivel, minas_pos):
                imprimir_tabuleiro(tabuleiro, visivel)
                print("Parabéns! Você ganhou!")
                break

# Iniciar o jogo
if __name__ == "__main__":
    jogar()
