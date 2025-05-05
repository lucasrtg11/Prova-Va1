package com.unincor.exemplo1;

import java.time.LocalDate;

public class PessoaMain {





    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setId(1);
        pessoa1.setnome("Lucas");
        pessoa1.setcpf("123456789");
        pessoa1.setdataNascimento(LocalDate.of(2001, 07, 9));

        System.out.println("Nome: " + pessoa1.getnome());
        
    }

}
