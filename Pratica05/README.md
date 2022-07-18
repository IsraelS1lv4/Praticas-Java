<h2> UNIVERSIDADE FEDERAL DO CEARÁ – UFC SOBRAL<br>
TÉCNICAS DE PROGRAMAÇÃO <br>
AULA PRÁTICA: 5 - JAVA </h2>

MANIPULAÇÃO DE ARQUIVOS<br>
EXERCÍCIO PRÁTICO – 1.1 – Criando arquivos txt usando FileWriter e PrintWriter<br>
```
Import java.io.FileWriter; //adicionar pacote acima
Import java.io.IOException;
Import java.io.PrintWriter;
Import java.util.Scanner;
public class Arquivo {
  public static void main(String[] args) throws IOException {
     Scanner ler = new Scanner(System.in);
     int i, n;
     System.out.printf("Informe o número para a tabuada:\n");
     n = ler.nextInt();
     FileWriter arq = new FileWriter("c:\\Tabuada.txt"); //verificar permissão
     PrintWriter gravarArq = new PrintWriter(arq);
     gravarArq.printf("+--Resultado--+%n");
     for (i=1; i<=10; i++) {
       gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
     }
     gravarArq.printf("+-------------+%n");
     arq.close();
     System.out.printf("\nTabuada do %d foi gravada com sucesso em \"d:\\
    Tabuada.txt\".\n", n);
   }
}
```
Faça os seguintes procedimentos:<br>
1. Execute o programa e digite um valor de 1 a 9;<br>
2. Verifique o conteúdo do arquivo;<br>
3. Feche o arquivo txt;<br>
4. Execute o programa e digite outro valor de 1 a 9 (diferente do primeiro);<br>
5. Verifique o conteúdo do arquivo;<br>
6. Feche o arquivo txt.<br>
Onde está o arquivo da tabuada do primeiro valor digitado? <br>

Altere a linha 15 para:<br>
```FileWriter arq = new FileWriter("c:\\Tabuada.txt", true);```<br>
Em seguida faça, novamente, os procedimentos anteriores (etapas 1 a 6). Qual a diferença?<br>

EXERCÍCIO PRÁTICO – 1.2 – Lendo arquivos usando BufferedReader<br>
```
importjava.io.BufferedReader;
importjava.io.BufferedWriter;
importjava.io.FileReader;
importjava.io.FileWriter;
importjava.io.IOException;
importjava.util.Scanner;
public class Principal {
  public static void leitor(String path) throws IOException {
     BufferedReader buffRead = new BufferedReader(new FileReader(path));
     String linha = "";
     while (true) {
       if (linha != null) {
         System.out.println(linha);
       }
     }
  }
}
```

<strong>NOTA: 10 </strong>
