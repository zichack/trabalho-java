package model;

public class Funcionario extends Usuario {
    private String matricula;

    public Funcionario(String nome, String cpf, String login, String senha, String matricula) {
        super(nome, cpf, login, senha);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + " | Matrícula: " + matricula;
    }

    @Override
    public void exibirDados() {
        System.out.println("--- Dados do Funcionário ---");
        System.out.println(this.toString());
    }
}