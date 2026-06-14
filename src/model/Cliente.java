package model;

public class Cliente extends Usuario {
    private String numeroCnh;
    private String categoriaCnh;

    public Cliente(String nome, String cpf, String login, String senha, String numeroCnh, String categoriaCnh) {
        super(nome, cpf, login, senha);
        this.numeroCnh = numeroCnh;
        this.categoriaCnh = categoriaCnh;
    }

    public String getNumeroCnh() { 
        return numeroCnh; 
    }

    public void setNumeroCnh(String numeroCnh) {
        this.numeroCnh = numeroCnh;
    }

    public String getCategoriaCnh() {
        return categoriaCnh;
    }

    public void setCategoriaCnh(String categoriaCnh) {
        this.categoriaCnh = categoriaCnh;
    }

    @Override
    public String toString() {
        return super.toString() + " | CNH: " + numeroCnh + " (" + categoriaCnh + ")";
    }

    @Override
    public void exibirDados() {
        System.out.println("--- Dados do Cliente ---");
        System.out.println(this.toString());
    }
}