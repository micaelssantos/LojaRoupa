package br.sp.senac.tads.model;

/**
 *
 * @author joliveira
 */

public class Produto {
    
    private int id;
    private String nome;
    private String categoria;
    private String marca;
    private String modelo;
    private int quantidade;
    private double valorUnitario;
    private String descricao;

    public Produto() {
    }

    public Produto(int id, String nome, String categoria, String marca, String modelo, int quantidade, double valorUnitario, String descricao) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.marca = marca;
        this.modelo = modelo;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.descricao = descricao;
    }

    public Produto(String nome, String categoria, String marca, String modelo, int quantidade, double valorUnitario, String descricao) {
        this.nome = nome;
        this.categoria = categoria;
        this.marca = marca;
        this.modelo = modelo;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
