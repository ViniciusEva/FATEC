# i=1
# idade = 0
# while (i==1):
#     idade = int(input("Digite a sua idade "))
#     if(idade >= 5 and idade <= 7):
#         print("Categoria: Infantil A")
#     elif(idade >= 8 and idade <= 10):
#         print("Categoria: Infantil B")
#     elif(idade >= 11 and idade <= 13):
#         print("Categoria: Juvenil A")
#     elif(idade >= 14 and idade <=17):
#         print("Categora: Juvenil B")
#     elif(idade >= 18):
#         print("Categoria: Adulto")
#     else:
#         print("Digite uma idade válida")
#     print("\nDeseja continuar? ")
#     i = int(input("[1] Continuar\n[2] Parar\n"))

#===========================================================================

import textwrap

def menu():
    # Exibe o menu com as opções de comida
    menu = """\n
    ================ MENU ================
    [1]\tCachorro Quente    - R$ 8.10
    [2]\tBauru Simples     - R$ 11.30
    [3]\tBauru c/ Ovo      - R$ 15.50
    [4]\tHamburger         - R$ 13.10
    [5]\tCheeseburger      - R$ 14.30
    [6]\tRefrigerante      - R$ 5.00
    [7]\tValor Total da Compra
    [q]\tSair
    => """
    return input(textwrap.dedent(menu))

def main():
    valor_total = 0  # Inicializa o valor total da compra

    while True:
        opcao = menu()  # Exibe o menu e captura a opção do usuário
        
        if opcao == '1':
            quantidade = int(input("Digite a quantidade que deseja: "))
            preço = quantidade * 8.10
            valor_total += preço

        elif opcao == '2':
            quantidade = int(input("Digite a quantidade que deseja: "))
            preço = quantidade * 11.30
            valor_total += preço

        elif opcao == '3':
            quantidade = int(input("Digite a quantidade que deseja: "))
            preço = quantidade * 15.50
            valor_total += preço

        elif opcao == '4':
            quantidade = int(input("Digite a quantidade que deseja: "))
            preço = quantidade * 13.10
            valor_total += preço

        elif opcao == '5':
            quantidade = int(input("Digite a quantidade que deseja: "))
            preço = quantidade * 14.30
            valor_total += preço

        elif opcao == '6':
            quantidade = int(input("Digite a quantidade que deseja: "))
            preço = quantidade * 5.00
            valor_total += preço

        elif opcao == '7':
            print(f"O valor total é: R$ {valor_total:.2f}")

        elif opcao == 'q' or 'Q':
            print("Saindo...")
            break  # Encerra o loop e o programa

        else:
            print("Opção inválida. Tente novamente.")

if __name__ == "__main__":
    main()  # Chama a função principal quando o programa for executado
