package bootcamp.dio.java.modulo03_poo.classeseencapsulamento;

import java.util.Scanner;

public class Exe03BanhoPetshop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MaquinaBanhoPet maquina = new MaquinaBanhoPet();
        int opcao;

        do {
            System.out.println("\n=== MENU PETSHOP ===");
            System.out.println("1 - Colocar pet na máquina");
            System.out.println("2 - Retirar pet da máquina");
            System.out.println("3 - Dar banho no pet");
            System.out.println("4 - Limpar máquina");
            System.out.println("5 - Abastecer água");
            System.out.println("6 - Abastecer shampoo");
            System.out.println("7 - Ver nível de água");
            System.out.println("8 - Ver nível de shampoo");
            System.out.println("9 - Verificar se há pet");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    maquina.colocarPet();
                    break;
                case 2:
                    maquina.retirarPet();
                    break;
                case 3:
                    maquina.darBanho();
                    break;
                case 4:
                    maquina.limparMaquina();
                    break;
                case 5:
                    maquina.abastecerAgua();
                    break;
                case 6:
                    maquina.abastecerShampoo();
                    break;
                case 7:
                    maquina.verificarAgua();
                    break;
                case 8:
                    maquina.verificarShampoo();
                    break;
                case 9:
                    maquina.verificarPet();
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
