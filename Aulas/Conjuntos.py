# "|"(União)
# "&" (Intersecção)
# "-" (Diferença)
# "<" (Está contido, SUBCONJUNTO)
 
U = {-1,0,1,2,3,4,5}
A = {-2,0,1,3}
B = {0,2,3,4,5}
C = {0,2,4}
cA = U-A # "A" BARRADO
Ac = U-cA


print(type(A))
T = {2,-1,-1,3,5,4,4,4}
print(T)
print(5 in B)
print(A < B)
print('A intesecção B', A & B)
print('A união B', A | B)
print('A - B', A - B)
print(A & set())

print('Complementar de A')

A
print("Indepotência: A&B=B&A? ", A & B == B & A)
print("Associativa: (A|B)|C = A|(B|C)", (A | C) | (B | C) == (A | B) | (A | C))
print("Distributiva: A&(B|C) = (A&B)|(A&C)", (A & B) | (A & C) == (A & B) | (A & C))

print("Absorção: A&(A|B)=A", A&(A|B) == A )
print("Absorção: A&(cA|B)=A&B", A&(cA|B) == A&B)
print("cA&Ac = ? ", cA & Ac == A)




                             #|===============================================
#===============================================INCOMPLETO===============================================
                             #===============================================|
# # menu = """

# # [d] Somar
# # [s] Diferença

# # => """

# # class comparacao:
#     def __init__(self):
#         self.A = A
#         self.B = B

    
#     #def 

# print("\nDigite a seguir numero que fazem parte de um conjunto conforme o exemplo abaixo")
# print("Exemplo: 1,2,3,4,5")

# #Conjuntos

# while True:

#     A = input("Digite os valores: ")
#     B = input("Digite os valores: ")
#     opcao = input(menu)
#     if opcao == "d":
#         soma = sum(A) + sum(B)
#     # elif opcao == "s":
#     #     subtracao = 