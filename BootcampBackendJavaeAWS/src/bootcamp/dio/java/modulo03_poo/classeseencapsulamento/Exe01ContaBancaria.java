package bootcamp.dio.java.modulo03_poo.classeseencapsulamento;

import java.util.Scanner;

public class Exe01ContaBancaria {
    public static void main(String[] args) {

        double saldoInicial;

        do {
            System.out.print("Digite o saldo inicial da conta (valor positivo): ");
            Scanner scanner = new Scanner(System.in);
            saldoInicial = scanner.nextDouble();
        } while (saldoInicial < 0);

        ContaBancaria conta = new ContaBancaria(saldoInicial);

        int opcao;

        do {
            System.out.println("------------------ MENU ------------------");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();
            System.out.println("------------------------------------------");

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;

                case 2:
                    conta.consultarChequeEspecial();
                    break;

                case 3:
                    System.out.print("Digite o valor para depósito: ");
                    conta.depositar(scanner.nextDouble());
                    break;

                case 4:
                    System.out.print("Digite o valor para saque: ");
                    conta.sacar(scanner.nextDouble());
                    break;

                case 5:
                    System.out.print("Digite o valor do boleto: ");
                    conta.pagarBoleto(scanner.nextDouble());
                    break;

                case 6:
                    if (conta.estaUsandoChequeEspecial()) {
                        System.out.println("A conta está usando cheque especial.");
                    } else {
                        System.out.println("A conta NÃO está usando cheque especial.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
}
