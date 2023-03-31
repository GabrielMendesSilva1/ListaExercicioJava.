package com.example.Salario;

public class Salario {
    private float salario;
    private float salarioMinimo;

    public Salario(float salario, float salarioMinimo) {
        this.salario = salario;
        this.salarioMinimo = salarioMinimo;
    }

    public void calcularSalariosMinimos() {
        float quantidade = salario / salarioMinimo;
        System.out.printf("O usuário ganha %.2f salários mínimos.%n", quantidade);
    }
}