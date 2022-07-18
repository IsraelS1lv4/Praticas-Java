
package exercicio2;

public class carros {
    String Marca, Modelo;
    int Ano, Portas;
    double Preco;

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    public void setAno(int Ano) {
        this.Ano = Ano;
    }
    public void setPortas(int Portas) {
        this.Portas = Portas;
    }
    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    public String getMarca() {
        return Marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public int getAno() {
        return Ano;
    }
    public int getPortas() {
        return Portas;
    }
    public double getPreco() {
        return Preco;
    }
    
    public double verDesconto(double x){
        double desconto;
        desconto = Preco-(Preco *(x/100));
        System.out.println("O valor do desconto: "+(Preco *(x/100)));
        System.out.println("O valor do carro com desconto: R$ "+desconto);
        return desconto;
    }
    
}
