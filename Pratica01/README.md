<h2> UNIVERSIDADE FEDERAL DO CEARÁ – UFC SOBRAL<br>
TÉCNICAS DE PROGRAMAÇÃO 
AULA PRÁTICA: 1 - JAVA </h2>
 
EXERCÍCIO PRÁTICO :
Criar nova classe Contas, com as seguintes variáveis: Nº da conta (inteiro), Nome do titular 
(String), e Valor do saldo (double). Criar os métodos ```depositar()```, ```sacar()```, ```getSaldo()```, ```getNumero()``` 
e ```getNomeTitular()```.
```
package exemplos;
public class Contas{
  int numero;
  String nomeTitular;
  double saldo;
  void depositar(double valor){
    this.saldo = this.saldo + valor;
  }
  // adicionar os demais métodos
}
```
Em seguida, em um novo arquivo, faça um programa principal que crie 2 objetos chamados c1
e c2, instanciando a classe recém-criada Contas e atribua os devidos valores a cada um dos 
objetos, efetue um depósito e depois realize um saque. Por fim, use os métodos da classe Contas
para mostrar os valores atualizados de cada um dos objetos.
```
package exemplos;
public class Principal{
  public statis void main(String[] args){
  Contas c1;
  c1 = new Contas();
  c1.nomeTitular = "Fulano1";
  c1.depositar(100);
  System.out.println("Titular: "+c1.nomeTitular);
  // Imprima também o saldo
  // Crie o segundo objeto
  // Use também os métodos sacar() e os gets()
  }
}
```
