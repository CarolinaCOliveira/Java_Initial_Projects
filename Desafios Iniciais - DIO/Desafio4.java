package Iniciais;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String T = scan.nextLine();
        String respostasCompetidores = scan.nextLine();

        int count = 0;

        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");
        int var = respostasCompetidoresSplit.length;

        for (int i=0; i <= respostasCompetidoresSplit.length; i++){
            if (respostasCompetidoresSplit[i].equals(T)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
