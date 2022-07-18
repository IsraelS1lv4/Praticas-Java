
package aula01;


public class Principal {
    public static void main(String[] args) {
        Contas c1;
        c1 = new Contas();
        
        c1.nome = "Fulano 1";
        c1.numero = 100;
        c1.saldo = 500;
        
        c1.depositar(120);
        
        System.out.println("Titular de c1: "+c1.nome);
        System.out.println("Saldo de c1 = "+c1.saldo);
        
        Contas c2;
        c2 = new Contas();
        
        c2.nome = "Fulano 2";
        c2.numero = 62;
        c2.saldo = 600;
        
        c2.depositar(80);
        
        System.out.println("Titular de c1: "+c2.nome);
        System.out.println("Saldo de c1 = "+c2.saldo);
        
        c1.sacar(80);
        c2.sacar(120);
        
        System.out.println("\n Conta c1\nNome do titular: "+c1.nome);
        System.out.println("Numero da conta: "+c1.numero);
        System.out.println("Saldo: "+c1.saldo);
        System.out.println("\n Conta c2\nNome do titular: "+c2.nome);
        System.out.println("Numero da conta: "+c2.numero);
        System.out.println("Saldo: "+c2.saldo);
 
    }
}
