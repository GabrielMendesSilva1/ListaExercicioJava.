package com.example.Idade;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a idade em anos: ");
            int anos = sc.nextInt();
            System.out.print("Digite a idade em meses: ");
            int meses = sc.nextInt();
            System.out.print("Digite a idade em dias: ");
            int dias = sc.nextInt();
            sc.close();

            Idade idade = new Idade(anos, meses, dias);
            int totalDias = idade.emDias();
            System.out.println("A idade informada em dias é: " + totalDias);
        }
    }