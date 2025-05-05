package com.unincor;

public class ContaBanco {
    String titular;
    double saldo;
    int numeroConta;

    
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else if (valor > 0) {
            this.saldo -= valor;
           
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    
    public void transferir(ContaBancaria destino, double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência.");
        } else if (valor > 0) {
            this.saldo -= valor;
            destino.saldo += valor;
            
        } 
    }

    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Zezé";
        conta1.saldo = 3000.00;
        conta1.numeroConta = 101;

        ContaBancaria conta2 = new ContaBancaria();
        conta2.titular = "Lucas";
        conta2.saldo = 2000.00;
        conta2.numeroConta = 12;

        
        System.out.println("Saldo inicial  " + conta1.titular + ": R$" + conta1.saldo);
        System.out.println("Saldo inicial  " + conta2.titular + ": R$" + conta2.saldo);

        
        conta1.depositar(800.00);
        conta1.sacar(800.00);
        conta1.transferir(conta2, 760.00);

        
        System.out.println("Saldo final  " + conta1.titular + ": R$" + conta1.saldo);
        System.out.println("Saldo final  " + conta2.titular + ": R$" + conta2.saldo);
    }
}