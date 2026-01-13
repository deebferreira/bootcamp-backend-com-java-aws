package bootcamp.dio.java.modulo03_poo.herancaepolimorfismo;

public non-sealed class IngressoFamilia extends Ingresso {

    private int quantidadePessoas;

    public IngressoFamilia(double valor, String nomeFilme, String tipoAudio, int quantidadePessoas) {
        super(valor, nomeFilme, tipoAudio);
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public double calcularValorFinal() {
        double total = valor * quantidadePessoas;

        if (quantidadePessoas > 3) {
            total *= 0.95; // desconto de 5%
        }

        return total;
    }
}