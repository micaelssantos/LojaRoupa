package br.sp.senac.tads.controller;

import br.sp.senac.tads.dao.ItemVendaDAO;
import br.sp.senac.tads.model.ItemVenda;
import java.sql.Date;

public class ItemVendaController 
{
    
    public static boolean Adicionar(int idVenda, int idProduto, float valorItem,int qtd, String nome_produto) {
        
        ItemVenda model = new ItemVenda();
        
        model.setIdVenda(idVenda);
        model.setIdProduto(idProduto);
        model.setVlUnit(valorItem);
        model.setQtd(qtd);
        model.setNomeProduto(nome_produto);
        
   

        return ItemVenda.Inserir(model);
    }

    public static boolean Consultar(int idVenda, int idProduto, float valorItem,int qtd, String nome_produto) {
        
        ItemVenda model = new ItemVenda();
        
        model.setIdVenda(idVenda);
        model.setIdProduto(idProduto);
        model.setVlUnit(valorItem);
        model.setQtd(qtd);
        model.setNomeProduto(nome_produto);
        
   

        return ItemVenda.Consultar(model);
    }
    public static boolean Alterar(int idVenda, int idProduto, float valorItem,int qtd, String nome_produto) {
        
        ItemVenda model = new ItemVenda();
        
        model.setIdVenda(idVenda);
        model.setIdProduto(idProduto);
        model.setVlUnit(valorItem);
        model.setQtd(qtd);
        model.setNomeProduto(nome_produto);
        
   
        return ItemVenda.Alterar(model);
    }

    public static boolean Remover(int idVenda, int idProduto, float valorItem,int qtd, String nome_produto) {
        
        ItemVenda model = new ItemVenda();
        
        model.setIdVenda(idVenda);
        model.setIdProduto(idProduto);
        model.setVlUnit(valorItem);
        model.setQtd(qtd);
        model.setNomeProduto(nome_produto);
        
   
        return ItemVenda.(model);
    }
    
    
}
