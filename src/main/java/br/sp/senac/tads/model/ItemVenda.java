package br.sp.senac.tads.model;

public class ItemVenda 
{
    private int IdItem;
    private int IdProduto;
    private int IdVenda;

    public int getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(int IdProduto) {
        this.IdProduto = IdProduto;
    }

    public int getIdVenda() {
        return IdVenda;
    }

    public void setIdVenda(int IdVenda) {
        this.IdVenda = IdVenda;
    }
    private String nomeProduto;
    private int qtd;
    private float vlUnit;
    private float total;

    public int getIdItem() {
        return IdItem;
    }

    public void setIdItem(int IdItem) {
        this.IdItem = IdItem;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getVlUnit() {
        return vlUnit;
    }

    public void setVlUnit(float vlUnit) {
        this.vlUnit = vlUnit;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
   
}
