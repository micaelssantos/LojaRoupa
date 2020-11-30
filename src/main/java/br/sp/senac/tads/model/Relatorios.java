package br.sp.senac.tads.model;

/**
 *
 * @author renea
 */
import java.sql.Date;

public class Relatorios {

    private int IdVenda;
    private int IdProduto;
    private String nomeProduto;
    private float valorTotalItem;
    private String nomeCliente;
    private float valorItem;
    private float valorTotalvenda;
    private Date data;
    private int quantidade;

    /**
     * Construtor Vazio do Objeto Relatório
     */
    public Relatorios() {
    }

    /**
     * Metódo que retorna a quantidade de itens
     * 
     * @return quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Metódo que insere a quantidade de itens
     * 
     * @param quantidade 
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Metódo que retorna o ID do Produto
     * 
     * @return IdProduto
     */
    public int getIdProduto() {
        return IdProduto;
    }

    /**
     * Método que insere o Id do Produto
     * 
     * @param IdProduto 
     */
    public void setIdProduto(int IdProduto) {
        this.IdProduto = IdProduto;
    }

    /**
     * Método que retorna o Nome do Produto
     * 
     * @return nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * Método que insere o Nome do Produto
     * 
     * @param nomeProduto 
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * Método que retorna o Valor Total do Item
     * 
     * @return valorTotalItem
     */
    public float getValorTotalItem() {
        return valorTotalItem;
    }

    /**
     * Metódo que insere o Valor Total do Item
     * 
     * @param valorTotalItem 
     */
    public void setValorTotalItem(float valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
    }

    /**
     * Método que retorna o Id da Venda
     * 
     * @return IdVenda
     */
    public int getIdVenda() {
        return IdVenda;
    }

    /**
     * Método que insere o ID da Venda
     * 
     * @param IdVenda 
     */
    public void setIdVenda(int IdVenda) {
        this.IdVenda = IdVenda;
    }

    /**
     * Método que retorna o Nome do Cliente
     * 
     * @return nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Método que insere o nome do Cliente
     * 
     * @param nomeCliente 
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * Método que Retorna o Valor do Item
     * 
     * @return valorItem
     */
    public float getValorItem() {
        return valorItem;
    }

    /**
     * Método que insere o Valor do Item
     * 
     * @param valorItem 
     */
    public void setValorItem(float valorItem) {
        this.valorItem = valorItem;
    }
    
    /**
     * Método que retorna o valor total Venda
     * 
     * @return valorTotalVenda
     */
    public float getValorTotalvenda() {
        return valorTotalvenda;
    }

    /**
     * Método que insere o valor total da venda
     * 
     * @param valorTotalvenda 
     */
    public void setValorTotalvenda(float valorTotalvenda) {
        this.valorTotalvenda = valorTotalvenda;
    }

    /**
     * Método que retorna a data da Venda
     * 
     * @return data
     */
    public Date getData() {
        return data;
    }

    /**
     * Método que insere a data da venda
     * 
     * @param data 
     */
    public void setData(Date data) {
        this.data = data;
    }
}
