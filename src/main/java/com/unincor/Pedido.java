package com.unincor;

import java.util.ArrayList;
import java.util.List;


class Pedido {
    String cliente;
    List<Produto> listaProdutos;

    public Pedido(String cliente) {
        this.cliente = cliente;
        this.listaProdutos = new ArrayList<>();
    }


    public void adicionarProduto(String nome, double preco) {
        Produto novoProduto = new Produto(nome, preco);
        listaProdutos.add(novoProduto);
        
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : listaProdutos) {
            total += p.preco;
        }
        return total;
    }

    public void exibirPedido() {
        System.out.println("Pedido do cliente: " + cliente);
        for (Produto p : listaProdutos) {
            System.out.println(p);
        }
        System.out.println("Total do pedido: R$" + calcularTotal());
    }




    public static void main(String[] args) {
        Pedido pedido = new Pedido("Lucas");

        pedido.adicionarProduto("Skate", 2500.00);
        pedido.adicionarProduto("Fone", 200.00);
        pedido.adicionarProduto("Tenis", 100.00);
        pedido.adicionarProduto("Moletom", 100.00);

        pedido.exibirPedido();
    }
}