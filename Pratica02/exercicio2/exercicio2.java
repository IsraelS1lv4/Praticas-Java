
package exercicio2;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        carros car1 = new carros();
        carros car2 = new carros();
        int n;
        double x, des;
        
        System.out.println("Digite a marca do carro 1: ");
        car1.setMarca(ler.next());
        System.out.println("Digite o modelo do carro 1: ");
        car1.setModelo(ler.next());
        System.out.println("Digite o ano do carro 1: ");
        car1.setAno(ler.nextInt());
        System.out.println("Digite a quantidade de portas do carro 1: ");
        car1.setPortas(ler.nextInt());
        System.out.println("Digite o preço do carro 1: ");
        car1.setPreco(ler.nextDouble());
        
        System.out.println("Digite a marca do carro 2: ");
        car2.setMarca(ler.next());
        System.out.println("Digite o modelo do carro 2: ");
        car2.setModelo(ler.next());
        System.out.println("Digite o ano do carro 2: ");
        car2.setAno(ler.nextInt());
        System.out.println("Digite a quantidade de portas do carro 2: ");
        car2.setPortas(ler.nextInt());
        System.out.println("Digite o preço do carro 2: ");
        car2.setPreco(ler.nextDouble());
        
        System.out.println("\nCarro 1: ");
        System.out.println("Marca: "+car1.getMarca());
        System.out.println("Modelo: "+car1.getModelo());
        System.out.println("Ano: "+car1.getAno());
        System.out.println("Portas: "+car1.getPortas());
        System.out.println("Preco: R$ "+car1.getPreco());
        
        System.out.println("\nCarro 2: ");
        System.out.println("Marca: "+car2.getMarca());
        System.out.println("Modelo: "+car2.getModelo());
        System.out.println("Ano: "+car2.getAno());
        System.out.println("Portas: "+car2.getPortas());
        System.out.println("Preco: R$ "+car2.getPreco());
        
        System.out.println("Digite o numero do carro que deseja aplicar desconto: ");
        n = ler.nextInt();
        if(n==1 || n==2){
            System.out.println("Digite o valor do desconto(em %) a ser aplicado: ");
            x = ler.nextDouble();
            if(n==1){
                System.out.println("Valor sem desconto: R$ "+car1.Preco);
                car1.verDesconto(x);
            }else{
                System.out.println("Valor sem desconto: R$ "+car2.Preco);
                car2.verDesconto(x);
            }
        }else{
            System.out.println("NUMERO INVALIDO!");
        }
        
    }
    
}
