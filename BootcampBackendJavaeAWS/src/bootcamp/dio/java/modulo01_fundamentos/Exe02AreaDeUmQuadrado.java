package bootcamp.dio.java.modulo01_fundamentos;

import java.util.Scanner;
import java.util.Locale;

public class Exe02AreaDeUmQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.printf(Locale.US, "A área do quadrado é: %.2f%n", area);

        scanner.close();
    }
}