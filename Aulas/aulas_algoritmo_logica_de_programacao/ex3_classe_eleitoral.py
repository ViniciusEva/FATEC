idade = int(input("Digite sua idade: "))

match idade:
    case idade if idade < 1 or idade > 120:
        print("idade inválida")
    case idade if idade < 16:
        print("Não eleitor")
    case idade if 18 <= idade <= 65:
        print("Eleitor Obrigatório")
    case _:
        print("Eleitor Facultativo")