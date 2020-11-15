package br.sp.senac.tads.model;

import java.sql.Date;
import javax.xml.crypto.Data;

public class Venda {
    
    private int IdVenda;
    private int IdCliente;
    private float valorvenda;
    private String nomeCliente;
    private Date data;

    public int getIdVenda() {
        return IdVenda;
    }

    public void setIdVenda(int IdVenda) {
        this.IdVenda = IdVenda;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValorvenda() {
        return valorvenda;
    }

    public void setValorvenda(float valorvenda) {
        this.valorvenda = valorvenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
}
