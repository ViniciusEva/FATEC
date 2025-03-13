#Conjuntos
A = {0,1,2}
B = {0,1,3}
U = {0,1,2,3,5,7}

cA = U - A
print("cA = ",cA)
ccA= U - cA
print("ccA = A? ", ccA == A)

#----------Leis_de_DEMORGAN----------

#Complementar  da União de A com B é igual a intersecção do complementar de A com complementar de B
cAUB = U - (A|B)
cB = U - B
print("c(AUB) = cA inter cB? ", cAUB == cA&cB)

#Complemetar da intersecção de A com B é igual a união do complementar de A com complementar de B
cAIB = U - (A&B)
print("c(A&B) = cA união cB? ", cAIB == cA|cB)

#Conjunto A intersecta o complementar de A é igual ao vazio
print("A&cA = vazio? ", A&cA == set())
print("AUcA = U? ", A|cA == U)
print("A-B = A inter cB", A - B == A&cB)