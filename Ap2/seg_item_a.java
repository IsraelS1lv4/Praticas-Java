package Ap2;

import java.util.Scanner;

/**
 *
 * @author Israel
 */
public class seg_item_a {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int N;
        
        System.out.println("Digite um numero: ");
        N = ler.nextInt();
        
        System.out.println("Potencia cubica de " + N + ": " + Math.pow(N, 3));
        System.out.println("Logaritmo natural de " + N + ": " + Math.log(N));
        System.out.println("Logaritmo na base 10 de " + N + ": " + Math.log10(N));
        
    }
    
}
