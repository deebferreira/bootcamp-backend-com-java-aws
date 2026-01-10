package bootcamp.dio.java.modulo03_poo.classeseencapsulamento;

public class Carro {

    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro() {
        ligado = false;
        velocidade = 0;
        marcha = 0;
    }

    public void ligar() {
        if (ligado) {
            System.out.println("O carro já está ligado.");
        } else {
            ligado = true;
            System.out.println("Carro ligado.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O carro já está desligado.");
        } else if (velocidade == 0 && marcha == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Para desligar, o carro deve estar parado e em ponto morto.");
        }
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
        } else if (marcha == 0) {
            System.out.println("Não é possível acelerar em ponto morto.");
        } else if (velocidade < 120) {
            velocidade++;
            System.out.println("Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("Velocidade máxima atingida.");
        }
    }

    public void diminuirVelocidade() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
        } else if (velocidade > 0) {
            velocidade--;
            System.out.println("Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida.");
            return;
        }

        if (Math.abs(novaMarcha - marcha) != 1) {
            System.out.println("Não é permitido pular marchas.");
            return;
        }

        if (
                (novaMarcha == 1 && velocidade > 20) ||
                        (novaMarcha == 2 && (velocidade < 21 || velocidade > 40)) ||
                        (novaMarcha == 3 && (velocidade < 41 || velocidade > 60)) ||
                        (novaMarcha == 4 && (velocidade < 61 || velocidade > 80)) ||
                        (novaMarcha == 5 && (velocidade < 81 || velocidade > 100)) ||
                        (novaMarcha == 6 && (velocidade < 101 || velocidade > 120))
        ) {
            System.out.println("Velocidade incompatível com essa marcha.");
        } else {
            marcha = novaMarcha;
            System.out.println("Marcha atual: " + marcha);
        }
    }

    public void virarEsquerda() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
        } else if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para a esquerda.");
        } else {
            System.out.println("Velocidade incompatível para virar.");
        }
    }

    public void virarDireita() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
        } else if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para a direita.");
        } else {
            System.out.println("Velocidade incompatível para virar.");
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
}