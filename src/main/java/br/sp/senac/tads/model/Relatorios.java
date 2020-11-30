package br.sp.senac.tads.model;

/**
 *
 * @author renea
 */

import java.sql.Date;
import java.util.ArrayList;

public class Relatorios {
    
private int IdVenda;
    private String nomeCliente;
    private float valorvenda;
    private float valorTotalvenda;
    private Date data;

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

    public float getValorvenda() {
        return valorvenda;
    }

    public void setValorvenda(float valorvenda) {
        this.valorvenda = valorvenda;
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