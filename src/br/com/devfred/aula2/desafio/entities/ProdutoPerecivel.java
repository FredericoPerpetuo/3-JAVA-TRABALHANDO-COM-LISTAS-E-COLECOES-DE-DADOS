package br.com.devfred.aula2.desafio.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
    private LocalDate dtValidade;


    public ProdutoPerecivel(String nome, BigDecimal preco, int quantidade, LocalDate dtValidade) {
        super(nome, preco, quantidade);
        this.dtValidade = dtValidade;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel{" +
                "nome = '" + getNome() + '\'' +
                ", preco = " + getPreco() +
                ", quantidade = " + getQuantidade() +
                ", dtValidade = " + dtValidade +
                '}';
    }
}
