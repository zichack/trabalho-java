package model;

import java.io.Serializable;

// classe composta
public class Locacao implements Serializable {
    private int idLocacao;
    private Cliente cliente; // composição 1
    private Funcionario funcionario; // composição 2
    private Veiculo veiculo; // composição 3
    private int quantidadeDias;
    private double valorTotal;

    public Locacao(int idLocacao, Cliente cliente, Funcionario funcionario, Veiculo veiculo, int quantidadeDias) {
        this.idLocacao = idLocacao;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.veiculo = veiculo;
        this.quantidadeDias = quantidadeDias;
        // valor total calculado usando poliformismo
        this.valorTotal = veiculo.calcularDiaria(quantidadeDias);

        // ao criar a locação, o veículo fica indisponível
        this.veiculo.setDisponivel(false);
    }

    public int getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Locação #" + idLocacao + "\n" +
                "Cliente: " + cliente.getNome() + "\n" +
                "Funcionário: " + funcionario.getNome() + "\n" +
                "Veículo: " + veiculo.getMarca() + " " + veiculo.getModelo() + " (" + veiculo.getPlaca() + ")\n" +
                "Dias: " + quantidadeDias + " | Valor Total: R$ " + valorTotal;
    }
}