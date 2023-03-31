package com.example.AntecessorSucessor;

public class NumeroAntecessorSucessor {
    private int numero;

    public NumeroAntecessorSucessor(int numero) {
        this.numero = numero;
    }

    public void imprimirAntecessorSucessor() {
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Número: " + numero);
        System.out.println("Sucessor: " + sucessor);
    }
}