from collections import deque

# Criando uma fila vazia
fila = deque()

# Adicionando elementos na fila
fila.append('Mobi')
fila.append('Kwid')
fila.append('Up')

#Exibindo elementos da fila
print(fila)

#quantidade de elementos da fila
carro = fila.popleft()

print(fila)

#percorrendo uma fila

while fila:
    carro = fila.popleft()
    print(carro)