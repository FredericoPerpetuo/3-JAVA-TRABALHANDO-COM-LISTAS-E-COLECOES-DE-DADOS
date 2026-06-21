package br.com.devfred.aula3.desafio4.entities;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private BigDecimal preco;

    public Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public BigDecimal getPreco() {
        return preco;
    }
}
