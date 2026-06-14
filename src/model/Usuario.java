package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// classe abstrata utilizando serialize
public abstract class Usuario implements Serializable {
    // encapsulamento com atributos privados
    private String nome;
    private String cpf;
    private String login;
    private String senha;
    private List<String> historicoSenhas; // não repetir as ultimas 3 senhas

    // construtor
    public Usuario(String nome, String cpf, String login, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.historicoSenhas = new ArrayList<>();
        this.historicoSenhas.add(senha);
    }

    // getters e setters
    public String getNome() { 
        return nome; 
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public List<String> getHistoricoSenhas() {
        return historicoSenhas;
    }

    public void adicionarNovaSenha(String novaSenha) {
        this.historicoSenhas.add(novaSenha);
        this.senha = novaSenha;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | CPF: " + cpf + " | Login: " + login;
    }

    public abstract void exibirDados();
}