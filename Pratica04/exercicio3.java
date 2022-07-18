
package aulap4;

import java.util.Scanner;

/**
 *
 * @author israe
 */
public class exercicio3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, i, minVal, absValue;
        System.out.println("Digite um valor para i: ");
        i = ler.nextInt();
        
        /*if (i == 0){
            a = 10;
        }else {
            a = 5;
        }*/
        a = (i == 0) ? 10:5;
        
        System.out.println("Digite um valor para b: ");
        b = ler.nextInt();
        minVal = (a < b) ? a : b;
        System.out.println("O menor valor é "+minVal);
        
        System.out.println("Digite um novo valor para a: ");
        a = ler.nextInt();
        absValue = (a < 0) ? -a : a;
        System.out.println("O valor absoluto de a: "+absValue);

    }
    
}
