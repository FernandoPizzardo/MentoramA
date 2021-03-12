package com.company;

public class ContaPoupanca extends Conta {
    private int diaRendimento;
    private double taxaDeJuros;

    public ContaPoupanca(int numeroDaConta, int agencia, String banco, double saldo, int diaRendimento, double taxaDeJuros) {
        super(numeroDaConta, agencia, banco, saldo);
        this.diaRendimento = diaRendimento;
        this.taxaDeJuros = taxaDeJuros;
    }


    @Override
    public double getSaldo() {
        return this.saldo + this.taxaDeJuros*this.saldo;
    }

    @Override
    public double getSaque() throws Exception{
        if(this.diaRendimento != 18){
            System.out.println("Não Faça saques fora de seu dia do rendimento!!");
            throw new Exception("FORA DO DIA DE RENDIMENTO");
        }
        return getSaldo() - this.saque;
    }

    @Override
    public double getDeposito() {
        return getSaldo() + this.deposito;
    }
}
