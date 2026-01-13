package bootcamp.dio.java.modulo03_poo.herancaepolimorfismo;

public sealed abstract class Ingresso
        permits MeiaEntrada, IngressoFamilia {

    protected double valor;
    protected String nomeFilme;
    protected String tipoAudio;

    public Ingresso(double valor, String nomeFilme, String tipoAudio) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.tipoAudio = tipoAudio;
    }

    public void exibirInformacoes() {
        System.out.println("Filme: " + nomeFilme);
        System.out.println("Áudio: " + tipoAudio);
    }

    public abstract double calcularValorFinal();
}
