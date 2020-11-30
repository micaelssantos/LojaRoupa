package br.sp.senac.tads.dao;

import br.sp.senac.tads.model.Login;
import br.sp.senac.tads.util.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author joliveira
 * @see br.sp.senac.tads.model.Login
 *
 */
public class LoginDAO {

    Connection conexao;

    /**
     * Driver do MySQL a partir da versão 8.0
     */
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public LoginDAO() {
    }

    public void cadastrarLogin(Login logBean) {

        try {

            Class.forName(DRIVER);

            conexao = GerenciadorConexao.abrirConexao();

            PreparedStatement instrucaoSQL = conexao.prepareStatement("insert into LOGIN(LOGIN, SENHA) values (?, ?)");

            instrucaoSQL.setString(1, logBean.getLogin());
            instrucaoSQL.setString(2, logBean.getSenha());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            } else {
                throw new Exception();
            }
            conexao.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o driver");

        }

    }

    public void alterarLogin(Login logBean) {

        try {

            Class.forName(DRIVER);

            conexao = GerenciadorConexao.abrirConexao();

            PreparedStatement instrucaoSQL = conexao.prepareStatement("update LOGIN set LOGIN = ?, SENHA = ? where ID_LOGIN = ?");

            instrucaoSQL.setString(1, logBean.getLogin());
            instrucaoSQL.setString(2, logBean.getSenha());
            instrucaoSQL.setInt(3, logBean.getId());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Usuário editado com sucesso!");

            } else {

                throw new Exception();

            }

            conexao.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o driver");

        }

    }

    public void removerLogin(Login logBean) {

        try {

            Class.forName(DRIVER);

            conexao = GerenciadorConexao.abrirConexao();

            PreparedStatement instrucaoSQL = conexao.prepareStatement("delete from LOGIN where ID_LOGIN = ?");

            instrucaoSQL.setInt(1, logBean.getId());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!");

            } else {

                throw new Exception();

            }

            conexao.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o driver");

        }

    }

    public ArrayList<Login> listarLogin() {

        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Login> listaLogin = new ArrayList<Login>();

        try {

            Class.forName(DRIVER);

            conexao = GerenciadorConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("select ID_LOGIN, LOGIN, SENHA from LOGIN");

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {

                Login log = new Login();

                log.setId(rs.getInt("ID_LOGIN"));
                log.setLogin(rs.getString("LOGIN"));
                log.setSenha(rs.getString("SENHA"));

                listaLogin.add(log);

            }

            return listaLogin;

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

    public ArrayList<Login> buscaLogin(Login logBean) {
        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Login> listaLogin = new ArrayList<Login>();

        try {

            Class.forName(DRIVER);

            conexao = GerenciadorConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("select ID_LOGIN, LOGIN, SENHA from LOGIN where ID_LOGIN = ?");

            instrucaoSQL.setInt(1, logBean.getId());

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {

                Login log = new Login();

                log.setId(rs.getInt("ID_LOGIN"));
                log.setLogin(rs.getString("LOGIN"));
                log.setSenha(rs.getString("SENHA"));
                
                listaLogin.add(log);
            }

            return listaLogin;

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

    public boolean validaLogin(Login logBean) {
        ResultSet rs = null;
        boolean status = false;

        try {

            Class.forName(DRIVER);

            conexao = GerenciadorConexao.abrirConexao();

            PreparedStatement instrucaoSQL = conexao.prepareStatement("select ID_LOGIN, LOGIN, SENHA, STATUS_LOGIN from LOGIN where LOGIN = ? && SENHA = ? && STATUS_LOGIN = ?");

            instrucaoSQL.setString(1, logBean.getLogin());
            instrucaoSQL.setString(2, logBean.getSenha());
            instrucaoSQL.setString(3, "A");

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                logBean.setStatus(rs.getString("STATUS_LOGIN"));
            }
            if (logBean.getStatus().equals("A")) {
                status = true;
            } else {
                status = false;
            }

            conexao.close();

        } catch (Exception e) {

            status = false;
        }
        return status;
    }
}
