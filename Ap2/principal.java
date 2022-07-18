package Ap2;


/**
 *
 * @author Israel
 */
public class principal {

    public static void main(String[] args) {
        Funcionario obj1 = new Funcionario();
        Pessoas obj2 = new Pessoas();
        
        //atribuindo valores (sets) ao obj1 
        String nome1 = "Joao";
        String sexo1 = "Masculino";
        int idade1 = 25;
        String profissao = "Gerente";
        
        obj1.setNome(nome1);
        obj1.setSexo(sexo1);
        obj1.setIdade(idade1);
        obj1.setProfissao(profissao);
        
        //atribuindo valores (sets) ao obj2
        String nome2 = "Maria";
        String sexo2 = "Feminino";
        int idade2 = 27;
        
        obj2.setNome(nome2);
        obj2.setSexo(sexo2);
        obj2.setIdade(idade2);
        
        //exibindo valores do obj1
        System.out.println("\nObj1\nNome: " + obj1.getNome());
        System.out.println("Sexo: " + obj1.getSexo());
        System.out.println("Idade: " + obj1.getIdade());
        System.out.println("Profissao: " + obj1.getProfissao());
        
        //exibindo valores do obj2
        System.out.println("\nObj2\nNome: " + obj2.getNome());
        System.out.println("Sexo: " + obj2.getSexo());
        System.out.println("Idade: " + obj2.getIdade());
    }
    
}
