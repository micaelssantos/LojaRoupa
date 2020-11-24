package br.sp.senac.tads.controller;

import br.sp.senac.tads.dao.ClienteDAO;
import br.sp.senac.tads.model.Cliente;
import java.util.ArrayList;

public class ClienteController {

    ClienteDAO cliente = new ClienteDAO();

    public void cadastrarController(Cliente cliBean) {

        cliente.adicionar(cliBean);

    }

    public void alterarController(Cliente cliBean) {

        cliente.alterar(cliBean);
        
    }

    public void removerController(Cliente cliBean) {

        cliente.remover(cliBean);

    }
    
    
    
     public ArrayList consultarController(Cliente cliBean) {
        
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        
        listaCliente = cliente.consultarCliente(cliBean);
        
        return listaCliente;
        
    }
    
    public ArrayList listarTabelaController() {
        
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        
        listaCliente = cliente.listarTabelaCliente();
        
        return listaCliente;
        
    }
    
    public ArrayList pesquisarController(Cliente cliBean) {
        
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        
        listaCliente= cliente.pesquisarCliente(cliBean);
        
        return listaCliente;
        
    }
    
    
    
    

    public static boolean Adicionar(String nome, String CPF, String dataNascimento, String estadoCivil, String sexo, String CEP,
            String logradouro, String numero, String telefone, String celular, String email) {
        Cliente obj = new Cliente();
        obj.setNomeCliente(nome);
        obj.setCPF(CPF);
        obj.setDataNascimento(dataNascimento);
        obj.setEstadoCivil(estadoCivil);
        obj.setSexo(sexo);
        obj.setCEP(CEP);
        obj.setLogradouro(logradouro);
        obj.setNumero(numero);
        obj.setTelefone(telefone);
        obj.setCelular(celular);
        obj.setEmail(email);

        return ClienteDAO.adicionar(obj);
    }

    public static boolean Consultar(String nome, String CPF, String dataNascimento, String estadoCivil, String sexo, String CEP,
            String logradouro, String numero, String telefone, String celular, String email) {
        Cliente obj = new Cliente();
        obj.setNomeCliente(nome);
        obj.setCPF(CPF);
        obj.setDataNascimento(dataNascimento);
        obj.setEstadoCivil(estadoCivil);
        obj.setSexo(sexo);
        obj.setCEP(CEP);
        obj.setLogradouro(logradouro);
        obj.setNumero(numero);
        obj.setTelefone(telefone);
        obj.setCelular(celular);
        obj.setEmail(email);

        return ClienteDAO.consultar(obj);
    }

    public static boolean alterar(String nome, String CPF, String dataNascimento, String estadoCivil, String sexo, String CEP,
            String logradouro, String numero, String telefone, String celular, String email) {
        Cliente obj = new Cliente();
        obj.setNomeCliente(nome);
        obj.setCPF(CPF);
        obj.setDataNascimento(dataNascimento);
        obj.setEstadoCivil(estadoCivil);
        obj.setSexo(sexo);
        obj.setCEP(CEP);
        obj.setLogradouro(logradouro);
        obj.setNumero(numero);
        obj.setTelefone(telefone);
        obj.setCelular(celular);
        obj.setEmail(email);

        return ClienteDAO.alterar(obj);
    }

    public static boolean Remover(String nome, String CPF, String dataNascimento, String estadoCivil, String sexo, String CEP,
            String logradouro, String numero, String telefone, String celular, String email) {
        Cliente obj = new Cliente();
        obj.setNomeCliente(nome);
        obj.setCPF(CPF);
        obj.setDataNascimento(dataNascimento);
        obj.setEstadoCivil(estadoCivil);
        obj.setSexo(sexo);
        obj.setCEP(CEP);
        obj.setLogradouro(logradouro);
        obj.setNumero(numero);
        obj.setTelefone(telefone);
        obj.setCelular(celular);
        obj.setEmail(email);

        return ClienteDAO.remover(obj);
    }
}
