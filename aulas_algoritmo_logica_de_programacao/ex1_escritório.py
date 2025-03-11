#====================================================================================================================
#=======================================================Avançado=====================================================

codigo = int(input("Digite um código de 1 a 5: "))

match codigo:
    case 1: 
        print("Escriturário")
    case 2: 
        print("Secretária")
    case 3: 
        print("Caixa")
    case 4: 
        print("Gerente")
    case 5: 
        print("Diretor")
    case _:
        print("O código enviado é Inválido")

#====================================================================================================================
#=======================================================Básico=======================================================

# if(codigo == 1):
#     print("Escriturário")
# elif(codigo == 2):
#     print("Secretária")
# elif(codigo == 3):
#     print("Caixa")
# elif(codigo == 4):
#     print("Gerente")s
# elif(codigo == 5):
#     print("Diretor")
# else:
#     print("Numero Inválido")
