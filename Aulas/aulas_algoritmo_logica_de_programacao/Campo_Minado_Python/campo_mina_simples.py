#Jogo - Campo Minado
# Jogo - Campo Minado
linhas = int(input("Digite a quantidade de linhas: "))
colunas = int(input("Digite a quantidade de colunas: "))
points = 0

matriz = []  # matriz com os valores reais
blur = []    # matriz que o jogador vê

# Preenchendo as matrizes
for i in range(1,linhas+1): #inicia a matriz em 1 em vez de 0
    linha = []
    blur_i = []
    
    for j in range(1,colunas+1): #inicia a matriz em 1 em vez de 0
        elemento = input(f"Digite o elemento para a posição [{i}][{j}]: ")
        linha.append(elemento)
        blur_i.append("#")
    matriz.append(linha)
    blur.append(blur_i)

# Exibe a matriz oculta inicialmente
print("\nMatriz criada:")
for linha in blur:
    print(" ".join(linha))
    
# Loop do jogo
while True:
    i = int(input("Digite a linha: "))
    j = int(input("Digite a coluna: "))
    
    if matriz[i][j] == "*":
        print("Você perdeu!")
        blur[i][j] = "*"
        for linha in blur:
            print(" ".join(linha))
        break
    else:
        points += 1
        blur[i][j] = matriz[i][j]  # Revela o valor real
        print(f"Você acertou! O valor na posição [{i}][{j}] é: {matriz[i][j]}")
        print("\nMatriz atual:")
        for linha in blur:
            print(" ".join(linha))
        print(f"Pontos: {points}")

print("Pontos finais: ", points)
