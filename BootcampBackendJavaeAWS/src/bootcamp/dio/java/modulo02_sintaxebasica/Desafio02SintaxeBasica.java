package bootcamp.dio.java.modulo02_sintaxebasica;

import java.util.Scanner;

public class Desafio02SintaxeBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codigo = scanner.nextLine();

        if (codigo.equals("EC2")) {
            System.out.println("EC2");
        }
        else if (codigo.equals("S3")) {
            System.out.println("S3");
        }
        else if (codigo.equals("Lambda")) {
            System.out.println("Lambda");
        }
        else {
            System.out.println("Codigo invalido");
        }

        scanner.close();
    }
}