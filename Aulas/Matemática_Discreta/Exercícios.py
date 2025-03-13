A = {-1,0,1,4}
B = {-1,1,4,5}
U = {-1,0,1,2,3,4,5,6}

#Exercício 1: União Conjunto A e B
print("1 - AUB: ", A|B)
#Exercício 2: Intersecção Conjunto A e B
print("2 - A&B: ", A&B)
#Exercício 3: Subtração do Conjunto A com B
print("3 - A-B: ", A-B)
#Exercício 4: Subtração do Conjunto B com A
print("4 - B-A: ", B-A)
#Exercício 5: Complementar de A
cA = U - A
print("5 - cA: ", cA)
#Exercício 6: Complementar de B
cB = U - B
print("6 - cB: ", cB)
#Exercício 7: Conjunto A - (A&B)
print("7 - A-(A&B): ", A-(A&B))
#Exercício 8: B - (A|B)
print("8 - B-(A|B): ", B-(A|B))
#Exercício 9: Complementar da União de A e B
uAB = A | B
print("9 - cUAB: ", U - uAB)
#Exercício 10: Complementar da União B e A
print("10 - cA|cB: ", (cA|cB))