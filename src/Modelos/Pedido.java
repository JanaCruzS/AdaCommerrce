package Modelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    //atributos
    private String id;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private String status;
    private LocalDate dataCriacao;

    // construtor
    // - recebe String id, e e um atributo cliente do tipo cliente
    //- o construtor cria uma array list assim que o pedido é instaciado no atributo itens
    // - o status do pedido já é criado como "ABERTO" assim que é criado
    // o atributo "dataCriacao" sera criado com a data do pedido instanciado
    public Pedido(String id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.status = "ABERTO";
        this.dataCriacao = LocalDate.now();
    }

    // metodos
    public void adicionarItem(ItemPedido item) {
        if (!status.equals("ABERTO")) return;
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        if (!status.equals("ABERTO")) return;
        itens.remove(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getPrecoTotal;
        }
        return total;
    }

    public void finalizarPedido() {
        if (itens.isEmpty() || calcularTotal() == 0) return;
        status = "AGUARDANDO PAGAMENTO";
        System.out.println("notificação de pagamento enviada...");
    }

    public void pagar() {
        if (!status.equals("AGUARDANDO PAGAMENTO")) return;
        status = "PEDIDO FOI PAGO";
        System.out.println("notificação de pagamento recebido enviada...");
    }

    public void entregar() {
        if (!status.equals("PEDIDO FOI PAGO")) return;
        status = "FINALIZADO";
        System.out.println("O PEDIDO JA FOI FINALIZADO E NOTIFICAÇÃO ENVIADA...");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

