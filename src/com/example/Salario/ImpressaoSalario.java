package com.example.Salario;

import java.util.Scanner;

public class ImpressaoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        float salario = sc.nextFloat();

        Salario salarioObj = new Salario(salario, 1320.00f);

        salarioObj.calcularSalariosMinimos();

        sc.close();
    }
}