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

    /**
     * Construtor Vazio da Classe Cliente
     */
    public Cliente() {
    }

    /**
     * Construtor quando é editado algum dados de um Cliente
     * 
     * @param id Variavel do tipo int
     * @param nomeCliente Variavel do tipo String
     * @param CPF Variavel do tipo String
     * @param dataNascimento Variavel do tipo String
     * @param estadoCivil Variavel do tipo String
     * @param sexo Variavel do tipo String
     * @param CEP Variavel do tipo String
     * @param logradouro Variavel do tipo String
     * @param numero Variavel do tipo String
     * @param telefone Variavel do tipo String
     * @param celular Variavel do tipo String
     * @param email Variavel do tipo String
     */
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
    
    /**
     * Construtor quando é salvo um cliente
     * 
     * @param nomeCliente Variavel do tipo String
     * @param CPF Variavel do tipo String
     * @param dataNascimento Variavel do tipo String
     * @param estadoCivil Variavel do tipo String
     * @param sexo Variavel do tipo String
     * @param CEP Variavel do tipo String
     * @param logradouro Variavel do tipo String
     * @param numero Variavel do tipo String
     * @param telefone Variavel do tipo String
     * @param celular Variavel do tipo String
     * @param email Variavel do tipo String
     */
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
  
    
    /**
     * Método que retorna o ID do Cliente
     * 
     * @return id
     */
    public int getId() {
        return id;
    }
    
    /**
     * Método que insere o ID do Cliente
     *  
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método que retorna o Nome do Cliente
     * 
     * @return nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Método que insere o Nome do Cliente
     * 
     * @param nomeCliente 
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * 
     * Método que retorna o CPF do Cliente
     * 
     * @return 
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * Método que insere o ID do Cliente
     * 
     * @param CPF 
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
     
    /**
     * Método que retorna a Data de Nascimento do Cliente.
     * 
     * @return dataNascimento.
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Método que insere a Data de Nascimento do Cliente.
     * 
     * @param dataNascimento 
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * Método que retorna o Estado Civil do Cliente.
     * 
     * @return estadoCivil.
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Método que insere o Estado Civil do Cliente.
     * 
     * @param estadoCivil 
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * Método que retorna o sexo do Cliente.
     * 
     * @return sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Método que insere o Sexo do Cliente.
     * 
     * @param sexo 
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Método que retorna o cep do Cliente.
     * 
     * @return cep
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * Método que insere o cep do Cliente.
     * 
     * @param CEP 
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * Método que retorna o Logradouro do Cliente.
     * 
     * @return logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Método que insere o Logradouro do Cliente.
     * 
     * @param logradouro 
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * Método que retorna o Número do Cliente.
     * 
     * @return numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Método que insere o Número do Cliente.
     * 
     * @param numero 
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Método que retorna o Telefone do Cliente.
     * 
     * @return telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Método que insere o Telefone do Cliente.
     * 
     * @param telefone 
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Método que retorna o Celular do Cliente.
     * 
     * @return celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Método que insere o Celular do Cliente.
     * 
     * @param celular 
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Método que retorna o Email do Cliente.
     * 
     * @return email 
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método que insere o email do Cliente.
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
