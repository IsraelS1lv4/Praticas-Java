<h2> UNIVERSIDADE FEDERAL DO CEARÁ – UFC SOBRAL<br>
TÉCNICAS DE PROGRAMAÇÃO <br>
AULA PRÁTICA: 2 - JAVA </h2>

EXERCÍCIO PRÁTICO - 1)
Faça um programa que solicite ao usuário um valor de 3 a 90, agora denominado 𝑋. Em seguida, 
imprima os 𝑋 primeiros elementos da série de Fibonacci. A série é a seguinte: 1, 1, 2, 3, 5, 8, 13 𝑒𝑡𝑐.
Para calculá-la, o primeiro e segundo elementos valem 1; daí por diante, cada elemento vale a 
soma dos dois elementos anteriores.
Para a leitura de um número digitado pelo usuário, dentro do método main, coloque:

```
 Scanner ler = new Scanner(System.in);
 int i, n;
 System.out.printf("Digite um número\n");
 n = ler.nextInt();
```
No início do arquivo, coloque “```Import java.util.Scanner;```”

EXERCÍCIO PRÁTICO – 2)
Faça uma classe java chamada carros com as seguintes características:

Atributos:<br>
  • Marca (String)<br>
  • Modelo (String)<br>
  • Ano (Integer)<br>
  • Portas (Integer)<br>
  • Preco (Double)<br>
  
Métodos:<br>
  • setMarca <br>
  • setModelo <br>
  • setAno <br>
  • setPortas <br>
  • setPreco<br>
  • getMarca<br>
  • getModelo<br>
  • getAno <br>
  • getPortas<br>
  • getPreco<br>
  
Em seguida, em um novo arquivo, faça um programa principal que crie 2 objetos chamados obj1 
e obj2, instanciando a classe recém-criada carros. Inicialmente, o programa deve perguntar ao 
usuário a marca, modelo, ano, portas e preço de cada um dos 2 objetos. Use Scanner para ler as 
informações do usuário e os “```sets```” para atribuir. Em seguida, usando os “```gets```”, imprima todos 
os atributos de cada um dos dois objetos.
Por fim, crie um novo método chamado verDesconto, que vai exibir o preço do carro com um 
desconto de 𝑥 %, sendo 𝑥 um desconto informado pelo usuário em tempo de execução. 
Atenção: o método não deve alterar o preço salvo, apenas exibirá o novo preço com o desconto.

<strong>NOTA: 8 </strong>
