package Repositorios;

import Modelos.Pedido;

import java.util.HashMap;
import java.util.Map;

public class PedidoRepositorio {

    private Map<String, Pedido> pedidos = new HashMap<>();

    public void adicionarPedido(Pedido pedido) {
        pedidos.put(pedido.getId(), pedido);
    }

    public void buscarPedido(String id) {
        Pedido pedido = pedidos.get(id);
    }
     public void atualizarPedido(Pedido pedido) {
        pedidos.put(pedido.getId(), pedido);
     }

     public Map<String, Pedido> listarPedidos() {
        return pedidos;
     }
}
