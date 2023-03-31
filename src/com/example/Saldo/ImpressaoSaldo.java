package com.example.Saldo;

import java.util.Scanner;

public class ImpressaoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o saldo: ");
        float saldo = scanner.nextFloat();

        Saldo saldoObj = new Saldo(saldo);
        saldoObj.imprimirSaldoReajustado();

        scanner.close();
    }
}