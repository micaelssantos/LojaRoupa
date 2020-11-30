package br.sp.senac.tads.controller;

import br.sp.senac.tads.dao.ProdutoDAO;
import br.sp.senac.tads.model.Produto;
import java.util.ArrayList;

/**
*
* @author joliveira
* @see br.sp.senac.tads.dao.ProdutoDAO
* @see br.sp.senac.tads.model.Produto
* 
*/
public class ProdutoController {
    
    ProdutoDAO produto = new ProdutoDAO();
    
    /**
    * @param prodBean - Objeto do tipo Produto
    * Método que que faz a chamada do método de cadastro de produto na classe ProdutoDAO
    */
    public void cadastrarController(Produto prodBean) {
        produto.cadastrarProduto(prodBean);
    }
    
    /**
    * @param prodBean - Objeto do tipo Produto
    * Método que que faz a chamada do método de edição de produto na classe ProdutoDAO
    */
    public void alterarController(Produto prodBean) {
        produto.alterarProduto(prodBean);
    }
    
    /**
    * @param prodBean - Objeto do tipo Produto
    * Método que que faz a chamada do método de remoção de produto na classe ProdutoDAO
    */
    public void removerController(Produto prodBean) {
        produto.removerProduto(prodBean);
    }
    
    /**
    * @param prodBean - Objeto do tipo Produto
    * @return ArrayList - Com todos os dados da tabela PRODUTO no banco de dados
    * Método que que faz a chamada do método de consulta de produtos na classe ProdutoDAO
    */
    public ArrayList consultarController(Produto prodBean) {
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        listaProduto = produto.consultarProduto(prodBean);
        return listaProduto;
    }
    
    /**
    * @return ArrayList - Com apenas os dados dos campos da tabela da tela de Produtos
    * Método que que faz a chamada do método de consulta de produtos na classe ProdutoDAO
    */
    public ArrayList listarTabelaController() {
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        listaProduto = produto.listarTabelaProduto();
        return listaProduto;
    }
    
    /**
    * @param prodBean - Objeto do tipo Produto
    * @return ArrayList - Com todos os dados de um único produto da tabela PRODUTO no banco de dados
    * Método que que faz a chamada do método de consulta de produto na classe ProdutoDAO
    */
    public ArrayList pesquisarController(Produto prodBean) {
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        listaProduto = produto.pesquisarProduto(prodBean);
        return listaProduto;
    }
}
