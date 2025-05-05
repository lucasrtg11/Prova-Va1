package com.unincor.exemplo1;

public class ContaBancaria {
    private Pessoa titular;
    private Double saldo = 0.;
    private Double limite;
    private Boolean ativo = true;

    public ContaBancaria() {

    }

    public ContaBancaria(Pessoa titular, Double limite){
        this.titular = titular;
        this.limite = limite;
    }

    public Pessoa getTitular(){
        return titular;
    }

    public Double getLimite(){
        return limite;
    }
    public void setLimite(Double limite){
        this.limite = limite;
    }
    public Boolean getAtivo(){
        return ativo;
    }
    public void setAtivo(Boolean ativo){
        this.ativo = ativo;
    }
    public Double getSaldo(){
        return saldo;
    }

    public void depositar(Double valor){
        saldo += valor;
    }

    public void sacar(Double valor) {
        if(valor <= saldo) {
            saldo -= valor;
        }
    }

    public void exibirInfo(){
        System.out.println("Titular: " + getTitular().getnome());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Limite: " + getLimite());
        System.out.println("Ativo: " + getAtivo());
    }

}
