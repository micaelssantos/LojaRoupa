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
    public static String DRIVER = "com.mysql.cj.jdbc.Driver";   //DRIVER DO MYSQL A PARTIR DA VERSÃO 8                   
    public static String SERVER = "localhost";                  //ENDEREÇO DO SERVIDOR DE BANCO DE DADOS
    public static String DATABASE = "loja_roupa";               //NOME DO BANCO DE DADOS
    public static String LOGIN = "root";                        //USUÁRIO DO BANCO DE DADOS      
    public static String SENHA = "admin";                       //SENHA DE ACESSO
    public static String URL = "";
    public static Connection CONEXAO;

    /**
     * Construtor vazio do Gerenciador de Conexões
     */
    public GerenciadorConexao() {
    }

    /**
     * Método responsável por abrir a conexão com o Banco de Dados
     * 
     * @return CONEXAO - Objeto do Tipo Connection 
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public static Connection abrirConexao() throws ClassNotFoundException, SQLException {
        
        /**
         * Cria a URL concatenando os valores inseridos pelas variaveis da classe
         * 
         */
        URL = "jdbc:mysql://" + SERVER + ":3306/" + DATABASE + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
        
        /**
         * Verifica se a conxão está vazia
         */
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

    /**
     * Método responsável por Fechar a conexão com o Banco de Dados.
     * 
     * @return boolean informando se a conexão está fechada ou aberta
     * @throws SQLException 
     */
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

    /**
     * Método responsável por informar se está conectado ou não.
     * 
     * @return STATUS  
     */
    public static String getStatusConexao() {
        return STATUS;
    }
}
