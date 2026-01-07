package bootcamp.dio.java.modulo02_sintaxebasica;

import java.util.Scanner;

public class Exe03ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiro = scanner.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int segundo = scanner.nextInt();

        System.out.print("Digite [1] para ÍMPAR ou [2] para PAR: ");
        int opcao = scanner.nextInt();

        for (int i = segundo; i >= primeiro; i--) {

            if (opcao == 2 && i % 2 == 0) {
                System.out.print(i + " -> ");
            } else if (opcao == 1 && i % 2 != 0) {
                System.out.print(i + " -> " );
            }
        }
        System.out.print("FIM");
        scanner.close();
    }
}