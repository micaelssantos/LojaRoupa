package br.sp.senac.tads.dao;

import br.sp.senac.tads.model.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//teste
public class ClienteDAO {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";                                                                 //Driver do MySQL a partir da versão 8.0
    private static final String LOGIN = "admin";                                                                                     //Nome de Usuário do Bando de Dados
    private static final String SENHA = "adminadmin";                                                                                //Senha de Acesso ao Banco de Dados
    private static final String URL = "jdbc:mysql://localhost:3306/loja_roupa?useTimezone=true&serverTimezone=UTC&useSSL=false";     //URL do banco de dados
    private static Connection CONEXAO;

}
