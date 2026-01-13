package bootcamp.dio.java.modulo03_poo.herancaepolimorfismo;

import java.util.Scanner;

public class Exe01Cinema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ingresso ingresso = null;

        System.out.println("\n-------------------- MovieCine --------------------");
        System.out.print("Nome do filme: ");
        String filme = scanner.nextLine();

        String tipoAudio = "";
        boolean audioValido = false;

        while (!audioValido) {
            System.out.print("O filme é dublado ou legendado? ");
            String entrada = scanner.nextLine().toLowerCase();

            if (entrada.matches(".*\\d.*")) {
                System.out.println("Entrada inválida. Não use números.");
                continue;
            }

            if (entrada.equals("dub") || entrada.equals("dublado")) {
                tipoAudio = "Dublado";
                audioValido = true;
            } else if (entrada.equals("leg") || entrada.equals("legendado")) {
                tipoAudio = "Legendado";
                audioValido = true;
            } else {
                System.out.println("Opção inválida. Digite dub/dublado ou leg/legendado.");
            }
        }

        double valorBase;

        while (true) {
            System.out.print("Digite o valor base do ingresso (mínimo R$10): ");

            if (!scanner.hasNextDouble()) {
                System.out.println("Valor inválido. Digite um número.");
                scanner.next();
                continue;
            }

            valorBase = scanner.nextDouble();

            if (valorBase >= 10) {
                break;
            } else {
                System.out.println("Valor inválido. O ingresso deve custar no mínimo R$10.");
            }
        }

        scanner.nextLine();

        int tipo;

        while (true) {
            System.out.println("\nTipo de ingresso:");
            System.out.println("1 - Meia Entrada");
            System.out.println("2 - Ingresso Família");
            System.out.print("Escolha: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Opção inválida. Digite 1 ou 2.");
                scanner.next();
                continue;
            }

            tipo = scanner.nextInt();

            if (tipo == 1 || tipo == 2) {
                break;
            } else {
                System.out.println("Opção inválida. [Digite 1 ou 2]");
            }
        }

        if (tipo == 1) {
            ingresso = new MeiaEntrada(valorBase, filme, tipoAudio);
        } else {
            int pessoas;

            while (true) {
                System.out.print("Quantidade de pessoas: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Valor inválido. Digite um número inteiro.");
                    scanner.next();
                    continue;
                }

                pessoas = scanner.nextInt();

                if (pessoas > 0) {
                    break;
                } else {
                    System.out.println("Quantidade deve ser maior que zero.");
                }
            }

            ingresso = new IngressoFamilia(valorBase, filme, tipoAudio, pessoas);
        }

        System.out.println("\n---------------- RESUMO DO INGRESSO ----------------");
        ingresso.exibirInformacoes();
        System.out.printf("Valor final: R$ %.2f%n", ingresso.calcularValorFinal());

        scanner.close();
    }
}