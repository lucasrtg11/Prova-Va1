package com.unincor;

public class ContaBancaria {
    String titular;
    double saldo;
    public int numeroConta;
    
    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor){
        if (valor<=saldo) {
            saldo -= valor;
            
        }
        else{
            System.out.println("Valor indisponivel");
        }
    }
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.titular = "Elton";
        c1.saldo = 5000;
        c1.depositar(2000);
        c1.sacar(500);
        System.out.println("Saldo: "+c1.saldo);
        
    }
    public void transferir(ContaBancaria conta2, double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transferir'");
    }
    }
