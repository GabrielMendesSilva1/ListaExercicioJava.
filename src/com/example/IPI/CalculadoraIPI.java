package com.example.IPI;

public class CalculadoraIPI {
    private final double ipi;
    private final Peca peca1;
    private final Peca peca2;

    public CalculadoraIPI(double ipi, int codigo1, double valorUnitario1, int quantidade1, int codigo2, double valorUnitario2, int quantidade2) {
        this.ipi = ipi;
        this.peca1 = new Peca(codigo1, valorUnitario1, quantidade1);
        this.peca2 = new Peca(codigo2, valorUnitario2, quantidade2);
    }

    public double calcularValorTotal() {
        double valorTotal = (peca1.valorUnitario * peca1.quantidade) + (peca2.valorUnitario * peca2.quantidade);
        double valorTotalComIPI = valorTotal * ((ipi / 100) + 1);
        return valorTotalComIPI;
    }
}