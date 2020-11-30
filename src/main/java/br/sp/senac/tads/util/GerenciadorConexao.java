package br.sp.senac.tads.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dilaz
 */
public class GerenciadorConexao {

    public static String STATUS = "Não conectado";
    public static String DRIVER = "com.mysql.cj.jdbc.Driver";  //A partir da versao 8.0, mudou para com.mysql.cj.jdbc.Driver (Connector/J)                   

    public static String SERVER = "localhost";
    public static String DATABASE = "loja_roupa";        //nome do seu banco de dados

    public static String LOGIN = "root";                     //nome de um usuário de seu BD      
    public static String SENHA = "adminadmin";                         //sua senha de acesso

    public static String URL = "";

    public static Connection CONEXAO;

    public GerenciadorConexao() {
    }

    public static Connection abrirConexao() throws ClassNotFoundException, SQLException {

        URL = "jdbc:mysql://" + SERVER + ":3306/" + DATABASE + "?useTimezone=true&serverTimezone=UTC&useSSL=false";

        if (CONEXAO == null) {
            try {

                //Carrega a classe responsável pelo driver
                Class.forName(DRIVER);
                CONEXAO = DriverManager.getConnection(URL, LOGIN, SENHA);

                if (CONEXAO != null) {
                    STATUS = "Conexão realizada com sucesso!";
                } else {
                    STATUS = "Não foi possivel realizar a conexão";
                }

            } catch (ClassNotFoundException e) {  //Driver não encontrado

                throw new ClassNotFoundException("O driver expecificado nao foi encontrado.");

            } catch (SQLException e) {  //Erro ao estabelecer a conexão (Ex: login ou senha errados)

                //Outra falha de conexão
                throw new SQLException("Erro ao estabelecer a conexão (Ex: login ou senha errados).");
            }

        } else {
            try {
                //Se a conexão estiver fechada, reabro a conexão
                if (CONEXAO.isClosed()) {
                    CONEXAO = DriverManager.getConnection(URL, LOGIN, SENHA);
                }
            } catch (SQLException ex) {
                throw new SQLException("Falha ao fechar a conexão.");
            }
        }
        return CONEXAO;
    }

    public static String getStatusConexao() {
        return STATUS;
    }

    public static boolean fecharConexao() throws SQLException {

        boolean retorno = false;

        try {
            if (CONEXAO != null) {
                if (!CONEXAO.isClosed()) {
                    CONEXAO.close();
                }
            }

            STATUS = "Não conectado";
            retorno = true;

        } catch (SQLException e) {
            retorno = false;
        }

        return retorno;
    }

}
