package bootcamp.dio.java.modulo02_sintaxebasica;

import java.util.Scanner;
import java.util.Locale;

public class Exe02CalculoImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite sua altura (ex: 1.70): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso (ex: 65.5): ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf(Locale.US, "Seu IMC é: %.2f%n", imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }

        scanner.close();
    }
}
