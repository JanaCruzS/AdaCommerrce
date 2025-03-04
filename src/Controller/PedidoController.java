package Controller;

import Modelos.Pedido;
import Modelos.Produto;
import Service.PedidoService;

public class PedidoController {

    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    //metodos

    public void criarPedido (Pedido pedido) {
        pedidoService.criarPedido(pedido);
    }

    public void adicionarPedido(String pedidoId, Produto produto, int quantidade, double preco) {
        pedidoService.adicionarItemPedido(pedidoId, produto, quantidade, preco);
        System.out.println("Item adicionado com sucesso!");
    }

    public void finalizarPedido (String pedidoId) {
        pedidoService.finalizarPedido(pedidoId);
        System.out.println("Pedido finalizado com sucesso!");
    }

}
