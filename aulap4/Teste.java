
package aulap4;

/**
 *
 * @author Israel
 */
public class Teste {

    public static void main(String[] args) {
        int num = 81;
        double x = Math.sqrt(num);
        System.out.println("A raiz quadrada de "+num+" é "+x);
 
        System.out.println("Valor absoluto: "+Math.abs(-81.4));
        System.out.println("Seno: "+Math.sin(90.0));
        System.out.println("Seno: "+Math.sin(Math.toRadians(90)));
        System.out.println("Max: "+Math.max(85, 20));
        
        String nome = "Fulano";
        String frase = "Meu nome é ";
        String completa = frase + nome;
 
        System.out.println(completa);
        System.out.println("O tamanho do nome é: "+nome.length());
        System.out.println("O caracter da posicao 2 é: "+nome.charAt(1));
        System.out.println("Frase toda em maiúsculas: " +completa.toUpperCase());
        System.out.println("Trecho de 2 a 8: "+completa.substring(2,8));
        System.out.println("Retira os espaços antes e depois: "+frase.trim());
        System.out.println("Substituindo Fulano por Sicrano: "+completa.replace("Fulano", "Sicrano"));
        
        System.out.println("Nome alterado: "+nome.replace('o', 'a'));
        System.out.println("Frase toda em minuscula: "+completa.toLowerCase());
        String sobrenome = "Sobrenome";
        System.out.println("Concatenação nome com sobrenome: "+nome.concat(sobrenome));
        
    }
    
}
