package bootcamp.dio.java.modulo03_poo.herancaepolimorfismo;

public final class MeiaEntrada extends Ingresso {

    public MeiaEntrada(double valor, String nomeFilme, String tipoAudio) {
        super(valor, nomeFilme, tipoAudio);
    }

    @Override
    public double calcularValorFinal() {
        return valor / 2;
    }
}