#Exercício 1 e 2
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

# Exercício 3 e 4
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

#Exercício 5, 6 e 7
# r = "S"
# a = 0
# aprovado = 0
# reprovado = 0
# exame = 0
# m = 0
# mSala = 0
# lista = []
# while r.upper() == "S":
#     aluno1 = input("Digite o nome do aluno: ")
#     n1 = int(input("Entre com a nota 1: "))
#     n2 = int(input("Entre com a nota 2: "))
#     mSala = m + mSala
#     m = (n1+n2)/2
#     a += 1
#     print("A média do aluno",a, "foi:",m)
#     if(m > 5):
#         print("Aluno aprovado")
#         situacao = "aprovado"
#         aprovado += 1
#     elif(m>=3):
#         print("Aluno de exame")
#         exame += 1
#         situacao = "exame"
#     else:
#         print("Aluno reprovado")
#         reprovado += 1
#         situacao = "Reprovado"
#     #dicionário
#     my_dict = {"nome": aluno1,"media": m ,"nota 1": n1,"nota 2": n2,"situação": situacao}
    
#     lista.append(my_dict)
    
#     print(lista)
    

#     r = input("Tem mais aluno para fazer a média? S/N: ")
# mediaSala = mSala/a
# print("A quantidade de alunos aprovados foram: ",aprovado, "\n", "A quantidade de reprovados é: ", reprovado, "\n", "A quantidade de alunos em exame é: ",exame, "\n", "A média da sala é: ",mediaSala)
    
#Exercício 7
r = "s"
lista = []

# Identificando os dados do boi
while r == "s":
    numero = int(input("Qual é o número de identificação do boi? \n"))
    peso = float(input("Qual é o peso do boi? \n"))
    dicionario = {"numero": numero, "peso": peso}
    lista.append(dicionario)
    r = input("Deseja continuar? SIM(s) ou pressione qualquer outra letra\n").lower()

# Exibir a lista organizada
print("\nLista organizada:\n", lista)

# Encontrar o boi com o menor peso
boi_mais_leve = min(lista, key=lambda x: x["peso"])

# Encontrar o boi com o maior peso
boi_mais_pesado = max(lista, key=lambda x: x["peso"])

# Exibir os resultados
print(f"\nBoi com o MENOR peso: Número {boi_mais_leve['numero']} - Peso {boi_mais_leve['peso']} kg")
print(f"Boi com o MAIOR peso: Número {boi_mais_pesado['numero']} - Peso {boi_mais_pesado['peso']} kg")
