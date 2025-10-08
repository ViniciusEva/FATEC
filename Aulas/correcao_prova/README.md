# Projeto: Cálculo de Dados Corporais

Este projeto em Java demonstra os conceitos de **Programação Orientada a Objetos (POO)**, com foco em **encapsulamento**, e utiliza a interação com o usuário para calcular dados como **densidade** e **Índice de Massa Corporal (IMC)**.

## 📁 Estrutura do Projeto

O projeto é composto por duas classes principais:

1.  `CorpoHumano.java`: Esta classe representa um objeto com atributos físicos (massa, volume, altura) e os métodos necessários para manipular e calcular as propriedades dependentes (densidade e IMC).
2.  `Main.java`: A classe principal que interage com o usuário, obtém as entradas e utiliza o objeto da classe `CorpoHumano` para exibir os resultados.

---

## 🛠️ Detalhes da Classe `CorpoHumano`

A classe `CorpoHumano` é um excelente exemplo de **encapsulamento**, protegendo os dados e controlando o acesso a eles.

* **Atributos Privados**:
    * `massa` (em kg)
    * `volume` (em m³)
    * `densidade` (em kg/m³)
    * `altura` (em m)
    * `imc` (Índice de Massa Corporal)

    Todos os atributos são declarados como **`private`**, o que significa que não podem ser acessados ou modificados diretamente de fora da classe.

* **Métodos de Acesso (Getters e Setters)**:
    * **Getters (`get...`)**: Métodos públicos que permitem a **leitura** dos valores dos atributos. Por exemplo, `getMassa()` retorna o valor da massa.
    * **Setters (`set...`)**: Métodos públicos que permitem a **modificação** dos valores. Eles são cruciais porque incluem **validação**. Por exemplo, `setMassa()` verifica se a massa é um valor não negativo antes de atribuí-la.
* **Métodos de Cálculo**:
    * `calcularDensidade()`: Método privado que calcula a densidade com base na massa e no volume.
    * `calcularIMC()`: Método privado que calcula o IMC usando a massa e a altura.

A lógica de cálculo está "escondida" dentro da classe. Sempre que a massa ou a altura são alteradas via `setters`, os métodos de cálculo são chamados automaticamente para garantir que a densidade e o IMC estejam sempre atualizados.

---

## 🖥️ Como Executar o Programa

Para rodar o projeto, você precisa compilar e executar a classe `Main.java` em um ambiente Java.

1.  **Abra o terminal ou prompt de comando** na pasta onde os arquivos `.java` estão salvos.
2.  **Compile os arquivos**:
    ```sh
    javac CorpoHumano.java Main.java
    ```
3.  **Execute a classe principal**:
    ```sh
    java Main
    ```

O programa irá então solicitar a entrada de dados do usuário e mostrar os resultados calculados, conforme o exemplo abaixo.

---

## ⌨️ Exemplo de Interação

```sh
=== CRIAÇÃO DO OBJETO CORPO HUMANO ===
Digite a massa inicial (kg): 70
Digite o volume inicial (m³): 0.07
Digite a densidade inicial (kg/m³): 1000
Digite a altura inicial (m): 1.75
=== VALORES INICIAIS ===
Massa: 70.0 kg
Volume: 0.07 m³
Densidade: 1000.0 kg/m³
Altura: 1.75 m
IMC: 22.857142857142858
Digite uma nova massa (kg): 80
Digite uma nova altura (m): 1