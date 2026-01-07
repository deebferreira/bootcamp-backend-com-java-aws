package bootcamp.dio.java.modulo02_sintaxebasica;

import java.util.Scanner;

public class Desafio01SintaxeBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String solicitacao = scanner.nextLine();

        String texto = solicitacao.toLowerCase();

        if (texto.contains("funcao") || texto.contains("funcoes")
                || texto.contains("executar")) {
            System.out.println("Lambda");
        }
        else if (texto.contains("banco") || texto.contains("dados")
                || texto.contains("relacional")) {
            System.out.println("RDS");
        }
        else if (texto.contains("armazenar") || texto.contains("arquivos")
                || texto.contains("imagens") || texto.contains("videos")) {
            System.out.println("S3");
        }
        else if (texto.contains("servidor")) {
            System.out.println("EC2");
        }
        else {
            System.out.println("Servico desconhecido");
        }
        scanner.close();
    }
}