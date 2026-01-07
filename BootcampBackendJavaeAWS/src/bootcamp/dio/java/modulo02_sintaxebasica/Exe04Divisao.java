package bootcamp.dio.java.modulo02_sintaxebasica;

import java.util.Scanner;

public class Exe04Divisao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        int numero;

        while (true) {

            System.out.print("Digite outro número que seja maior que " + primeiroNumero+ ": ");
            numero = scanner.nextInt();

            if (numero < primeiroNumero) {
                continue;
            }

            if (numero % primeiroNumero != 0) {
                System.out.println("O número " + numero + " não é divisível por " + primeiroNumero + ". Encerrando...");
                break;
            }

            System.out.println("Número válido: " + numero);
        }

        scanner.close();
    }
}
