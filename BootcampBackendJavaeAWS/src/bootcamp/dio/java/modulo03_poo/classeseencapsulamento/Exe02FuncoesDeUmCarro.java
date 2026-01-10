package bootcamp.dio.java.modulo03_poo.classeseencapsulamento;

import java.util.Scanner;

public class Exe02FuncoesDeUmCarro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        int opcao;

        do {
            System.out.println("\n======= MENU DO CARRO =======");
            System.out.println("1 - Ligar carro");
            System.out.println("2 - Desligar carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Trocar marcha");
            System.out.println("6 - Virar esquerda");
            System.out.println("7 - Virar direita");
            System.out.println("8 - Ver velocidade");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.diminuirVelocidade();
                    break;
                case 5:
                    System.out.print("Digite a nova marcha (0 a 6): ");
                    int novaMarcha = scanner.nextInt();
                    carro.trocarMarcha(novaMarcha);
                    break;
                case 6:
                    carro.virarEsquerda();
                    break;
                case 7:
                    carro.virarDireita();
                    break;
                case 8:
                    carro.verificarVelocidade();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}

