
num1 = float(input("Digite o primeiro número: "))
num2 = float(input("Digite o segundo número: "))
operacao = input("Digite a operação (soma, subtracao, divisao, multiplicacao): ")

match operacao:
    case "soma":
        resultado = num1 + num2
        print(f"O resultado da soma é: {resultado}")
    case "subtracao":
        resultado = num1 - num2
        print(f"O resultado da subtração é: {resultado}")
    case "divisao":
        if num2 == 0:
            print("Não é possível realizar esta operação")
        else:
            resultado = num1 / num2
            print(f"O resultado da divisão é: {resultado}")
    case "multiplicacao":
        resultado = num1 * num2
        print(f"O resultado da multiplicação é: {resultado}")
    case _:
        print("Operação inválida")
