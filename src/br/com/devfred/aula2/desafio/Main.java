package br.com.devfred.aula2.desafio;

import br.com.devfred.aula2.desafio.entities.Produto;
import br.com.devfred.aula2.desafio.entities.ProdutoPerecivel;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto("Balde plástico 10 litros", new BigDecimal("14.99"), 20);
        System.out.println(produto);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Barra de chocolate", new BigDecimal("12.99"), 100, LocalDate.parse("2028-06-15"));
        System.out.println(produtoPerecivel);

    }
}
