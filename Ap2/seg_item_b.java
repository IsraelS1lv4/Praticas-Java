package Ap2;

import java.util.Scanner;

/**
 *
 * @author Israel
 */
public class seg_item_b {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int X;
        System.out.println("Digite a quantidade de valores (entre 7 e 5000): ");
        X = ler.nextInt();
        if(X>=7 && X<=5000){
            for(int i=1;i<=X;i++){
                System.out.println((int)(Math.random()*(121-3))+3); 
            } 
        }else{
            System.out.println("\nO numero digitado deve ser de 7 ate 5000");
        }
        
    }
    
}
