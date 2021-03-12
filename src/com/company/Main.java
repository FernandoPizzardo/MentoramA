package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        boolean appBanco = true;


        ContaCorrente cc1 = new ContaCorrente(4, 2, "Banco Rei", 100.00, 1000.00);
        System.out.println(cc1);
        System.out.println("O saldo da conta é " + cc1.getSaldo());
        ContaPoupanca cp1 = new ContaPoupanca(5,3,"Banco Princesa",100.00,18, 0.05);
        System.out.println("O salado da conta poupança é " + cp1.getSaldo());
        ContaSalario cs1 = new ContaSalario(1,2,"Banco Príncipe", 1500.00,"Kotlin Ltda.");
        System.out.println("O saldo da conta salário é " + cs1.getSaldo());
        while (appBanco) {
            // Aqui deixei a Conta corrente como default, mas funciona se alterar o código para todas as classes;
        System.out.println("Escolhido: Conta Corrente \n Você quer sacar ou depositar: \n 0 - Sacar, 1 - Depositar, 2 - Sair");
        Scanner opcoesBanco = new Scanner(System.in);
        int menu = opcoesBanco.nextInt();
        //Preferi deixar no sistema Brasileiro, mas deixei um disclaimer para não usar pontos
            switch (menu) {
                case 0:
                    System.out.println("Insira o valor do saque usando vírgulas");
                    cc1.setSaque(opcoesBanco.nextDouble());
                    System.out.println("O saldo atual é R$" + cc1.getSaque());
                    break;
                case 1:
                    System.out.println("Insira o valor do depósito usando vírgulas");
                    cc1.setDeposito(opcoesBanco.nextDouble());
                    System.out.println("O saldo atual é R$" + cc1.getDeposito());
                    break;
                case 2:
                    System.out.println("Volte sempre, majestade, \n Aqui somos sempre seus súditos, Grupo Banco Rei");
                    appBanco = false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + menu);
            }
        }
    }
}
