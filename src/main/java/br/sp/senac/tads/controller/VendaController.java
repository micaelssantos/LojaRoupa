package br.sp.senac.tads.controller;

import br.sp.senac.tads.dao.VendaDAO;
import br.sp.senac.tads.model.Venda;
import java.sql.Date;
import javax.xml.crypto.Data;

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
}
