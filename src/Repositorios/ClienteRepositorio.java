package Repositorios;

import Modelos.Cliente;

import java.util.HashMap;
import java.util.Map;

public class ClienteRepositorio {
    private Map<String, Cliente> clientes = new HashMap<>(); // acessa um cliente

    // metodos
    public void adicionaCliente(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
    }

    public Cliente buscaCliente (String id) {
        return clientes.get(id);
    }

    public void atualizaCliente(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);

    }

}
