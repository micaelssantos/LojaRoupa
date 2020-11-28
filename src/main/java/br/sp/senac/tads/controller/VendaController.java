package br.sp.senac.tads.controller;

import br.sp.senac.tads.dao.ItemVendaDAO;
import br.sp.senac.tads.dao.VendaDAO;
import br.sp.senac.tads.model.ItemVenda;
import br.sp.senac.tads.model.Produto;
import br.sp.senac.tads.model.Venda;
import java.sql.Date;
import javax.xml.crypto.Data;
import java.util.ArrayList;

public class VendaController 
        
{ 
    public static boolean Adicionar(int idcliente, double valorVenda, String nomeCliente, Date data, ArrayList<ItemVenda> item) {
        
        boolean inserido = false;
        
        Venda model = new Venda();
        
        model.setNomeCliente(nomeCliente);
        model.setIdCliente(idcliente);
        model.setData(data);
        model.setValorvenda(valorVenda);
        
        inserido = VendaDAO.Inserir(model);
        
        if (inserido == true) {
            
            int ultimoID = VendaDAO.IDVenda();
         
            for (ItemVenda lista : item) {

                ItemVendaDAO.Inserir(lista, ultimoID);
            }
        }
        
        return true;
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
     public static int PegarIDClientePorNome(String nome) 
     {
         int idResult = 0;
         
         idResult = VendaDAO.PegarIDClientePorNome(nome);
         
         return idResult;
     }
     
      public static int PegarIDClientePorCPF(String CPF) 
     {
         int idResult = 0;
         
         idResult = VendaDAO.PegarIDClientePorCPF(CPF);
         
         return idResult;
     }
     
     public static String ConsultarProdutoPorNome(String nome) 
    {
        String result = "";
        
        result = VendaDAO.ConsultarProdutoPorNome(nome);
        
        return result;
        
    }
     
      public static int ConsultarQuantidadePRPorNome(String nome) 
    {
        int result ;
        
        result = VendaDAO.ConsultarQuantidadePRPorNome(nome);
        
        
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



    public static int ConsultarQuantidadePRPorCOD(int cod) 
    {
        int result ;
        
        result = VendaDAO.ConsultarQuantidadePRPorCOD(cod);
        
        return result;
        
    }
     
    public static int ConsultarProdutoPorCodigo(int cod) 
    {
         int result ;
        
        result = VendaDAO.ConsultarProdutoPorCodigo(cod);
        return result;
    }
    
     public static ArrayList<Produto> ConsultarProduto(int COD) {
        
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        
        listaProduto = VendaDAO.pesquisarProduto(COD);
        
        return listaProduto;
    }
      public static ArrayList<Produto> ConsultarProdutoNome(String nome) {
        
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        
        listaProduto = VendaDAO.pesquisarProdutoNome(nome);
        
        return listaProduto;
    }
    
    

}

