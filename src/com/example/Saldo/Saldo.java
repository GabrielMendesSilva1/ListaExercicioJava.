package com.example.Saldo;

public class Saldo {
    public float saldo;

    public Saldo(float saldo) {
        this.saldo = saldo;
    }

    public void imprimirSaldoReajustado() {
        float saldoReajustado = this.saldo * 1.01f;
        System.out.printf("Saldo com reajuste de 1%%: %.2f\n", saldoReajustado);
    }
}