
package aula01;

public class Contas {
   int numero;
   String nome;
   double saldo;
   
   void depositar (double valor){
       this.saldo = this.saldo + valor;
   }
   
   boolean sacar (double valor){
       if (this.saldo >= valor ){
           this.saldo = this.saldo - valor;
           return (true);
       }else{
           return (false);
       }
   }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }
    
}
