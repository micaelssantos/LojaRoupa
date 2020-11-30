package br.sp.senac.tads.dao;

/**
 *
 * @author renea
 */
import br.sp.senac.tads.model.Relatorios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class RelatoriosDAO {
    
public static ArrayList<Relatorios> consultarRelatorios()
    {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        //Armazeno as informaçoes da tabela (resultSet) em um ArrayList
        ArrayList<Relatorios> listaVendas = new ArrayList<Relatorios>();
        
        try {
            
            //conexao = GerenciadorConexao.abrirConexao();
            //Passo 1
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Passo 2 - DriverManager para abrir a conexão
            String URL = "jdbc:mysql://localhost:3306/loja_roupa?useTimezone=true&serverTimezone=UTC&useSSL=false";
            
            conexao = DriverManager.getConnection(URL, "root", "adminadmin");
            
            //Passo 3 - Executo a instrução SQL
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM venda;");

            //Executa a Query (Consulta) - Retorna um objeto da classe ResultSet
            rs = instrucaoSQL.executeQuery();
            
            //Percorrer o resultSet
            while(rs.next())
            {
                Relatorios c = new Relatorios();
                c.setIdVenda(rs.getInt("idvenda"));
                c.setNomeCliente(rs.getString("nomecliente"));
                c.setValorTotalvenda(rs.getFloat("valortotalvenda"));
                c.setData(rs.getDate("data"));
                
                //Adiciono na listaVendas
                listaVendas.add(c);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaVendas = null;
        } finally{
            //Libero os recursos da memória
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                conexao.close();
                //GerenciadorConexao.fecharConexao();
                        
              } catch (SQLException ex) {
             }
        }
        return listaVendas;
    }
}