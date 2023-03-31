package com.example.Media;

public class ImpressaoMedia {
    public static void main(String[] args) {
        MediaNumeros mediaNumeros = new MediaNumeros();

        System.out.println("Média dos números 8, 9 e 7: " + mediaNumeros.media1);
        System.out.println("Média dos números 4, 5 e 6: " + mediaNumeros.media2);
        System.out.println("Soma das duas médias: " + mediaNumeros.mediaTotal);
        System.out.println("Média das médias: " + mediaNumeros.mediaMedias);
    }
}