r = "S"
n= 0
alunos = ["Pedro","Ana"]
while(r.upper() == "S"):
    for aluno in alunos:
        print("Aluno: ",alunos)
        n1 = float(input("Digite o primeiro valor: "))
        n2 = float(input("Digite o segundo valor: "))
        n += (n1 + n2)/2
        print("O valor da média é: ", n)
        if (n>=6):
            print("Aprovado")
        elif(n<=3):
            print("Reprovado")
        else:
            print("Exame")
        r = input(print("Deseja continuar? _(Digite: S)_\n"))