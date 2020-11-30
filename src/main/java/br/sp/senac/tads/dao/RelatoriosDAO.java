package br.sp.senac.tads.dao;

/**
 *
 * @author renea
 */
import br.sp.senac.tads.model.Relatorios;
import br.sp.senac.tads.util.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author renea
 * @see br.sp.senac.tads.util.GerenciadorConexao
 * @see br.sp.senac.tads.model.Relatorios
 *
 */

public class RelatoriosDAO {

    private static Connection conexao;

    /**
     * Driver do MySQL a partir da versão 8.0
     */
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";


    public static ArrayList<Relatorios> consultarRelatorios(String inicio, String fim) {
    /**
     * @param inicioObjeto do Relatório Sintético que pesquisa no Banco de dados as vendas relaizadas
     * num determinad período para inserir os dados no Relatório Sintético
     * @param fim
     * @return ArrayList - Apresenta todas as vendas realizadas num determinda período dos registros em Banco de Dados
     */
        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;

        //Armazeno as informaçoes da tabela (resultSet) em um ArrayList
        ArrayList<Relatorios> listaVendas = new ArrayList<>();

        try {

            Class.forName(DRIVER);

            conexao = GerenciadorConexao.abrirConexao();

            //Passo 3 - Executo a instrução SQL
            instrucaoSQL = conexao.prepareStatement("SELECT ID_VENDA, NOME_CLIENTE, VALOR_VENDA, DATA FROM VENDA WHERE DATA BETWEEN ? AND ?");

            instrucaoSQL.setString(1, inicio);
            instrucaoSQL.setString(2, fim);

            //Executa a Query (Consulta) - Retorna um objeto da classe ResultSet
            rs = instrucaoSQL.executeQuery();

            //Percorrer o resultSet
            while (rs.next()) {
                Relatorios c = new Relatorios();
                c.setIdVenda(rs.getInt("ID_VENDA"));
                c.setNomeCliente(rs.getString("NOME_CLIENTE"));
                c.setValorTotalvenda(rs.getFloat("VALOR_VENDA"));
                c.setData(rs.getDate("DATA"));

                listaVendas.add(c);
            }

            return listaVendas;

        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Falha na consulta!");
            return null;
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                conexao.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Falha ao fechar a conexão!");
            }
        }
    }


    public static ArrayList<Relatorios> consultarRelatorioAnalitico(int id) {
    /**
     * @param inicioObjeto do Relatório Análitico que pesquisa no Banco de dados as vendas relaizadas
     * com base em uma venda especifica de um cliente, para inserir os dados detalhados da compra no Relatório Sintético
     * @param fim
     * @return ArrayList - Apresenta todos os itens incluido na venda, de um determinado cliente
     */
        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;

        //Armazeno as informaçoes da tabela (resultSet) em um ArrayList
        ArrayList<Relatorios> listaVendas = new ArrayList<>();

        try {

            Class.forName(DRIVER);

            conexao = GerenciadorConexao.abrirConexao();

            //Passo 3 - Executo a instrução SQL
            instrucaoSQL = conexao.prepareStatement("SELECT ID_PRODUTO, NOME_PRODUTO, QUANTIDADE, VALOR_ITEM, QUANTIDADE * VALOR_ITEM AS VALOR_TOTAL FROM ITEM_VENDA WHERE ID_VENDA = ?");
            instrucaoSQL.setInt(1, id);

            //Executa a Query (Consulta) - Retorna um objeto da classe ResultSet
            rs = instrucaoSQL.executeQuery();

            //Percorrer o resultSet
            while (rs.next()) {
                Relatorios c = new Relatorios();
                c.setIdProduto(rs.getInt("ID_PRODUTO"));
                c.setNomeProduto(rs.getString("NOME_PRODUTO"));
                c.setQuantidade(rs.getInt("QUANTIDADE"));
                c.setValorItem(rs.getInt("VALOR_ITEM"));
                c.setValorTotalItem(rs.getFloat("VALOR_TOTAL"));
                listaVendas.add(c);
            }

            return listaVendas;

        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Falha na consulta!");
            return null;
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                conexao.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Falha ao fechar a conexão!");
            }
        }
    }

}
