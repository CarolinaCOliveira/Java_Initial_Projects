//DESAFIO: DIVISORES I
Ler um número inteiro N e calcular todos os seus divisores.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Escreva todos os divisores positivos de N, um valor por linha.

 
Exemplo de Entrada	Exemplo de Saída
6

1
2
3
6




import java.util.Scanner;
import java.io.IOException;

public class Problem {
//complete os espaços em branco com sua solução
     public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        for (int i = 1; i<=n ; i++)
            if (n % i == 0) System.out.println(i);
        input.close();
    }
}
