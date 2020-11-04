package br.sp.senac.tads.controller;

import br.sp.senac.tads.dao.ClienteDAO;
import br.sp.senac.tads.model.Cliente;

public class ClienteController {

    public static boolean Adicionar(String nome, String CPF, String dataNascimento, String estadoCivil, String sexo, String CEP,
            String logradouro, String numero, String telefone, String celular, String email) {
        Cliente obj = new Cliente();
        obj.setNomeCliente(nome);
        obj.setCPF(CPF);
        obj.setDataNascimento(dataNascimento);
        obj.setEstadoCivil(estadoCivil);
        obj.setSexo(sexo);
        obj.setCEP(CEP);
        obj.setLogradouro(logradouro);
        obj.setNumero(numero);
        obj.setTelefone(telefone);
        obj.setCelular(celular);
        obj.setEmail(email);

        return ClienteDAO.adicionar(obj);
    }

    public static boolean Consultar(String nome, String CPF, String dataNascimento, String estadoCivil, String sexo, String CEP,
            String logradouro, String numero, String telefone, String celular, String email) {
        Cliente obj = new Cliente();
        obj.setNomeCliente(nome);
        obj.setCPF(CPF);
        obj.setDataNascimento(dataNascimento);
        obj.setEstadoCivil(estadoCivil);
        obj.setSexo(sexo);
        obj.setCEP(CEP);
        obj.setLogradouro(logradouro);
        obj.setNumero(numero);
        obj.setTelefone(telefone);
        obj.setCelular(celular);
        obj.setEmail(email);

        return ClienteDAO.consultar(obj);
    }

    public static boolean alterar(String nome, String CPF, String dataNascimento, String estadoCivil, String sexo, String CEP,
            String logradouro, String numero, String telefone, String celular, String email) {
        Cliente obj = new Cliente();
        obj.setNomeCliente(nome);
        obj.setCPF(CPF);
        obj.setDataNascimento(dataNascimento);
        obj.setEstadoCivil(estadoCivil);
        obj.setSexo(sexo);
        obj.setCEP(CEP);
        obj.setLogradouro(logradouro);
        obj.setNumero(numero);
        obj.setTelefone(telefone);
        obj.setCelular(celular);
        obj.setEmail(email);

        return ClienteDAO.alterar(obj);
    }

    public static boolean Remover(String nome, String CPF, String dataNascimento, String estadoCivil, String sexo, String CEP,
            String logradouro, String numero, String telefone, String celular, String email) {
        Cliente obj = new Cliente();
        obj.setNomeCliente(nome);
        obj.setCPF(CPF);
        obj.setDataNascimento(dataNascimento);
        obj.setEstadoCivil(estadoCivil);
        obj.setSexo(sexo);
        obj.setCEP(CEP);
        obj.setLogradouro(logradouro);
        obj.setNumero(numero);
        obj.setTelefone(telefone);
        obj.setCelular(celular);
        obj.setEmail(email);

        return ClienteDAO.remover(obj);
    }
}
