
nome = input("Digite seu nome: ")
apartamento = input("Digite o tipo de apartamento (A, B, C, D): ")
diaria = int(input("Digite o número de diárias: "))
consumo_interno = float(input("Digite o valor do consumo interno: "))
apartam_A = 150
apartam_B = 100
apartam_C = 75
apartam_D = 50
diaria_total = 0
subtotal = 0
taxa_de_servico = 0
total_geral = 0
valor_unitario = 0

match apartamento:
    case "A":
        diaria_total = diaria * apartam_A
        valor_unitario = apartam_A
    case "B":
        diaria_total = diaria * apartam_B
        valor_unitario = apartam_B
    case "C":
        diaria_total = diaria * apartam_C
        valor_unitario = apartam_C
    case "D":
        diaria_total = diaria * apartam_D
        valor_unitario = apartam_D
    case _:
        print("Opção Inválida")
        exit()

subtotal = diaria_total + consumo_interno
taxa_de_servico = subtotal * 0.1
total_geral = subtotal + taxa_de_servico

#resultados
print(f"Valor Total das Diárias: {diaria_total:.2f}")
print(f"Valor do Subtotal: {subtotal:.2f}")
print(f"Taxa de Serviço: {taxa_de_servico:.2f}")
print(f"Valor Geral: {total_geral:.2f}")

print("="*40)
print(f"Nome: {nome}")
print(f"Diárias: {diaria}")
print(f"Consumo Interno: {consumo_interno:.2f}")
print(f"Valor Unitário: {valor_unitario}")
print(f"Valor total das diárias: {diaria_total:.2f}")
print(f"Subtotal: {subtotal:.2f}")
print(f"Taxa de Serviço: {taxa_de_servico:.2f}")
print(f"Total Geral: {total_geral:.2f}")
