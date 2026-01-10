package bootcamp.dio.java.modulo03_poo.classeseencapsulamento;

public class ContaBancaria {

    private double saldo;
    private double limiteChequeEspecial;
    private double valorUsadoChequeEspecial;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;

        if (saldoInicial <= 500) {
            this.limiteChequeEspecial = 50;
        } else {
            this.limiteChequeEspecial = saldoInicial * 0.5;
        }
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public void consultarChequeEspecial() {
        System.out.printf("Limite do cheque especial: R$ %.2f%n", limiteChequeEspecial);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }

        saldo += valor;

        if (valorUsadoChequeEspecial > 0) {
            double taxa = valorUsadoChequeEspecial * 0.2;
            saldo -= taxa;
            valorUsadoChequeEspecial = 0;
            System.out.printf("Taxa de R$ %.2f cobrada pelo uso do cheque especial.%n", taxa);
        }
    }


    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;

            if (saldo < 0) {
                valorUsadoChequeEspecial = Math.abs(saldo);
            }
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void pagarBoleto(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para pagamento.");
            return;
        }

        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;

            if (saldo < 0) {
                valorUsadoChequeEspecial = Math.abs(saldo);
            }
        } else {
            System.out.println("Saldo insuficiente para pagar o boleto.");
        }
    }

    public boolean estaUsandoChequeEspecial() {
        return saldo < 0;
    }
}
