package br.sp.senac.tads.dao;

import static br.sp.senac.tads.dao.VendaDAO.abrirConexao;
import br.sp.senac.tads.model.ItemVenda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ItemVendaDAO {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";                                                                 //Driver do MySQL a partir da versão 8.0
    private static final String LOGIN = "root";                                                                                     //Nome de Usuário do Bando de Dados
    private static final String SENHA = "";                                                                                //Senha de Acesso ao Banco de Dados
    private static final String URL = "jdbc:mysql://localhost:3306/loja_roupa?useTimezone=true&serverTimezone=UTC&useSSL=false";     //URL do banco de dados
    private static Connection CONEXAO = null;
    
    PreparedStatement instrucaoSQL;
    
     public static Connection abrirConexao() throws ClassNotFoundException,SQLException {
        
        if(CONEXAO==null)      
        {    
            try {
                Class.forName(DRIVER);  
                CONEXAO = DriverManager.getConnection(URL, LOGIN, SENHA);
             
            } catch (ClassNotFoundException e) { 
                throw new ClassNotFoundException("O driver expecificado nao foi encontrado.");

            } catch (SQLException e) {  
                throw new SQLException("Erro ao estabelecer a conexão (Ex: login ou senha errados).");
            }
        }
        else
        {
            try {
                
                if(CONEXAO.isClosed())
                    CONEXAO = DriverManager.getConnection(URL, LOGIN, SENHA);
            } catch (SQLException ex) {
                throw new SQLException("Falha ao fechar a conexão.");
            }
        }
        return CONEXAO;
    }
     
         
    public static boolean Inserir(br.sp.senac.tads.model.ItemVenda itemModel)
    {
         boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

      try 
      {
            abrirConexao();
            
            instrucaoSQL = CONEXAO.prepareStatement("INSERT INTO ITEM_VENDA (ID_PRODUTO, ID_VENDA, NOME_PRODUTO, QUANTIDADE, VALOR_ITEM) VALUES(?, ?, ?, ?, ?)");
            instrucaoSQL.setInt(1,itemModel.getIdProduto());
            instrucaoSQL.setInt(2,itemModel.getIdVenda());
            instrucaoSQL.setString(3,itemModel.getNomeProduto());
            instrucaoSQL.setInt(4,itemModel.getQtd());
            instrucaoSQL.setDouble(5,itemModel.getVlUnit());
            
            int linhaAfetadas = instrucaoSQL.executeUpdate();

             if (linhaAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                    itemModel.setIdVenda(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao obter o ID da Venda.");
                }
            } else {
                retorno = false;
            }      
       }   
      catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao carregar o driver!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao abrir a conexão!");
            }
    
      return retorno;
    }

      
    public static boolean Consultar(br.sp.senac.tads.model.ItemVenda itemModel)
    {
         boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

      try 
      {
            abrirConexao();
            
            instrucaoSQL = CONEXAO.prepareStatement("SELECT * FROM ITEM_VENDA (ID_PRODUTO, ID_VENDA, NOME_PRODUTO, QUANTIDADE, VALOR_ITEM) VALUES(?, ?, ?, ?, ?)");
            instrucaoSQL.setInt(1,itemModel.getIdProduto());
            instrucaoSQL.setInt(2,itemModel.getIdVenda());
            instrucaoSQL.setString(3,itemModel.getNomeProduto());
            instrucaoSQL.setInt(4,itemModel.getQtd());
            instrucaoSQL.setDouble(5,itemModel.getVlUnit());
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                    itemModel.setIdVenda(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao obter o ID da Venda.");
                }
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
            retorno = false;
        } 
        return retorno;
    }
    
    
    
    public static boolean Alterar(br.sp.senac.tads.model.ItemVenda itemModel)
    {
         boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

      try 
      {
            abrirConexao();
            
            instrucaoSQL = CONEXAO.prepareStatement("ALTER TABLE ITEM_VENDA (ID_PRODUTO, ID_VENDA, NOME_PRODUTO, QUANTIDADE, VALOR_ITEM) VALUES(?, ?, ?, ?, ?)");
            instrucaoSQL.setInt(1,itemModel.getIdProduto());
            instrucaoSQL.setInt(2,itemModel.getIdVenda());
            instrucaoSQL.setString(3,itemModel.getNomeProduto());
            instrucaoSQL.setInt(4,itemModel.getQtd());
            instrucaoSQL.setDouble(5,itemModel.getVlUnit());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                    itemModel.setIdVenda(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao alterar a Venda.");
                }
            } else {
                retorno = false;
            }

        } catch (ClassNotFoundException ex) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o driver!");
       } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao abrir a conexão!");
       }
    
        return retorno;
     }
     
     
       public static boolean Remover(br.sp.senac.tads.model.ItemVenda itemModel)
    {
         boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

      try 
      {
            abrirConexao();
            
            instrucaoSQL = CONEXAO.prepareStatement("DROP TABLE ITEM_VENDA (ID_PRODUTO, ID_VENDA, NOME_PRODUTO, QUANTIDADE, VALOR_ITEM) VALUES(?, ?, ?, ?, ?)");
            instrucaoSQL.setInt(1,itemModel.getIdProduto());
            instrucaoSQL.setInt(2,itemModel.getIdVenda());
            instrucaoSQL.setString(3,itemModel.getNomeProduto());
            instrucaoSQL.setInt(4,itemModel.getQtd());
            instrucaoSQL.setDouble(5,itemModel.getVlUnit());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); 
                if (generatedKeys.next()) {
                    itemModel.setIdVenda(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao excluir a Venda.");
                }
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
            retorno = false;
        } 
        return retorno;
    }
     
}
