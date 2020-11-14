package br.sp.senac.tads.dao;

import br.sp.senac.tads.model.ItemVenda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ItemVendaDAO {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";                                                                 //Driver do MySQL a partir da versão 8.0
    private static final String LOGIN = "root";                                                                                     //Nome de Usuário do Bando de Dados
    private static final String SENHA = "1234";                                                                                //Senha de Acesso ao Banco de Dados
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
     
     
     
    public void Inserir(br.sp.senac.tads.model.ItemVenda itemModel)
    {
        try 
      {
            abrirConexao();
            
            instrucaoSQL = CONEXAO.prepareStatement("INSERT INTO ITEM_VENDA (ID_PRODUTO, ID_VENDA, NOME_PRODUTO, QUANTIDADE, VALOR_ITEM) VALUES(?, ?, ?, ?, ?)");
            instrucaoSQL.setInt(1,itemModel.getIdProduto());
            instrucaoSQL.setInt(2,itemModel.getIdVenda());
            instrucaoSQL.setString(3,itemModel.getNomeProduto());
            instrucaoSQL.setInt(4,itemModel.getQtd());
            instrucaoSQL.setFloat(5,itemModel.getVlUnit());
            
            int linhaAfetadas = instrucaoSQL.executeUpdate();

             if(linhaAfetadas>0)
            {
               JOptionPane.showMessageDialog(null,"Informações cadastradas com sucesso!");
            }           
       }   
      catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao carregar o driver!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao abrir a conexão!");
            }
    
    }

}
