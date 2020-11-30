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

    public Login() {
    }
    
    public Login(int id, String login, String senha, String status) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.status = status;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
