from collections import deque

#criando uma pilha utilizando o deque
pilha = deque()

pilha.append('Prato Azul')
pilha.append('Prato Laranja')
pilha.append('Prato Vermelho')
pilha.append('Prato Verde')

print(pilha)

#removendo elementos: pop() remover no inicio

pilha.pop()

print(pilha)