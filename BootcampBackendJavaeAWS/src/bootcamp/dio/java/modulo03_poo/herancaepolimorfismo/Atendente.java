package bootcamp.dio.java.modulo03_poo.herancaepolimorfismo;


public class Atendente extends Usuario {

    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha);
        this.valorEmCaixa = 0.0;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    @Override
    public boolean isAdministrador() {
        return false;
    }

    public void receberPagamento(double valor) {
        if (!isLogado()) {
            System.out.println("Você precisa estar logado para receber pagamentos.");
            return;
        }
        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }
        valorEmCaixa += valor;
        System.out.printf("Pagamento recebido! Caixa agora: R$ %.2f%n", valorEmCaixa);
    }

    public void fecharCaixa() {
        if (!isLogado()) {
            System.out.println("Você precisa estar logado para fechar o caixa.");
            return;
        }
        System.out.printf("Fechando caixa. Total em caixa: R$ %.2f%n", valorEmCaixa);
        valorEmCaixa = 0.0;
        System.out.println("Caixa zerado.");
    }
}
