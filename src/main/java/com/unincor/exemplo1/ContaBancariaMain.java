package com.unincor.exemplo1;

import java.time.LocalDate;

public class ContaBancariaMain {


    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Lucas", "123456789",
        LocalDate.of(2001, 07, 9));

        ContaBancaria c1 = new ContaBancaria(p1,200.);
        
        c1.exibirInfo();

        c1.depositar(5000.);

        c1.exibirInfo();

        c1.sacar(2000.);

        c1.exibirInfo();

        
    }

}
