package com.company;

public class ContaCorrente extends Conta{
    private double lis;

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "lis=" + lis +
                '}';
    }

    @Override
    public double getSaldo() {
        return this.lis + this.saldo;
    }

    @Override
    public double getSaque() throws Exception {
        if(getSaldo() < this.saque){
            System.out.println("SEM SALDO");
            throw new Exception("Saldo insuficiente para sacar");
        }
            return getSaldo() - this.saque;
    }

    @Override
    public double getDeposito() {
        return getSaldo() + this.deposito;
    }

    public ContaCorrente(int numeroDaConta, int agencia, String banco, double saldo, double lis) {
        super(numeroDaConta, agencia, banco, saldo);
        this.lis = lis;
    }
}
