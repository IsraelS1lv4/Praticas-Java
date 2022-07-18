<h2> UNIVERSIDADE FEDERAL DO CEARÁ – UFC SOBRAL<br>
TÉCNICAS DE PROGRAMAÇÃO <br>
AULA PRÁTICA: 4 - JAVA </h2>

EXERCÍCIO PRÁTICO – 1 – Math e String <br>
Crie um projeto, uma classe e, dentro do main, adicione:
```
int num = 81;
double x = Math.sqrt(num);
System.out.println("A raiz quadrada de "+num+" é "+x);
 
System.out.println("Valor absoluto: "+Math.abs(-81.4));
System.out.println("Seno: "+Math.sin(90.0));
System.out.println("Seno: "+Math.sin(Math.toRadians(90)));
System.out.println("Max: "+Math.max(85, 20));
```
Execute (faça shift + F6). <br>
Explore as demais funções de Math digitando “Math.” (observe que há um “ponto”) e
pressionando as teclas Ctrl + Espaço. Aparecerá uma listagem com todas as funções
disponíveis em Math, com uma breve explicação sobre cada uma delas. Escolha outras três
funções, atribua valores e imprima o resultado usando println, de forma similar ao código
anterior.<br>
Ainda dentro de main, faça:
```
String nome = "Fulano";
String frase = "Meu nome é ";
String completa = frase + nome;
 
System.out.println(completa);
System.out.println("O tamanho do nome é: "+nome.length());
System.out.println("O caracter da posicao 2 é: "+nome.charAt(1));
System.out.println("Frase toda em maiúsculas: " +completa.toUpperCase());
System.out.println("Trecho de 2 a 8: "+completa.substring(2,8));
System.out.println("Retira os espaços antes e depois: "+frase.trim());
System.out.println("Substituindo Fulano por Sicrano: "
+completa.replace("Fulano", "Sicrano"));
```
 
Veja as demais funções disponíveis para as Strings criadas e escolha outras três funções para
imprimir.

EXERCÍCIO PRÁTICO – 2 – MATH <br>
Crie uma aplicação que gere uma sequência de 200 valores aleatórios inteiros de 5 a 102.
Observação: ```Math.random()```, por padrão, gera números somente entre 0 e 1. Os elementos do
vetor solicitado devem ter amplitude de 5 a 102.

EXERCÍCIO PRÁTICO – 3 – OPERADOR TERNÁRIO<br>
Trata-se de uma forma compacta de realizar um if-else<br>
<strong>resultado = Condição ? valorSeVerdadeiro : valorSeFalso</strong>
```
int a;
if (i == 0){
 a = 10;
}
else {
 a = 5;
}
```
Usando operador ternário, o trecho anterior fica:
```int a = (i == 0) ? 10:5;``` <br>
Implemente os trechos abaixo e use uma classe main para testar as funcionalidades<br>
Valor mínimo:<br>
```minVal = (a < b) ? a : b;```
//ou
```minVal = a < b ? a : b;``` <br>
Valor absoluto<br>
```int absValue = (a < 0) ? -a : a;```

<strong>NOTA: 8 </strong>
