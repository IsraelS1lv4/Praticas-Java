package exercicio1;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, serie=1, ant1=1, ant2=1;
        System.out.print("Digite um numero entre 3 e 90: ");
        n = ler.nextInt();
        System.out.println("Os "+n+" primeiros numeros da serie: ");
        if(n>2 && n<=90){
            for (int i = 1; i <= n; i++) {
                if (i < 3) {
                    System.out.println(serie );
                } else {
                    if(i%2==0){
                        serie = serie + ant1;
                        ant1=serie;
                    }else{
                        serie = serie + ant2;
                        ant2=serie;
                    }
                    System.out.println(serie);
                }
            }
        }else{
            System.out.println("NUMERO INVÁLIDO!");
        }
    }
}

