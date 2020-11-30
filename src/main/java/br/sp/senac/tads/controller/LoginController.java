package br.sp.senac.tads.controller;

import br.sp.senac.tads.dao.LoginDAO;
import br.sp.senac.tads.model.Login;
import java.util.ArrayList;

/**
*
* @author joliveira
* @see br.sp.senac.tads.dao.LoginDAO
* @see br.sp.senac.tads.model.Login
* 
*/
public class LoginController {
    
    /**
     * Instância do Objeto LoginDAO
     */
    LoginDAO logDAO = new LoginDAO();

    /**
     * Método responsável por Cadastrar um Login
     * 
     * @param logBean Objeto do Tipo Login
     */
    public void cadastrarController(Login logBean) {
        logDAO.cadastrarLogin(logBean);
    }
    
    /**
     * Metódo repsonsável por alterar um Objeto Login
     * 
     * @param logBean Objeto do Tipo Login
     */
    public void alterarController(Login logBean) {
        logDAO.alterarLogin(logBean);
    }
    
    /**
     * Método responsável por remover um Login
     * 
     * @param logBean Objeto do Tipo Login
     */
    public void removerController(Login logBean) {
        logDAO.removerLogin(logBean);
    }
    
    /**
     * Método que retorna uma lista de Logins
     * 
     * @return Retorna uma lista de Login
     */
    public ArrayList pesquisarController() {
        ArrayList<Login> listaLogin = new ArrayList<Login>();
        listaLogin = logDAO.listarLogin();
        return listaLogin;
    }
    
    /**
     * Método responsável por buscar um Objeto do Tipo Login
     * 
     * @param logBean Objeto do Tipo Login
     * @return Retorna uma lista de Login contendo o Objeto pesquisado
     */
    public ArrayList buscaController(Login logBean) {
        ArrayList<Login> listaLogin = new ArrayList<Login>();
        listaLogin = logDAO.buscaLogin(logBean);
        return listaLogin;
    }
    
    /**
     * Método responsável por validar as informações inseridas com o BD
     * 
     * @param logBean
     * @return status da validação do login 
     */
    public boolean validaController(Login logBean) {
        boolean status;
        status = logDAO.validaLogin(logBean);
        return status;
    }
}