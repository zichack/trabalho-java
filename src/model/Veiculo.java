package model;

import java.io.Serializable;
import model.interfaces.Calculavel;

public abstract class Veiculo implements Calculavel, Serializable {
    private String placa;
    private String marca;
    private String modelo;
    private double valorBaseDiaria;
    private boolean disponivel;

    public Veiculo(String placa, String marca, String modelo, double valorBaseDiaria) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.valorBaseDiaria = valorBaseDiaria;
        this.disponivel = true; // todo veiculo cadastrado começa disponível
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorBaseDiaria() {
        return valorBaseDiaria;
    }

    public void setValorBaseDiaria(double valorBaseDiaria) {
        this.valorBaseDiaria = valorBaseDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " - Placa: " + placa + " | Status: " + (disponivel ? "Disponível" : "Alugado");
    }
}