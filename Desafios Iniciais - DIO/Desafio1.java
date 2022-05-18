package Iniciais;

import java.util.Scanner;
import java.io.IOException;

public class Desafio1 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int A, B, PROD;

        A = sc.nextInt();
        B = sc.nextInt();

        PROD = A*B;

        System.out.println("PROD = " + PROD);

        sc.close();

    }
}
