<h2> UNIVERSIDADE FEDERAL DO CEARÁ – UFC SOBRAL<br>
TÉCNICAS DE PROGRAMAÇÃO <br>
AULA PRÁTICA: 3 - JAVA </h2>

EXERCÍCIO PRÁTICO - 1)
Acesse a página do curso e baixe o arquivo Contas.java. Crie um novo projeto chamado AulaP3
e adicione Contas.java a esse projeto. Crie uma segunda classe para estender as características
da classe Conta. Chame o arquivo de ContaPoupanca.java. A classe ContaPoupanca deve
herdar os atributos e métodos de Contas.java; para isso, o arquivo deve ser escrito conforme a
seguir:
```
public class ContaPoupanca extends Contas{
}
Em seguida, adicione um método reajustar em ContaPoupanca.java, conforme abaixo:
public void reajustar(double taxa){
 double saldoAtual = this.getSaldo();
 double reajuste = saldoAtual * taxa;
 this.depositar(reajuste);
}
```
Em um terceiro arquivo, denominado Principal.java, faça:
```
 ContaPoupanca cp;
 cp = new ContaPoupanca();
 cp.depositar(1000); //Tente atribuir cp.saldo=1000;
 cp.reajustar(0.2);
 cp.sacar(500);
 System.out.println("Saldo conta poup: " + cp.getSaldo());
```
Em seguida, fazer:<br>
1. Criar um outro método Reajustar, sem parâmetro (por padrão, multiplicar por 0,1)<br>
2. Criar objeto c para Contas<br>
3. Imprimir tipo de contas: ```c.tipoConta()```; e ```cp.tipoConta()```;<br>
4. Em seguida, criar método ```tipoConta()``` em ContaPoupanca e repetir a chamada
```cp.tipoConta()```;<br>
5. Aplicar um pouco de interface gráfica:<br>
a. Usar ```import javax.swing.JOptionPane```<br>
b. ```String name = JOptionPane.showInputDialog("Digite seu nome");```<br>
c. ```JOptionPane.showMessageDialog(null, "Bem vindo "+name)```<br>

<strong>NOTA: 10 </strong>
