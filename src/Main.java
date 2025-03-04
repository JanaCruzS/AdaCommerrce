import Controller.PedidoController;
import Modelos.Cliente;
import Modelos.Pedido;
import Modelos.Produto;
import Repositorios.PedidoRepositorio;
import Service.PedidoService;

public class Main {
    public static void main(String[] args) {
        PedidoRepositorio pedidoRepository = new PedidoRepositorio();
        PedidoService pedidoService = new PedidoService(pedidoRepository);
        PedidoController pedidoController = new PedidoController(pedidoService);

        Cliente cliente = new Cliente("1", "João Silva", "12345678900");
        Produto produto = new Produto("1", "Notebook", 3000.00);

        Pedido pedido = new Pedido("1", cliente);
        pedidoService.criarPedido(pedido);

        System.out.println("Adicionando item ao pedido...");
        pedidoController.adicionarPedido("1", produto, 1, 2800.00);

        System.out.println("Finalizando pedido...");
        pedidoController.finalizarPedido("1");
    }
}