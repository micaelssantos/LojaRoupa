package br.sp.senac.tads.dao;

import br.sp.senac.tads.model.Produto;
import br.sp.senac.tads.util.GerenciadorConexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    
    Connection conexao;


    public ProdutoDAO() {
        
    }

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";                                                                 //Driver do MySQL a partir da versão 8.0
    private static final String LOGIN = "root";                                                                                     //Nome de Usuário do Bando de Dados
    private static final String SENHA = "adminadmin";                                                                                //Senha de Acesso ao Banco de Dados
    private static final String URL = "jdbc:mysql://localhost:3306/loja_roupa?useTimezone=true&serverTimezone=UTC&useSSL=false";     //URL do banco de dados
    
    
    public void cadastrarProduto(Produto prodBean) {

        try {

            //Carregar o driver
            Class.forName(DRIVER);

            //Carregar o objeto de conexão
            conexao = GerenciadorConexao.abrirConexao();
            
            String sql = "insert into PRODUTO (NOME_PRODUTO, CATEGORIA, MARCA, MODELO, DESCRICAO, QUANTIDADE, VALOR) values (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);
          
            instrucaoSQL.setString(1, prodBean.getNome());
            instrucaoSQL.setString(2, prodBean.getCategoria());
            instrucaoSQL.setString(3, prodBean.getMarca());
            instrucaoSQL.setString(4, prodBean.getModelo());
            instrucaoSQL.setString(5, prodBean.getDescricao());
            instrucaoSQL.setInt(6, prodBean.getQuantidade());
            instrucaoSQL.setDouble(7, prodBean.getValorUnitario());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");

            } else {

                throw new Exception();

            }
               
            conexao.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o driver");
            
        }

    }
    
    public void alterarProduto(Produto prodBean) {
        
        try {
            
            //Carregar o driver
            Class.forName(DRIVER);

            //Carregar o objeto de conexão
            conexao = GerenciadorConexao.abrirConexao();

            PreparedStatement instrucaoSQL = conexao.prepareStatement("update PRODUTO set NOME_PRODUTO = ?, CATEGORIA = ?, MARCA = ?,"
                                                                    + " MODELO = ?, DESCRICAO = ?, QUANTIDADE = ?, VALOR = ? where ID_PRODUTO = ? ");

            instrucaoSQL.setString(1, prodBean.getNome());
            instrucaoSQL.setString(2, prodBean.getCategoria());
            instrucaoSQL.setString(3, prodBean.getMarca());
            instrucaoSQL.setString(4, prodBean.getModelo());
            instrucaoSQL.setString(5, prodBean.getDescricao());
            instrucaoSQL.setInt(6, prodBean.getQuantidade());
            instrucaoSQL.setDouble(7, prodBean.getValorUnitario());
            instrucaoSQL.setInt(8, prodBean.getId());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Produto editado com sucesso!");

            } else {

                throw new Exception();

            }
               
            conexao.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o driver");
            
        }
        
    }
    
    public void removerProduto(Produto prodBean) {
        
        try {
            
            Class.forName(DRIVER);

            conexao = GerenciadorConexao.abrirConexao();

            PreparedStatement instrucaoSQL = conexao.prepareStatement("delete from PRODUTO where ID_PRODUTO = ?");

            instrucaoSQL.setInt(1, prodBean.getId());
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Produto removido com sucesso!");

            } else {

                throw new Exception();

            }
               
            conexao.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o driver");
            
        }
        
    }
    
    public ArrayList<Produto> consultarProduto(Produto prodBean) {
        
        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        ArrayList<Produto> listaProduto = new ArrayList<Produto>(); 
        
        try {
            
            Class.forName(DRIVER);
            
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("select ID_PRODUTO, NOME_PRODUTO, CATEGORIA, MARCA, MODELO, "
                    + "DESCRICAO, QUANTIDADE, VALOR from PRODUTO where ID_PRODUTO = ?");
            
            instrucaoSQL.setInt(1,prodBean.getId());
            
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                Produto prod = new Produto();
                prod.setId(rs.getInt("ID_PRODUTO"));
                prod.setNome(rs.getString("NOME_PRODUTO"));
                prod.setCategoria(rs.getString("CATEGORIA"));
                prod.setMarca(rs.getString("MARCA"));
                prod.setModelo(rs.getString("MODELO"));
                prod.setDescricao(rs.getString("DESCRICAO"));
                prod.setQuantidade(rs.getInt("QUANTIDADE"));
                prod.setValorUnitario(rs.getDouble("VALOR"));
                
                
                listaProduto.add(prod);
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Falha na consulta!");
            
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
        
        return listaProduto;
        
    }
    
    public ArrayList<Produto> listarTabelaProduto() {
        
        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        ArrayList<Produto> listaProduto = new ArrayList<Produto>(); 
        
        try {
            
            
            Class.forName(DRIVER);
            
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("select ID_PRODUTO, NOME_PRODUTO, CATEGORIA, MARCA, MODELO, "
                    + "DESCRICAO, QUANTIDADE, VALOR from PRODUTO");
                       
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                Produto prod = new Produto();
                prod.setId(rs.getInt("ID_PRODUTO"));
                prod.setNome(rs.getString("NOME_PRODUTO"));
                prod.setCategoria(rs.getString("CATEGORIA"));
                prod.setMarca(rs.getString("MARCA"));
                prod.setModelo(rs.getString("MODELO"));
                prod.setDescricao(rs.getString("DESCRICAO"));
                prod.setQuantidade(rs.getInt("QUANTIDADE"));
                prod.setValorUnitario(rs.getDouble("VALOR"));
                
                listaProduto.add(prod);
            }
            
            return listaProduto;
            
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
    
    public ArrayList<Produto> pesquisarProduto(Produto prodBean) {
        
        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        ArrayList<Produto> listaProduto = new ArrayList<Produto>(); 
        
        try {
            
            
            Class.forName(DRIVER);
            
            conexao = GerenciadorConexao.abrirConexao();
            
            instrucaoSQL = conexao.prepareStatement("select ID_PRODUTO, NOME_PRODUTO, CATEGORIA, MARCA, MODELO, DESCRICAO, QUANTIDADE, VALOR from PRODUTO where NOME_PRODUTO like ?");
            
            instrucaoSQL.setString(1, prodBean.getNome() + "%");
                       
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                               
                Produto prod = new Produto();
                prod.setId(rs.getInt("ID_PRODUTO"));
                prod.setNome(rs.getString("NOME_PRODUTO"));
                prod.setCategoria(rs.getString("CATEGORIA"));
                prod.setMarca(rs.getString("MARCA"));
                prod.setModelo(rs.getString("MODELO"));
                prod.setDescricao(rs.getString("DESCRICAO"));
                prod.setQuantidade(rs.getInt("QUANTIDADE"));
                prod.setValorUnitario(rs.getDouble("VALOR"));
                
                listaProduto.add(prod);
                
            }
            
            return listaProduto;
            
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
    
}


