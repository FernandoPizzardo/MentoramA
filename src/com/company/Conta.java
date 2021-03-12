package com.company;

public abstract class Conta {
    private int numeroDaConta;
    private int agencia;
    private String banco;
    protected double saldo;
    protected double saque;
    protected double deposito;


    public Conta(int numeroDaConta, int agencia, String banco, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }



    @Override
    public String toString() {
        return "Conta{" +
                "numeroDaConta=" + numeroDaConta +
                ", agencia=" + agencia +
                ", banco='" + banco + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public abstract double getSaldo();

    public abstract double getSaque() throws Exception;

    public abstract double getDeposito() throws Exception;

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
    public void setSaque(double saque) {
        this.saque = saque;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
