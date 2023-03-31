package com.example.AntecessorSucessor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        NumeroAntecessorSucessor numeroAntecessorSucessor = new NumeroAntecessorSucessor(numero);
        numeroAntecessorSucessor.imprimirAntecessorSucessor();
    }
}