package br.sp.senac.tads.controller;

import br.sp.senac.tads.dao.ItemVendaDAO;
import br.sp.senac.tads.model.ItemVenda;
import br.sp.senac.tads.model.Produto;
import java.util.ArrayList;

public class ItemVendaController {

    //salva os itens 
    public static boolean Salvar(int idVenda, int idProduto, int qtd, double valorItem, String nome_produto, double Total) {
        ItemVenda model = new ItemVenda();
        model.setIdVenda(idVenda);
        model.setIdProduto(idProduto);
        model.setVlUnit(valorItem);
        model.setQtd(qtd);
        model.setNomeProduto(nome_produto);
        model.setTotal(Total);
        return ItemVendaDAO.daoSalvarItem(model);
    }

    public static ArrayList<ItemVenda> getItensList() {
        ArrayList<ItemVenda> item = ItemVendaDAO.getItens();
        return item;
    }

    public static ArrayList<Produto> getProdutoList() {
        ArrayList<Produto> produtos = ItemVendaDAO.getProdutos();
        return produtos;
    }

    //calculo para calcular o estoque
    public static boolean ControllerEstoque(int quantidadeTotal) {
        ArrayList<Produto> produto = ItemVendaController.getProdutoList();
        ArrayList<ItemVenda> item = ItemVendaDAO.getItens();
        boolean validar = false;
        for (Produto p : produto) {
            for (ItemVenda listaItem : item) {
                if (listaItem.getIdProduto() == p.getId() && p.getQuantidade() > -1 && quantidadeTotal <= p.getQuantidade()) {
                    int calc = p.getQuantidade();
                    calc = calc - listaItem.getQtd();
                    ItemVendaDAO.atualizarEstoque(calc, p.getId());
                    validar = true;
                }
            }
        }
        return validar;
    }

    public static boolean Consultar(int idVenda, int idProduto, float valorItem, int qtd, String nome_produto) {
        ItemVenda model = new ItemVenda();
        model.setIdVenda(idVenda);
        model.setIdProduto(idProduto);
        model.setVlUnit(valorItem);
        model.setQtd(qtd);
        model.setNomeProduto(nome_produto);
        return ItemVendaDAO.Consultar(model);
    }

    public static boolean Alterar(int idVenda, int idProduto, float valorItem, int qtd, String nome_produto) {
        ItemVenda model = new ItemVenda();
        model.setIdVenda(idVenda);
        model.setIdProduto(idProduto);
        model.setVlUnit(valorItem);
        model.setQtd(qtd);
        model.setNomeProduto(nome_produto);
        return ItemVendaDAO.Alterar(model);
    }

    public static boolean Remover(int idVenda, int idProduto, float valorItem, int qtd, String nome_produto) {
        ItemVenda model = new ItemVenda();
        model.setIdVenda(idVenda);
        model.setIdProduto(idProduto);
        model.setVlUnit(valorItem);
        model.setQtd(qtd);
        model.setNomeProduto(nome_produto);
        return ItemVendaDAO.Remover(model);
    }

    //pega alista de itens     
    public static ArrayList<String[]> getItemLista(ArrayList<ItemVenda> listaItem, ArrayList<String[]> listaVazia, String nomeProduto) {
        for (ItemVenda item : listaItem) {
            listaVazia.add(new String[]{
                String.valueOf(item.getNomeProduto()),
                String.valueOf(item.getQtd()),
                String.valueOf(item.getVlUnit()),
                String.valueOf(item.getTotal())});
        }
        return listaVazia;
    }

    public static void limparlista() {
        ItemVendaDAO.Excluiritem();
    }
}