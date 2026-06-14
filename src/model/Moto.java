package model;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String marca, String modelo, double valorBaseDiaria, int cilindradas) {
        super(placa, marca, modelo, valorBaseDiaria);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    // motos acima de 400cc tem acrescimo de 10% na diaria
    @Override
    public double calcularDiaria(int dias) {
        double valor = getValorBaseDiaria() * dias;
        if (cilindradas > 400) {
            valor += (valor * 0.10);
        }
        return valor;
    }

    @Override
    public String toString() {
        return "MOTO | " + super.toString() + " | Cilindradas: " + cilindradas + "cc";
    }
}