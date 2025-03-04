package Modelos;

public class Produto {
    //atributos
    private String id;
    private String nome;
     private double preco;

     //construtor
    public Produto(String id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    //metodos acessores
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
