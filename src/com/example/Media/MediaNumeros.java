package com.example.Media;

public class MediaNumeros {
    int media1;
    int media2;
    int mediaTotal;
    int mediaMedias;

    public MediaNumeros() {
        this.calcularMedia1();
        this.calcularMedia2();
        this.calcularMediaTotal();
        this.calcularMediaMedias();
    }

    public float calcularMedia1() {
        media1 = (8 + 9 + 7) / 3;
        return media1;
    }
    public float calcularMedia2(){
        media2 = media2 = (4 + 5 + 6) / 3;
        return media2;
    }

    public float calcularMediaTotal() {
        mediaTotal = media1 + media2;
        return mediaTotal;
    }

    public float calcularMediaMedias() {
        mediaMedias = mediaTotal / 2;
        return mediaMedias;
    }
}
