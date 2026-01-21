package bootcamp.dio.java.modulo03_poo.herancaepolimorfismo;

import java.util.Scanner;

public class Exe02UsuariosSistema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Gerente gerente = new Gerente("Gabi", "gerente@email.com", "123");
        Vendedor vendedor = new Vendedor("Vini", "vendedor@email.com", "123");
        Atendente atendente = new Atendente("Ana", "atendente@email.com", "123");

        int perfil;

        do {
            System.out.println("\n=== SISTEMA ===");
            System.out.println("1 - Gerente");
            System.out.println("2 - Vendedor");
            System.out.println("3 - Atendente");
            System.out.println("0 - Sair");
            System.out.print("Escolha o perfil: ");
            perfil = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            Usuario usuario = null;

            if (perfil == 1) usuario = gerente;
            else if (perfil == 2) usuario = vendedor;
            else if (perfil == 3) usuario = atendente;
            else if (perfil == 0) {
                System.out.println("Encerrando...");
                break;
            } else {
                System.out.println("Opção inválida.");
                continue;
            }

            menuUsuario(scanner, usuario);

        } while (true);

        scanner.close();
    }

    private static void menuUsuario(Scanner scanner, Usuario usuario) {

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("Usuário: " + usuario.getNome());
            System.out.println("Administrador: " + (usuario.isAdministrador() ? "SIM" : "NÃO"));
            System.out.println("1 - Login");
            System.out.println("2 - Logoff");
            System.out.println("3 - Alterar dados");
            System.out.println("4 - Alterar senha");

            if (usuario instanceof Gerente) {
                System.out.println("5 - Gerar relatório financeiro");
                System.out.println("6 - Consultar vendas");
            } else if (usuario instanceof Vendedor) {
                System.out.println("5 - Realizar venda");
                System.out.println("6 - Consultar vendas");
            } else if (usuario instanceof Atendente) {
                System.out.println("5 - Receber pagamento");
                System.out.println("6 - Fechar caixa");
            }

            System.out.println("0 - Voltar");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();
                    usuario.realizarLogin(email, senha);
                }
                case 2 -> usuario.realizarLogoff();
                case 3 -> {
                    System.out.print("Novo nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Novo email: ");
                    String email = scanner.nextLine();
                    usuario.alterarDados(nome, email);
                }
                case 4 -> {
                    System.out.print("Senha atual: ");
                    String atual = scanner.nextLine();
                    System.out.print("Nova senha: ");
                    String nova = scanner.nextLine();
                    usuario.alterarSenha(atual, nova);
                }
                case 5 -> {
                    if (usuario instanceof Gerente g) {
                        g.gerarRelatorioFinanceiro();
                    } else if (usuario instanceof Vendedor v) {
                        v.realizarVenda();
                    } else if (usuario instanceof Atendente a) {
                        System.out.print("Valor do pagamento: ");
                        double valor = scanner.nextDouble();
                        scanner.nextLine();
                        a.receberPagamento(valor);
                    } else {
                        System.out.println("Ação não disponível.");
                    }
                }
                case 6 -> {
                    if (usuario instanceof Gerente g) {
                        g.consultarVendas();
                    } else if (usuario instanceof Vendedor v) {
                        v.consultarVendas();
                    } else if (usuario instanceof Atendente a) {
                        a.fecharCaixa();
                    } else {
                        System.out.println("Ação não disponível.");
                    }
                }
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}