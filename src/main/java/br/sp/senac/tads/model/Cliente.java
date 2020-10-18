package br.sp.senac.tads.model;

public class Cliente {
    
    private int id;
    private String nomeCliente;
    private String CPF;
    private String dataNascimento;
    private String estadoCivil;
    private String sexo;
    private String CEP;
    private String logradouro;
    private String numero;
    private String telefone;
    private String celular;
    private String email;

    public Cliente() {
    }

    public Cliente(int id, String nomeCliente, String CPF, String dataNascimento, String estadoCivil, String sexo, String CEP, String logradouro, String numero, String telefone, String celular, String email) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.CEP = CEP;
        this.logradouro = logradouro;
        this.numero = numero;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }

    public Cliente(String nomeCliente, String CPF, String dataNascimento, String estadoCivil, String sexo, String CEP, String logradouro, String numero, String telefone, String celular, String email) {
        this.nomeCliente = nomeCliente;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.CEP = CEP;
        this.logradouro = logradouro;
        this.numero = numero;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }
  
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
