/*/Crie uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se ela é especial ou não e um limite.
Desenvolva métodos para realizar saque (verificando se o cliente pode realizar saques), depositar dinheiro, consultar saldo e verificar se o cliente está usando cheque especial ou não.
Desenvolva um programa para executar esta classe.
By Antonio Gleyser/*/

public class Account { //inicio da classe Conta
    private int numeroConta;
    private int saldoConta;
    private boolean status;
    private double limite;
    public Account(int numeroConta, int saldoConta, boolean status, double limite) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.status = status;
        this.limite = limite;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setSaldoConta(int saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean isStatus(){
        return status;

    }
    public boolean realizarSaque(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return false;
        }

        if (saldoConta >= valor || (status && saldoConta + limite >= valor)) {
            saldoConta -= valor;
            System.out.println("Saque realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para o saque.");
            return false;
        }
    }

    public void realizarDepósito(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }

        saldoConta += valor;
        System.out.println("Depósito realizado com sucesso.");
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldoConta);
    }

    public void verificarUsoChequeEspecial() {
        if (saldoConta < 0) {
            System.out.println("Você está utilizando o cheque especial.");
        } else {
            System.out.println("Você não está utilizando o cheque especial.");
        }
    }

    public static void main(String[] args) {
        Account conta = new Account(323453, 34500, true, 4000);
        conta.consultarSaldo();
        conta.realizarDepósito(1000);
        conta.consultarSaldo();
        conta.realizarSaque(500);
        conta.consultarSaldo();
        conta.verificarUsoChequeEspecial();
    }
}


