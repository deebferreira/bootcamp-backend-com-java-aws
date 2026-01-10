package bootcamp.dio.java.modulo03_poo.classeseencapsulamento;

public class MaquinaBanhoPet {

    private int agua;
    private int shampoo;
    private boolean temPet;
    private boolean maquinaSuja;

    public MaquinaBanhoPet() {
        agua = 0;
        shampoo = 0;
        temPet = false;
        maquinaSuja = false;
    }

    public void colocarPet() {
        if (temPet) {
            System.out.println("Já existe um pet na máquina.");
        } else if (maquinaSuja) {
            System.out.println("A máquina está suja. É necessário limpar antes.");
        } else {
            temPet = true;
            System.out.println("Pet colocado na máquina.");
        }
    }

    public void retirarPet() {
        if (!temPet) {
            System.out.println("Não há pet na máquina.");
        } else {
            temPet = false;
            maquinaSuja = true;
            System.out.println("Pet retirado da máquina.");
        }
    }

    public void darBanho() {
        if (!temPet) {
            System.out.println("Não há pet na máquina para dar banho.");
        } else if (agua < 10 || shampoo < 2) {
            System.out.println("Água ou shampoo insuficientes para o banho.");
        } else {
            agua -= 10;
            shampoo -= 2;
            temPet = false;
            maquinaSuja = false;
            System.out.println("Banho realizado com sucesso. Pet está limpo.");
        }
    }

    public void limparMaquina() {
        if (!maquinaSuja) {
            System.out.println("A máquina já está limpa.");
        } else if (agua < 3 || shampoo < 1) {
            System.out.println("Água ou shampoo insuficientes para limpeza.");
        } else {
            agua -= 3;
            shampoo -= 1;
            maquinaSuja = false;
            System.out.println("Máquina limpa com sucesso.");
        }
    }

    public void abastecerAgua() {
        if (agua + 2 > 30) {
            System.out.println("Capacidade máxima de água atingida.");
        } else {
            agua += 2;
            System.out.println("Água abastecida. Nível atual: " + agua + " litros");
        }
    }

    public void abastecerShampoo() {
        if (shampoo + 2 > 10) {
            System.out.println("Capacidade máxima de shampoo atingida.");
        } else {
            shampoo += 2;
            System.out.println("Shampoo abastecido. Nível atual: " + shampoo + " litros");
        }
    }

    public void verificarAgua() {
        System.out.println("Nível de água: " + agua + " litros");
    }

    public void verificarShampoo() {
        System.out.println("Nível de shampoo: " + shampoo + " litros");
    }

    public void verificarPet() {
        if (temPet) {
            System.out.println("Há um pet na máquina.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }
}
