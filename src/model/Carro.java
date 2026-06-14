package model;

public class Carro extends Veiculo {
    private int quantidadePortas;
    private boolean possuiArCondicionado;

    public Carro(String placa, String marca, String modelo, double valorBaseDiaria, int quantidadePortas, boolean possuiArCondicionado) {
        super(placa, marca, modelo, valorBaseDiaria);
        this.quantidadePortas = quantidadePortas;
        this.possuiArCondicionado = possuiArCondicionado;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public boolean isPossuiArCondicionado() {
        return possuiArCondicionado;
    }

    public void setPossuiArCondicionado(boolean possuiArCondicionado) {
        this.possuiArCondicionado = possuiArCondicionado;
    }

    // carro com ar condicionado tem acrescimo de 20% na diaria
    @Override
    public double calcularDiaria(int dias) {
        double valor = getValorBaseDiaria() * dias;
        if (possuiArCondicionado) {
            valor += (valor * 0.20);
        }
        return valor;
    }

    @Override
    public String toString() {
        return "CARRO | " + super.toString() + " | Portas: " + quantidadePortas + " | Ar: "
                + (possuiArCondicionado ? "Sim" : "Não");
    }
}