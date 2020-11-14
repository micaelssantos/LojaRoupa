package br.sp.senac.tads.controller;

import br.sp.senac.tads.dao.ProdutoDAO;
import br.sp.senac.tads.model.Produto;
import java.util.ArrayList;

public class ProdutoController {
    
    ProdutoDAO produto = new ProdutoDAO();
    
    public void cadastrarController(Produto prodBean) {
        
        produto.cadastrarProduto(prodBean);
        
    }
    
    public void alterarController(Produto prodBean) {
        
        produto.alterarProduto(prodBean);
        
    }
    
    public void removerController(Produto prodBean) {
        
        produto.removerProduto(prodBean);
        
    }
    
    public ArrayList consultarController(Produto prodBean) {
        
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        
        listaProduto = produto.consultarProduto(prodBean);
        
        return listaProduto;
        
    }
    
    public ArrayList listarTabelaController() {
        
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        
        listaProduto = produto.listarTabelaProduto();
        
        return listaProduto;
        
    }
    
    public ArrayList pesquisarController(Produto prodBean) {
        
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        
        listaProduto = produto.pesquisarProduto(prodBean);
        
        return listaProduto;
        
    }
    
    
}
