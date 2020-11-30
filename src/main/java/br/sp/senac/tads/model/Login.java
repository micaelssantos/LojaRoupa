package br.sp.senac.tads.model;

/**
 *
 * @author joliveira
 */
public class Login {
    
    private int id;
    private String login;
    private String senha;
    private String status;

    /**
     * Construtor Vazio
     */
    public Login() {
    }
    
    /**
     * Construtor do Obejto Login
     * 
     * @param id
     * @param login
     * @param senha
     * @param status 
     */
    public Login(int id, String login, String senha, String status) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.status = status;
    }
    
    /**
     * Metódo que retorna o id do usuário
     * 
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Metódo que insere o id do usuário
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Metódo que retorna o login do usuário
     * 
     * @return login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Metódo que insere o login do usuário
     * 
     * @param login 
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Metódo que retorna a senha do usuário
     * 
     * @return senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Metódo que insere a senha do usuário
     * 
     * @param senha 
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Metódo que retorna o status do usuário
     * 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Metódo que insere o status do usuário
     * 
     * @param status 
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
