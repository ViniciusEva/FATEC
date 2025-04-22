# 1 - Fazer um algoritmo para calcular o fatorial de um numero
r = 0
s = 0
resultado = 1
while (r == s):
    num = int(input("Digite um Numero: "))
    if(num >= 0):
        for i in range(1, num+1,1):
            resultado *= i 
        print("O resultado é: ", resultado)
    else:
        print("Digite um numero positivo")
    resultado = 1

#==================================================================

def calcFatorial (n):
    if(n == 0 or n == 1):
        return 1
    else:
        return n * calcFatorial(n-1)
n = int(input("Digite um numero para fatorar: "))
f = calcFatorial(n)
print(f"O fatorial de {n} é {f}")

#=================================================================
