package br.sp.senac.tads.controller;

import br.sp.senac.tads.dao.ClienteDAO;
import br.sp.senac.tads.model.Cliente;
import java.util.ArrayList;

public class ClienteController {

    /**
     * Cria uma instância do Objeto ClienteDAO
     */
    ClienteDAO cliente = new ClienteDAO();

    /**
     * Método que Realiza a comunicação da View com a DAO para Salar o Cliente.
     * 
     * @param clienteBean Recebe um Objeto do Tipo Cliente.
     */
    public void cadastrarController(Cliente clienteBean) {
        cliente.cadastrarCliente(clienteBean);
    }
    
    /**
     * Método responsável por Alterar um Cliente.
     * 
     * @param clienteBean Recebe um Objeto do Tipo Cliente.
     */
    public void alterarContrller(Cliente clienteBean) {
        cliente.alterarCliente(clienteBean);
    }
    
    /**
     * Método responsável por remover um Cliente.
     * 
     * @param clienteBean Recebe um Objeto do Tipo Cliente.
     */
    public void removerController(Cliente clienteBean) {
        cliente.removerCliente(clienteBean);
    }
    
    /**
     * Método responsável por realizar a busca de um cliente específico.
     * 
     * @param clienteBean Recebe um Objeto do Tipo Cliente.
     * @return retorna uma lista contendo o cliente pesquisado.
     */
    public ArrayList consultarController(Cliente clienteBean) {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        listaCliente = cliente.consultarCliente(clienteBean);
        return listaCliente;
    }
    
    /**
     * Método responsável por listar todos os Clientes.
     * 
     * @return Retorna uma lista de Objetos do Tipo Cliente.
     */
    public ArrayList listarTabelaController() {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        listaCliente = cliente.listarTabelaCliente();
        return listaCliente;
    }
    
    /**
     * Método responsável por pesquisar um Objeto Cliente pelo Nome.
     * 
     * @param clienteBean Recebe um Objeto do Tipo Cliente.
     * @return retorna uma lista contendo o Objeto Cliente pesquisado.
     */
    public ArrayList pesquisarNomeController(Cliente clienteBean) {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        listaCliente = cliente.pesquisarClienteNome(clienteBean);
        return listaCliente;
    }
    
    /**
     * Método responsável por pesquisar um Cliente por CPF.
     * 
     * @param clienteBean Recebe um Objeto do Tipo Cliente.
     * @return retorna uma lista contendo o Objeto Cliente pesquisado.
     */
    public ArrayList pesquisarCpfController(Cliente clienteBean) {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        listaCliente = cliente.pesquisarClienteCpf(clienteBean);
        return listaCliente;
    }
}