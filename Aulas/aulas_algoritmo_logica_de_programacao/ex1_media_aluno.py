print("======================")
n1 = float(input("Informe a primeira nota: "))
print("======================")
n2 = float(input("Informe a segunda nota: "))
print("======================")
media = (n1+n2)/2
print("A média do usuário é: ", media)
print("======================")
if(media >= 5):
    print("Aluno Aprovado")
elif(media >= 4 and media <= 5):
    print("Aluno em recuperação")
else:
    print("Aluno Reprovado")
print("======================")