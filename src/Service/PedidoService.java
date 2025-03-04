package Service;

import Modelos.ItemPedido;
import Modelos.Pedido;
import Modelos.Produto;
import Repositorios.PedidoRepositorio;

public class PedidoService {

    private PedidoRepositorio pedidoRepositorio;

    public PedidoService(PedidoRepositorio pedidoRepositorio) {
        this.pedidoRepositorio = pedidoRepositorio;
    }

    public void criarPedido(Pedido pedido) {
        pedidoRepositorio.adicionarPedido(pedido);
    }

    public void adicionarItemPedido(String pedidoId, Produto produto, int quantidade, double preco) {
        Pedido pedido = pedidoRepositorio.buscarPedido(pedidoId);
        if (pedido != null && pedido.getStatus().equals("ABERTO")) {
            pedido.adicionarItem(new ItemPedido(produto, quantidade, preco));
            pedidoRepositorio.atualizarPedido(pedido);
        }
    }

    public void finalizarPedido(String pedidoId) {
        Pedido pedido = pedidoRepositorio.buscarPedido(pedidoId);
        if (pedido != null) {
            pedido.finalizarPedido();
            pedidoRepositorio.atualizarPedido(pedido);
           }
    }
}


