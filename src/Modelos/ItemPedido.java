package Modelos;

public class ItemPedido {

    //atributos
    private Produto produto;
    private int quantidade;
    private double precoUnitario;
    public double getPrecoTotal;

    //Construtor
    public ItemPedido(Produto produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    //metodos acessores

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public double getPrecoTotal() {
        return quantidade * precoUnitario;
    }
}
