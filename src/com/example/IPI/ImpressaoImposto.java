package com.example.IPI;

public class ImpressaoImposto {
    public static void main(String[] args) {
        CalculadoraIPI calculadora = new CalculadoraIPI(10, 1, 100.50, 2, 2, 50.75, 3);
        double valorTotalComIPI = calculadora.calcularValorTotal();
        System.out.println("Valor total com IPI: " + valorTotalComIPI);
    }
}