//DESAFIO: MULTIPLICAÇÃO SIMPLES

Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores. Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).   

Entrada
A entrada contém 2 valores inteiros.

Saída
Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade.

 
Exemplos de Entrada	Exemplos de Saída
3
9

PROD = 27



import java.util.Scanner;
import java.io.IOException;

public class Main {
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
