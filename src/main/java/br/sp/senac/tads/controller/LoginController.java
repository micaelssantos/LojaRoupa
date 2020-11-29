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
    
    LoginDAO logDAO = new LoginDAO();
    
    public void cadastrarController(Login logBean) {
        
        logDAO.cadastrarLogin(logBean);
        
    }
    
    public void alterarController(Login logBean) {
    
        logDAO.alterarLogin(logBean);
        
    }
    
    public void removerController(Login logBean) {
        
        logDAO.removerLogin(logBean);
        
    }
    
    public ArrayList pesquisarController() {
        
        ArrayList<Login> listaLogin = new ArrayList<Login>();
        
        listaLogin = logDAO.listarLogin();
        
        return listaLogin;
        
    }
    
    public ArrayList buscaController(Login logBean) {
        
        ArrayList<Login> listaLogin = new ArrayList<Login>();
        
        listaLogin = logDAO.buscaLogin(logBean);
        
        return listaLogin;
        
    }
    
    public boolean validaController(Login logBean) {
        
        boolean status;
        
        status = logDAO.validaLogin(logBean);

        return status;
        
    }
    
}
