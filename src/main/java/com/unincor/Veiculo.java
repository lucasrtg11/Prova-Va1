package com.unincor;

public class Veiculo {
    String marca;
    String modelo;
    int ano;
    double capacidadeTanque;
    double nivelCombustivel;

    public void dirigir(int km) {
        nivelCombustivel = nivelCombustivel - (km / 10);
    }

    public void abastecer(int litros) {
        if (capacidadeTanque > nivelCombustivel) {

            nivelCombustivel += litros;

        } else {
            System.out.println("Nivel de combustivel maximo");
        }

    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + "\n Modelo: " + modelo + "\n Ano: " + ano + "\n Capacidade: " + capacidadeTanque + "\n Nivel: " + nivelCombustivel);
    }

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo();
        v1.marca = "Chevrolet";
        v1.modelo = "S10";
        v1.ano = 2015;
        v1.capacidadeTanque = 20;
        v1.nivelCombustivel = 30;
        v1.dirigir(50);
        v1.abastecer(5);
        v1.exibirInformacoes();
    }
}