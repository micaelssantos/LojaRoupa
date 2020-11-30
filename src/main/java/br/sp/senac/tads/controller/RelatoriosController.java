package br.sp.senac.tads.controller;

import br.sp.senac.tads.model.Relatorios;
import br.sp.senac.tads.dao.RelatoriosDAO;
import java.sql.Date;
import java.util.ArrayList;

/**
 *@author renea
 * @see br.sp.senac.tads.dao.RelatoriosDAO
 * @see br.sp.senac.tads.model.Relatorios
 */
public class RelatoriosController {
  
 /**
 * @param - Objeto do Relatório Sintético
 * @return ArrayList - Apresenta as vendas realizadas num determinda período
 * Método que apresenta a consulta das vendas por período
 */
    RelatoriosDAO relatorio = new RelatoriosDAO();

    public ArrayList listarRelatorioController(String inicio, String fim) {

        ArrayList<Relatorios> listaVendas = new ArrayList<Relatorios>();

        listaVendas = relatorio.consultarRelatorios(inicio, fim);

        return listaVendas;
    }

 /**
 * @param - Objeto do Relatório Análitico
 * @return ArrayList - Apresenta a venda detalhada, item a item, de uma venda realizada em um determinado cliente
 * Método de consultar da venda especifica de seu cliente
 */
    public ArrayList listarRelatorioAnaliticoController(int id) {

        ArrayList<Relatorios> listaVendas = new ArrayList<Relatorios>();

        listaVendas = relatorio.consultarRelatorioAnalitico(id);

        return listaVendas;
    }
}