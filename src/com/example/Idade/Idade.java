package com.example.Idade;

public class Idade {
    private int anos;
    private int meses;
    private int dias;

    public Idade(int anos, int meses, int dias) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public int emDias() {
        int totalDias = 0;
        totalDias += anos * 365;
        totalDias += meses * 30;
        totalDias += dias;
        return totalDias;
    }
}