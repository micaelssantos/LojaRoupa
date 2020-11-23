package br.sp.senac.tads.controller;

import br.sp.senac.tads.dao.VendaDAO;
import br.sp.senac.tads.model.Venda;
import java.sql.Date;
import javax.xml.crypto.Data;
import java.util.ArrayList;

public class VendaController 
        
    
{
    
  
    public static boolean Adicionar(float valorVenda, int idcliente, String nomeCliente, Date data) {
        
        Venda model = new Venda();
        
        model.setNomeCliente(nomeCliente);
        model.setIdCliente(idcliente);
        model.setData(data);
        model.setValorvenda(valorVenda);
   

        return VendaDAO.Inserir(model);
    }

    public static boolean Consultar(float valorVenda, int idcliente, String nomeCliente, Date data) {
        
        Venda model = new Venda();
        
        model.setNomeCliente(nomeCliente);
        model.setIdCliente(idcliente);
        model.setData(data);
        model.setValorvenda(valorVenda);
   

        return VendaDAO.Consultar(model);
    }
     public static boolean Alterar(float valorVenda, int idcliente, String nomeCliente, Date data) {
        
        Venda model = new Venda();
        
        model.setNomeCliente(nomeCliente);
        model.setIdCliente(idcliente);
        model.setData(data);
        model.setValorvenda(valorVenda);
   

        return VendaDAO.Alterar(model);
    }

   public static boolean Remover(float valorVenda, int idcliente, String nomeCliente, Date data) {
        
        Venda model = new Venda();
        
        model.setNomeCliente(nomeCliente);
        model.setIdCliente(idcliente);
        model.setData(data);
        model.setValorvenda(valorVenda);
   

        return VendaDAO.Remover(model);
    }
   
    public static String ConsultarClientePorNome(String nome) 
    {
        String result = "";
        
        result = VendaDAO.ConsultarClientePorNome(nome);
        
        return result;
        
    }
    
     public static String ConsultarClientePorCPF(String cpf) 
    {
        String result = "";
        
        result = VendaDAO.ConsultarClientePorCPF(cpf);
        
        return result;
        
    }
     
     public static String ConsultarProdutoPorNome(String nome) 
    {
        String result = "";
        
        result = VendaDAO.ConsultarProdutoPorNome(nome);
        
        return result;
        
    }
     
    public static String ConsultarProdutoPorCodigo(String cod) 
    {
        String result = "";
        
        result = VendaDAO.ConsultarProdutoPorCodigo(cod);
        
        return result;
        
    }
    
    
    //Relatório Sintético
    VendaDAO venda = new VendaDAO();
    public Object getData;

    public ArrayList listarVendaController() {
        
    ArrayList<Venda> listaVenda = new ArrayList<Venda>();
        
    listaVenda = venda.vendaRelatorio();
        
    return listaVenda;
        
    }

    public Object getIdVenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getValorvenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

