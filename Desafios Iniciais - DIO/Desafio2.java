package Iniciais;

import java.util.Scanner;


public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();

        media = A/B;

        System.out.printf("%.2f", media);
    }
}
