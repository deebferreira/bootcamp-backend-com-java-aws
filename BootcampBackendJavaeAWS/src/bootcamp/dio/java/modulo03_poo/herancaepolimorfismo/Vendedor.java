package bootcamp.dio.java.modulo03_poo.herancaepolimorfismo;

public class Vendedor extends Usuario {

    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha);
        this.quantidadeVendas = 0;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    @Override
    public boolean isAdministrador() {
        return false;
    }

    public void realizarVenda() {
        if (!isLogado()) {
            System.out.println("Você precisa estar logado para realizar venda.");
            return;
        }
        quantidadeVendas++;
        System.out.println("Venda realizada! Total de vendas: " + quantidadeVendas);
    }

    public void consultarVendas() {
        if (!isLogado()) {
            System.out.println("Você precisa estar logado para consultar vendas.");
            return;
        }
        System.out.println("Total de vendas do vendedor: " + quantidadeVendas);
    }
}