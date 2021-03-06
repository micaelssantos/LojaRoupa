package br.sp.senac.tads.dao;

import br.sp.senac.tads.model.Cliente;
import br.sp.senac.tads.util.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dalila Di Lazzaro
 * @author Jeferson Davi de Oliveira
 */
public class ClienteDAO {

    Connection conexao;

    /**
     * Driver do MySQL a partir da versão 8.0.
     */
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public ClienteDAO() {
    }

    /**
     * Método para Cadastrar um novo cliente no Banco de Dados.
     *
     * @param clienteBean Recebe como parâmetro um Objeto do Tipo Cliente.
     */
    public void cadastrarCliente(Cliente clienteBean) {

        try {
            Class.forName(DRIVER);
            conexao = GerenciadorConexao.abrirConexao();
            String sql = "insert into CLIENTE(NOME_CLIENTE, CPF, DATA_NASCIMENTO, ESTADO_CIVIL, SEXO, CEP, LOGRADOURO, NUMERO, TELEFONE, CELULAR, EMAIL) "
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);
            instrucaoSQL.setString(1, clienteBean.getNomeCliente());
            instrucaoSQL.setString(2, clienteBean.getCPF());
            instrucaoSQL.setString(3, clienteBean.getDataNascimento());
            instrucaoSQL.setString(4, clienteBean.getEstadoCivil());
            instrucaoSQL.setString(5, clienteBean.getSexo());
            instrucaoSQL.setString(6, clienteBean.getCEP());
            instrucaoSQL.setString(7, clienteBean.getLogradouro());
            instrucaoSQL.setString(8, clienteBean.getNumero());
            instrucaoSQL.setString(9, clienteBean.getTelefone());
            instrucaoSQL.setString(10, clienteBean.getCelular());
            instrucaoSQL.setString(11, clienteBean.getEmail());
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            } else {
                throw new Exception();
            }
            conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o driver");
        }
    }

    /**
     * Método para alterar o Cliente na Base de Dados.
     * 
     * @param clienteBean  Recebe como parâmetro um Objeto do Tipo Cliente.
     */
    public void alterarCliente(Cliente clienteBean) {
        try {
            Class.forName(DRIVER);
            conexao = GerenciadorConexao.abrirConexao();
            PreparedStatement instrucaoSQL = conexao.prepareStatement("update CLIENTE set NOME_CLIENTE = ?, CPF = ?, DATA_NASCIMENTO = ?, ESTADO_CIVIL = ?, SEXO = ?, CEP = ?, "
                    + "LOGRADOURO = ?, NUMERO = ?, TELEFONE = ?, CELULAR = ?, EMAIL = ? where ID_CLIENTE = ?");
            instrucaoSQL.setString(1, clienteBean.getNomeCliente());
            instrucaoSQL.setString(2, clienteBean.getCPF());
            instrucaoSQL.setString(3, clienteBean.getDataNascimento());
            instrucaoSQL.setString(4, clienteBean.getEstadoCivil());
            instrucaoSQL.setString(5, clienteBean.getSexo());
            instrucaoSQL.setString(6, clienteBean.getCEP());
            instrucaoSQL.setString(7, clienteBean.getLogradouro());
            instrucaoSQL.setString(8, clienteBean.getNumero());
            instrucaoSQL.setString(9, clienteBean.getTelefone());
            instrucaoSQL.setString(10, clienteBean.getCelular());
            instrucaoSQL.setString(11, clienteBean.getEmail());
            instrucaoSQL.setInt(12, clienteBean.getId());
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Cliente editado com sucesso!");
            } else {
                throw new Exception();
            }
            conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o driver");
        }
    }
    
    /**
     * Método que remove um cliente na base de dados.
     * 
     * @param clienteBean Recebe como parâmetro um Objeto do Tipo Cliente.
     */
    public void removerCliente(Cliente clienteBean) {
        try {
            Class.forName(DRIVER);
            conexao = GerenciadorConexao.abrirConexao();
            PreparedStatement instrucaoSQL = conexao.prepareStatement("delete from CLIENTE where ID_CLIENTE = ?");
            instrucaoSQL.setInt(1, clienteBean.getId());
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!");
            } else {
                throw new Exception();
            }
            conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não é possível remover Cliente com Histórico de Vendas!");
        }
    }

    /**
     * Método que consulta o Cliente no Banco de dados de acordo com o ID informado.
     * 
     * @param clienteBean Recebe como parâmetro um Objeto do Tipo Cliente.
     * @return Retorna uma lista com o Cliente encontrado.
     */
    public ArrayList<Cliente> consultarCliente(Cliente clienteBean) {
        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        try {
            Class.forName(DRIVER);
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("select ID_CLIENTE, NOME_CLIENTE, CPF, DATA_NASCIMENTO, ESTADO_CIVIL, SEXO, CEP, LOGRADOURO, NUMERO, TELEFONE, CELULAR, EMAIL "
                    + "from CLIENTE where ID_CLIENTE = ?");
            instrucaoSQL.setInt(1, clienteBean.getId());
            rs = instrucaoSQL.executeQuery();
            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setId(rs.getInt("ID_CLIENTE"));
                cli.setNomeCliente(rs.getString("NOME_CLIENTE"));
                cli.setCPF(rs.getString("CPF"));
                cli.setDataNascimento(rs.getString("DATA_NASCIMENTO").replaceAll("\\D", ""));
                cli.setEstadoCivil(rs.getString("ESTADO_CIVIL"));
                cli.setSexo(rs.getString("SEXO"));
                cli.setCEP(rs.getString("CEP"));
                cli.setLogradouro(rs.getString("LOGRADOURO"));
                cli.setNumero(rs.getString("NUMERO"));
                cli.setTelefone(rs.getString("TELEFONE"));
                cli.setCelular(rs.getString("CELULAR"));
                cli.setEmail(rs.getString("EMAIL"));
                listaCliente.add(cli);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha na consulta!");
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
        return listaCliente;
    }

    /**
     * Método para listar todos os cliente na Dase de Dados.
     * 
     * @return Retorna uma lista de Objetos do tipo Cliente.
     */
    public ArrayList<Cliente> listarTabelaCliente() {
        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        try {
            Class.forName(DRIVER);
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("select ID_CLIENTE, NOME_CLIENTE, CPF, SEXO from CLIENTE");
            rs = instrucaoSQL.executeQuery();
            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setId(rs.getInt("ID_CLIENTE"));
                cli.setNomeCliente(rs.getString("NOME_CLIENTE"));
                cli.setCPF(rs.getString("CPF"));
                cli.setSexo(rs.getString("SEXO"));
                listaCliente.add(cli);
            }
            return listaCliente;
        } catch (Exception e) {
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

    /**
     * Método que pesquisa um cliente na Base de Dados através do Nome.
     * 
     * @param clienteBean Recebe como parâmetro um Objeto do Tipo Cliente.
     * @return Retorna uma lista contendo o cliente pesquisado.
     */
    public ArrayList<Cliente> pesquisarClienteNome(Cliente clienteBean) {
        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        try {
            Class.forName(DRIVER);
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("select ID_CLIENTE, NOME_CLIENTE, CPF, SEXO from CLIENTE where NOME_CLIENTE like ?");
            instrucaoSQL.setString(1, clienteBean.getNomeCliente() + "%");
            rs = instrucaoSQL.executeQuery();
            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setId(rs.getInt("ID_CLIENTE"));
                cli.setNomeCliente(rs.getString("NOME_CLIENTE"));
                cli.setCPF(rs.getString("CPF"));
                cli.setSexo(rs.getString("SEXO"));
                listaCliente.add(cli);
            }
            return listaCliente;
        } catch (Exception e) {
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
                //Fecho a minha conexão
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Falha ao fechar a conexão!");
            }
        }
    }

    /**
     * Método que pesquisa o cliente na Base de Dados através do CPF
     * 
     * @param clienteBean Recebe como parâmetro um Objeto do Tipo Cliente
     * @return retorna uma lista com o Objeto Cliente pesquisado.
     */
    public ArrayList<Cliente> pesquisarClienteCpf(Cliente clienteBean) {
        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        try {
            Class.forName(DRIVER);
            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("select ID_CLIENTE, NOME_CLIENTE, CPF, SEXO from CLIENTE where CPF like ?");
            instrucaoSQL.setString(1, clienteBean.getCPF() + "%");
            rs = instrucaoSQL.executeQuery();
            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setId(rs.getInt("ID_CLIENTE"));
                cli.setNomeCliente(rs.getString("NOME_CLIENTE"));
                cli.setCPF(rs.getString("CPF"));
                cli.setSexo(rs.getString("SEXO"));
                listaCliente.add(cli);
            }
            return listaCliente;
        } catch (Exception e) {
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
                //Fecho a minha conexão
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Falha ao fechar a conexão!");
            }
        }
    }
}
