#Exercício 1
# r = "s"
# frutas = ["pera","laranja","maçã","banana"]
# frutas.sort()
# print(frutas)
# while (r == "s"):
#     fruta = input("Digite alguns nomes de frutas: \n")
#     frutas.append(fruta)
#     frutas.sort()
#     for fu in frutas:
#         print(fu)
#     r = input("Deseja continuar? sim(s) ou pressione qualquer outra tecla para sair \n")

# Exercício 2
# num = []
# i = 0
# contator = 0
# for i in range (1,7):
#     nuns = int(input("Digite alguns números: "))
#     i+=1
#     if nuns % 2 == 0:
#         num.append(nuns)
#         contator+=1
# print("Os numeros pares são: ")
# for numeros in num:
#      print(numeros)
# soma = sum(num)
# print("A soma dos numeros pares é: ", soma)
# media = soma / contator
# print("A média é: ", media)
# print(len(num))

#Exercício 3
r = "S"
a = 0
aprovado = 0
reprovado = 0
exame = 0
m = 0
mSala = 0
lista = []
my_dict = {"nome": "nome_aluno","media":"media_1","nota 1": "n1","nota 2": "n2"}
while r.upper() == "S":
    aluno1 = input("Digite o nome do aluno: ")
    n1 = int(input("Entre com a nota 1: "))
    n2 = int(input("Entre com a nota 2: "))
    mSala = m + mSala
    m = (n1+n2)/2
    a += 1
    print("A média do aluno",a, "foi:",m)
    #dicionário
    my_dict['nome'] = aluno1
    my_dict['media'] = m
    my_dict['nota 1'] = n1
    my_dict['nota 2'] = n2
    
    lista.append(my_dict)
    
    print(lista)

    r = input("Tem mais aluno para fazer a média? S/N: ")