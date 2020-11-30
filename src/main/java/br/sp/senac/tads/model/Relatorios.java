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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(int IdProduto) {
        this.IdProduto = IdProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getValorTotalItem() {
        return valorTotalItem;
    }

    public void setValorTotalItem(float valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
    }

    public Relatorios() {
    }

    public int getIdVenda() {
        return IdVenda;
    }

    public void setIdVenda(int IdVenda) {
        this.IdVenda = IdVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getValorItem() {
        return valorItem;
    }

    public void setValorItem(float valorItem) {
        this.valorItem = valorItem;
    }

    public float getValorTotalvenda() {
        return valorTotalvenda;
    }

    public void setValorTotalvenda(float valorTotalvenda) {
        this.valorTotalvenda = valorTotalvenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
