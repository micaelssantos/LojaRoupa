package br.sp.senac.tads.dao;

import static br.sp.senac.tads.dao.ItemVendaDAO.abrirConexao;
import br.sp.senac.tads.model.Cliente;
import br.sp.senac.tads.model.Produto;
import br.sp.senac.tads.model.Venda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import  br.sp.senac.tads.model.Venda;
import br.sp.senac.tads.util.GerenciadorConexao;
import java.util.ArrayList;

public class VendaDAO {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";                                                                 //Driver do MySQL a partir da versão 8.0
    private static final String LOGIN = "root";                                                                                     //Nome de Usuário do Bando de Dados
    private static final String SENHA = "";                                                                                //Senha de Acesso ao Banco de Dados
    private static final String URL = "jdbc:mysql://localhost:3306/loja_roupa?useTimezone=true&serverTimezone=UTC&useSSL=false";     //URL do banco de dados
    private static Connection CONEXAO = null;
    Connection conexao;
    
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
      
    public static boolean Inserir(br.sp.senac.tads.model.Venda vendaModel)
    {
         boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

      try 
      {
            abrirConexao();
            
            instrucaoSQL = CONEXAO.prepareStatement("INSERT INTO VENDA (ID_CLIENTE, NOME_CLIENTE, VALOR_VENDA) VALUES(?, ?, ?)");
            instrucaoSQL.setInt(1,vendaModel.getIdCliente());
            instrucaoSQL.setString(2,vendaModel.getNomeCliente());
            instrucaoSQL.setFloat(3,vendaModel.getValorvenda());
  
            int linhaAfetadas = instrucaoSQL.executeUpdate();

             if(linhaAfetadas>0)
            {
                retorno = true;
               JOptionPane.showMessageDialog(null,"Venda realizada com sucesso!");
            }           
             else
             {
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
    
    public static boolean Consultar(Venda vendaModel) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            //Obs: A classe GerenciadorConexao jÃ¡ carrega o Driver e define os parÃ¢metros de conexÃ£o
              abrirConexao();
            
            instrucaoSQL = CONEXAO.prepareStatement("SELECT * FROM VENDA (ID_VENDA, ID_CLIENTE, NOME_CLIENTE, DATA, VALOR_VENDA) VALUES(?, ?, ?, ?, ?)");
            instrucaoSQL.setInt(1,vendaModel.getIdVenda());
            instrucaoSQL.setInt(2,vendaModel.getIdCliente());
            instrucaoSQL.setString(3,vendaModel.getNomeCliente());
            instrucaoSQL.setDate(4,vendaModel.getData());
            instrucaoSQL.setFloat(5,vendaModel.getValorvenda());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                    vendaModel.setIdVenda(generatedKeys.getInt(1));
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
    
    
    
     public static boolean Alterar(Venda vendaModel) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
           abrirConexao();

           instrucaoSQL = CONEXAO.prepareStatement("ALTER TABLE  VENDA "
        + "(ID_VENDA, ID_CLIENTE, NOME_CLIENTE, DATA, VALOR_VENDA) VALUES(?, ?, ?, ?, ?)",
                     Statement.RETURN_GENERATED_KEYS);  

            //Adiciono os parÃ¢metros ao meu comando SQL
            instrucaoSQL.setInt(1,vendaModel.getIdVenda());
            instrucaoSQL.setInt(2,vendaModel.getIdCliente());
            instrucaoSQL.setString(3,vendaModel.getNomeCliente());
            instrucaoSQL.setDate(4,vendaModel.getData());
            instrucaoSQL.setFloat(5,vendaModel.getValorvenda());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                    vendaModel.setIdVenda(generatedKeys.getInt(1));
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
     
     
      public static boolean Remover(Venda vendaModel) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            
            abrirConexao();

             instrucaoSQL = CONEXAO.prepareStatement("DROP TABLE  VENDA "
        + "(ID_VENDA, ID_CLIENTE, NOME_CLIENTE, DATA, VALOR_VENDA) VALUES(?, ?, ?, ?, ?)",
                     Statement.RETURN_GENERATED_KEYS);  

            instrucaoSQL.setInt(1,vendaModel.getIdVenda());
            instrucaoSQL.setInt(2,vendaModel.getIdCliente());
            instrucaoSQL.setString(3,vendaModel.getNomeCliente());
            instrucaoSQL.setDate(4,vendaModel.getData());
            instrucaoSQL.setFloat(5,vendaModel.getValorvenda());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); 
                if (generatedKeys.next()) {
                    vendaModel.setIdVenda(generatedKeys.getInt(1));
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
      
      
       public static String ConsultarClientePorNome(String nome) 
       {
        
           String nomeCliente = "";
            boolean retorno = false;
            Connection conexao = null;
            PreparedStatement instrucaoSQL = null;

        try {

            
              abrirConexao();

            instrucaoSQL = CONEXAO.prepareStatement("SELECT * FROM CLIENTE WHERE NOME_CLIENTE LIKE ?");
            instrucaoSQL.setString(1, nome + "%");
           
            
            ResultSet rs = instrucaoSQL.executeQuery();
            
            while(rs.next()){
                
                Venda model = new Venda();
                model.setNomeCliente(rs.getString("NOME_CLIENTE"));
                
                nomeCliente = model.getNomeCliente();
            }
            
        } catch (SQLException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
            retorno = false;
        } 

        return nomeCliente;
    }
       
        public static String ConsultarClientePorCPF(String CPF) 
       {
        
           String CPFCliente = "";
            boolean retorno = false;
            Connection conexao = null;
            PreparedStatement instrucaoSQL = null;

        try {

            
              abrirConexao();

            instrucaoSQL = CONEXAO.prepareStatement("SELECT * FROM CLIENTE WHERE CPF LIKE ?");
            instrucaoSQL.setString(1, CPF + "%");
           
            
            ResultSet rs = instrucaoSQL.executeQuery();
            
            while(rs.next()){
                
                Cliente model = new Cliente();
                model.setCPF(rs.getString("CPF"));
                
                CPFCliente = model.getCPF();
            }
            
        } catch (SQLException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
            retorno = false;
        } 

        return CPFCliente;
    }
        
        public static String ConsultarProdutoPorNome(String nome) 
       {
        
           String nomeProduto = "";
            boolean retorno = false;
            Connection conexao = null;
            PreparedStatement instrucaoSQL = null;

        try {
              abrirConexao();

            instrucaoSQL = CONEXAO.prepareStatement("SELECT * FROM PRODUTO WHERE NOME_PRODUTO LIKE ?");
            instrucaoSQL.setString(1, nome + "%");
           
            
            ResultSet rs = instrucaoSQL.executeQuery();
            
            while(rs.next()){
                
                Produto model = new Produto();
                model.setNome(rs.getString("NOME_PRODUTO"));
                
                nomeProduto = model.getNome();
            }
            
        } catch (SQLException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
            retorno = false;
        } 

        return nomeProduto;
    }
     
         public static int ConsultarProdutoPorCodigo(int cod) 
       {
        
            int CodProduto = 0;
            boolean retorno = false;
            Connection conexao = null;
            PreparedStatement instrucaoSQL = null;

        try {
              abrirConexao();

            instrucaoSQL = CONEXAO.prepareStatement("SELECT * FROM PRODUTO WHERE ID_PRODUTO LIKE ?");
            instrucaoSQL.setString(1, cod + "%");
           
            
            ResultSet rs = instrucaoSQL.executeQuery();
            
            while(rs.next()){
                
                Produto model = new Produto();
                model.setId(rs.getInt("ID_PRODUTO"));
                
                CodProduto = model.getId();
            }
            
        } catch (SQLException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
            retorno = false;
        } 

        return CodProduto;
    }
       
    
    //Relatório Sintético
     public ArrayList<Venda> listarVendaRelatorioSintetico(Venda prodBean) {
        
        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        ArrayList<Venda> listaVenda = new ArrayList<Venda>(); 
        
        try {
            
            
            Class.forName(DRIVER);
            
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("select IdVenda, nomeCliente, valorvenda, data");
            
            instrucaoSQL.setString(1, prodBean.getNome() + "%");
                       
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                               
                Venda Vend = new Venda();
                Vend.setIdVenda(rs.getInt("IdVenda"));
                Vend.setNomeCliente(rs.getString("nomeCliente"));
                Vend.setValorvenda((float) rs.getDouble("valorvenda"));
                Vend.setData(rs.getDate("data"));
                
                listaVenda.add(Vend);
                
            }
            
            return listaVenda;
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Falha na consulta!");
            
            return null;
                        
        } finally {
        
            try {
                if(rs!=null)
                    rs.close();
                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                //Fecho a minha conexão
                conexao.close();
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Falha ao fechar a conexão!");
            }
        
        }
        
    }   

    public ArrayList<Venda> vendaRelatorio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
       
       
     
       
         public static int ConsultarQuantidadePRPorNome(String nome) 
       {
        
           int QtdProduto = 0;
            boolean retorno = false;
            Connection conexao = null;
            PreparedStatement instrucaoSQL = null;

        try {
              abrirConexao();

            instrucaoSQL = CONEXAO.prepareStatement("SELECT QUANTIDADE FROM PRODUTO WHERE NOME_PRODUTO LIKE ?");
            instrucaoSQL.setString(1, nome + "%");
           
            
            ResultSet rs = instrucaoSQL.executeQuery();
            
            while(rs.next()){
                
                Produto model = new Produto();
                model.setQuantidade(rs.getInt("QUANTIDADE"));
                
                QtdProduto = model.getQuantidade();
            }
            
        } catch (SQLException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
            retorno = false;
        } 

        return QtdProduto;
    }
           public static int ConsultarQuantidadePRPorCOD(int cod) 
       {
        
           int QtdProduto = 0;
            boolean retorno = false;
            Connection conexao = null;
            PreparedStatement instrucaoSQL = null;

        try {
              abrirConexao();

            instrucaoSQL = CONEXAO.prepareStatement("SELECT QUANTIDADE FROM PRODUTO WHERE ID_PRODUTO LIKE ?");
            instrucaoSQL.setString(1, cod + "%");
           
            
            ResultSet rs = instrucaoSQL.executeQuery();
            
            while(rs.next()){
                
                Produto model = new Produto();
                model.setQuantidade(rs.getInt("QUANTIDADE"));
                
                QtdProduto = model.getQuantidade();
            }
            
        } catch (SQLException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
            retorno = false;
        } 

        return QtdProduto;
    }
}


