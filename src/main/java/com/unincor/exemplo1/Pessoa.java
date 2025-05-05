package com.unincor.exemplo1;

import java.time.LocalDate;

public class Pessoa {

    private Integer id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    public Pessoa(){

    }
    public Pessoa(Integer id, String nome , String cpf, LocalDate dataNascimento ){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;

    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getnome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public String getcpf() {
        return cpf;
    }
    public void setcpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getdataNascimento() {
        return dataNascimento;
    }
    public void setdataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
