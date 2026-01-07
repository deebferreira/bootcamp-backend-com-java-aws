package bootcamp.dio.java.modulo01_fundamentos;

import java.util.Scanner;
import java.util.Locale;

public class Exe03AreaDeUmRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.printf(Locale.US, "A área do retângulo é: %.2f%n", area);

        scanner.close();
    }
}