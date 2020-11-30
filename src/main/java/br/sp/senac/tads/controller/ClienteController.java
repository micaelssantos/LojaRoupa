package br.sp.senac.tads.controller;

import br.sp.senac.tads.dao.ClienteDAO;
import br.sp.senac.tads.model.Cliente;
import java.util.ArrayList;

public class ClienteController {

    ClienteDAO cliente = new ClienteDAO();

    public void cadastrarController(Cliente clienteBean) {
        cliente.cadastrarCliente(clienteBean);
    }
    
    public void alterarContrller(Cliente clienteBean) {
        cliente.alterarCliente(clienteBean);
    }
    
    public void removerController(Cliente clienteBean) {
        cliente.removerCliente(clienteBean);
    }
    
    public ArrayList consultarController(Cliente clienteBean) {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        listaCliente = cliente.consultarCliente(clienteBean);
        return listaCliente;
    }
    
    public ArrayList listarTabelaController() {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        listaCliente = cliente.listarTabelaCliente();
        return listaCliente;
    }
    
    public ArrayList pesquisarNomeController(Cliente clienteBean) {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        listaCliente = cliente.pesquisarClienteNome(clienteBean);
        return listaCliente;
    }
    
    public ArrayList pesquisarCpfController(Cliente clienteBean) {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        listaCliente = cliente.pesquisarClienteCpf(clienteBean);
        return listaCliente;
    }
}