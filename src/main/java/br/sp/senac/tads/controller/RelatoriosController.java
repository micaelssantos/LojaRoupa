package br.sp.senac.tads.controller;

/**
 *
 * @author renea
 */
import br.sp.senac.tads.model.Relatorios;
import br.sp.senac.tads.dao.RelatoriosDAO;
import java.sql.Date;
import java.util.ArrayList;

public class RelatoriosController {

    RelatoriosDAO relatorio = new RelatoriosDAO();

    public ArrayList listarRelatorioController(String inicio, String fim) {

        ArrayList<Relatorios> listaVendas = new ArrayList<Relatorios>();

        listaVendas = relatorio.consultarRelatorios(inicio, fim);

        return listaVendas;
    }

    public ArrayList listarRelatorioAnaliticoController(int id) {

        ArrayList<Relatorios> listaVendas = new ArrayList<Relatorios>();

        listaVendas = relatorio.consultarRelatorioAnalitico(id);

        return listaVendas;
    }
}
