package bootcamp.dio.java.modulo03_poo.herancaepolimorfismo;

public class Gerente extends Usuario {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public boolean isAdministrador() {
        return true;
    }

    public void gerarRelatorioFinanceiro() {
        if (!isLogado()) {
            System.out.println("Você precisa estar logado para gerar relatório.");
            return;
        }
        System.out.println("Gerando relatório financeiro...");
    }

    public void consultarVendas() {
        if (!isLogado()) {
            System.out.println("Você precisa estar logado para consultar vendas.");
            return;
        }
        System.out.println("Consultando vendas (visão do gerente)...");
    }
}
