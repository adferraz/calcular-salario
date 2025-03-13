# 📊 Calcula Salário

  


## Sobre o Projeto
Este projeto é um programa em Java que calcula o valor final do salário de um usuário, levando em consideração um benefício e aplicando um desconto de imposto baseado no valor do salário. 
O programa lê o salário e o benefício do usuário e, em seguida, calcula e exibe o total após a dedução do imposto.

## 📖 Funcionamento do código
Importação de Pacotes: O programa começa importando a classe Scanner da biblioteca java.util, que permite a leitura de dados da entrada padrão (teclado).

Classe Principal: A classe principal do programa é chamada Main. O método main é o ponto de entrada do programa.

Inicialização de Variáveis:

valorSalario: Armazena o valor do salário informado pelo usuário.
valorBeneficio: Armazena o valor do benefício informado pelo usuário.
saida: Armazena o resultado final do salário após a aplicação do benefício e a dedução do imposto.
valorImposto: Inicializado como 0, é utilizado para armazenar o valor do imposto calculado.
Leitura de Dados:

O programa solicita ao usuário que digite o valor do salário e o valor do benefício, que são lidos e armazenados nas variáveis correspondentes.
Cálculo do Imposto:

O programa verifica em qual faixa de salário o valor do salário se encontra e calcula o imposto a ser deduzido:
Se o salário está entre R$ 0 e R$ 1.100, o imposto é 5% do salário.
Se o salário está entre R$ 1.100,01 e R$ 2.500, o imposto é 10% do salário.
Se o salário é superior a R$ 2.500, o imposto é 15% do salário.
Cálculo do Salário Final:

O valor final do salário é calculado somando o salário e o benefício, e subtraindo o imposto. O resultado é armazenado na variável saida.
Exibição do Resultado:

O programa imprime o valor do salário final formatado com duas casas decimais.
Exemplo de Uso
Ao executar o programa, será solicitado que o usuário insira o valor do salário e o valor do benefício. Por exemplo:

```
Digite o valor do salário: R$1500
Digite o valor do benefício: R$300

```
O programa calculará o imposto e exibirá o valor total após a dedução:

```
O valor do salário com desconto é: 1710.00
```


## ✨ Considerações

O programa pode ser expandido para incluir mais funcionalidades, como a validação de entradas ou a inclusão de mais faixas de imposto.


## 🛠 Tecnologias
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

