package bootcamp.dio.java.modulo01_fundamentos;

import java.util.Scanner;

public class Exe01Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = 2025 - anoNascimento;

        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        scanner.close();
    }
}