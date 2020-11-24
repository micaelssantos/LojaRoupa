package br.sp.senac.tads.dao;

import br.sp.senac.tads.model.Cliente;
import br.sp.senac.tads.util.GerenciadorConexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//teste
public class ClienteDAO {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";            //Driver do MySQL a partir da versão 8.0
    private static final String LOGIN = "root";                                           //Nome de Usuário do Bando de Dados
    private static final String SENHA = "";                                   //Senha de Acesso ao Banco de Dados
    private static final String URL = "jdbc:mysql://localhost:3306/loja_roupa?useTimezone=true&serverTimezone=UTC&useSSL=false";     //URL do banco de dados
    private static Connection conexao;

    public static boolean adicionar(Cliente pCliente) {
        boolean retorno = false;
        //  Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("INSERT INTO cliente (nome,CPF, dataNascimento, estadoCivil,"
                    + "sexo, CEP, logradouro, numero, telefone, celular, email) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, pCliente.getNomeCliente());
            instrucaoSQL.setString(2, pCliente.getCPF());
            instrucaoSQL.setString(3, pCliente.getDataNascimento());
            instrucaoSQL.setString(4, pCliente.getEstadoCivil());
            instrucaoSQL.setString(5, pCliente.getSexo());
            instrucaoSQL.setString(6, pCliente.getCEP());
            instrucaoSQL.setString(7, pCliente.getLogradouro());
            instrucaoSQL.setString(8, pCliente.getNumero());
            instrucaoSQL.setString(9, pCliente.getTelefone());
            instrucaoSQL.setString(10, pCliente.getCelular());
            instrucaoSQL.setString(11, pCliente.getEmail());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                    pCliente.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao cadastrar Cliente!.");
                }
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    public static boolean consultar(Cliente pCliente) {
        boolean retorno = false;
        //Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("SELECT NOME_CLIENTE, CPF,SEXO where CLIENTE ",
                    Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, pCliente.getNomeCliente());
            instrucaoSQL.setString(2, pCliente.getCPF());
            instrucaoSQL.setString(3, pCliente.getDataNascimento());
            instrucaoSQL.setString(4, pCliente.getEstadoCivil());
            instrucaoSQL.setString(5, pCliente.getSexo());
            instrucaoSQL.setString(6, pCliente.getCEP());
            instrucaoSQL.setString(7, pCliente.getLogradouro());
            instrucaoSQL.setString(8, pCliente.getNumero());
            instrucaoSQL.setString(9, pCliente.getTelefone());
            instrucaoSQL.setString(10, pCliente.getCelular());
            instrucaoSQL.setString(11, pCliente.getEmail());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                    pCliente.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao obter o ID do Cliente!.");
                }
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    public static boolean alterar(Cliente pCliente) {
        boolean retorno = false;
        //  Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("update CLIENTE set NOME_CLIENTE = ?, CPF = ?,"
                    + " DATA_NASCIMENTO = ?, ESTADO_CIVIL = ?, SEXO = ?, CEP = ?, LOGRADOURO=?, NUMERO=?, TELEFONE=?"
                    + ",CELULAR=?,EMAIL=? where ID_CLIENTE = ? ");

//            instrucaoSQL = conexao.prepareStatement("update cliente set (nome,CPF, dataNascimento, estadoCivil,"
//                    + "sexo, CEP, logradouro, numero, telefone, celular, email) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
//                    Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, pCliente.getNomeCliente());
            instrucaoSQL.setString(2, pCliente.getCPF());
            instrucaoSQL.setString(3, pCliente.getDataNascimento());
            instrucaoSQL.setString(4, pCliente.getEstadoCivil());
            instrucaoSQL.setString(5, pCliente.getSexo());
            instrucaoSQL.setString(6, pCliente.getCEP());
            instrucaoSQL.setString(7, pCliente.getLogradouro());
            instrucaoSQL.setString(8, pCliente.getNumero());
            instrucaoSQL.setString(9, pCliente.getTelefone());
            instrucaoSQL.setString(10, pCliente.getCelular());
            instrucaoSQL.setString(11, pCliente.getEmail());
            instrucaoSQL.setInt(12, pCliente.getId());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                    pCliente.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao alterar Cliente!.");
                }
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    public static boolean remover(Cliente pCliente) {
        boolean retorno = false;
        // Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciadorConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("delete from CLIENTE where ID_CLIENTE=?",
                    Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, pCliente.getNomeCliente());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                    pCliente.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao excluir Cliente!.");
                }
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {

            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    public ArrayList<Cliente> consultarCliente(Cliente cliBean) {

        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

        try {

            Class.forName(DRIVER);

            conexao = GerenciadorConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("select ID_CLIENTE, NOME_CLIENTE, CPF, DATA_NASCIMENTO, ESTADO_CIVIL"
                    + ", SEXO, CEP, LOGRADOURO, NUMERO, TELEFONE, CELULAR, EMAIL from CLIENTE where NOME_CLIENTE");

            instrucaoSQL.setInt(1, cliBean.getId());

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {

                Cliente cli = new Cliente();
                cli.setId(rs.getInt("ID_CLIENTE"));
                cli.setNomeCliente(rs.getString("NOME_CLIENTE"));
                cli.setCPF(rs.getString("CPF"));
                cli.setDataNascimento(rs.getString("DATA_NASCIMENTO"));
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

                //Fecho a minha conexão
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Falha ao fechar a conexão!");
            }

        }

        return listaCliente;

    }

    public ArrayList<Cliente> listarTabelaCliente() {

        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

        try {

            Class.forName(DRIVER);

            conexao = GerenciadorConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("select ID_CLIENTE, NOME_CLIENTE, CPF, DATA_NASCIMENTO, ESTADO_CIVIL"
                    + ", SEXO, CEP, LOGRADOURO, NUMERO, TELEFONE, CELULAR, EMAIL from CLIENTE ");

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {

                Cliente cli = new Cliente();
                cli.setId(rs.getInt("ID_CLIENTE"));
                cli.setNomeCliente(rs.getString("NOME_CLIENTE"));
                cli.setCPF(rs.getString("CPF"));
                cli.setDataNascimento(rs.getString("DATA_NASCIMENTO"));
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

    public ArrayList<Cliente> pesquisarCliente(Cliente cliBean) {

        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

        try {

            Class.forName(DRIVER);

            conexao = GerenciadorConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("select ID_CLIENTE, NOME_CLIENTE, CPF, DATA_NASCIMENTO, ESTADO_CIVIL"
                    + ", SEXO, CEP, LOGRADOURO, NUMERO, TELEFONE, CELULAR, EMAIL from CLIENTE where NOME_CLIENTE like ?");

            instrucaoSQL.setString(1, cliBean.getNomeCliente()+ "%");

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {

               Cliente cli = new Cliente();
                cli.setId(rs.getInt("ID_CLIENTE"));
                cli.setNomeCliente(rs.getString("NOME_CLIENTE"));
                cli.setCPF(rs.getString("CPF"));
                cli.setDataNascimento(rs.getString("DATA_NASCIMENTO"));
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
