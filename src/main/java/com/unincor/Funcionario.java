package com.unincor;

public class Funcionario {
    String nome;
    int cargaHorariaSemanal;
    double salarioMensal, valorhora, salarioBase;

    public void calcularSalario() {
        
        salarioMensal = salarioBase * 4;

    }

    public void aumentarSalario(double percentual) {
        salarioBase = salarioBase + (salarioBase * (percentual / 100));
    }

    public void alterarCargaHoraria(int novaCarga) {
       
        cargaHorariaSemanal = novaCarga;
        
        calcularSalario();

    }


    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome = "Diogenes";
        f1.alterarCargaHoraria(70);
        f1.valorhora = 20;
        f1.salarioBase = f1.cargaHorariaSemanal * f1.valorhora;
        f1.aumentarSalario(20);
        f1.calcularSalario();
        System.out.println(f1.salarioMensal);
        
        
    }

}
