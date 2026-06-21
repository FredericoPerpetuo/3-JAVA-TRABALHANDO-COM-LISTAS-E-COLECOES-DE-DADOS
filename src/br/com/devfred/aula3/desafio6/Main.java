package br.com.devfred.aula3.desafio6;

import br.com.devfred.aula3.desafio6.entities.ContaBancaria;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria(111, new BigDecimal("1000.50"));
        ContaBancaria contaBancaria2 = new ContaBancaria(222, new BigDecimal("700.50"));
        ContaBancaria contaBancaria3 = new ContaBancaria(333, new BigDecimal("650.99"));
        ContaBancaria contaBancaria4 = new ContaBancaria(444, new BigDecimal("2000.00"));
        ContaBancaria contaBancaria5 = new ContaBancaria(555, new BigDecimal("475.00"));

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();

        listaContas.add(contaBancaria1);
        listaContas.add(contaBancaria2);
        listaContas.add(contaBancaria3);
        listaContas.add(contaBancaria4);
        listaContas.add(contaBancaria5);

        BigDecimal maior = new BigDecimal("0");
        ContaBancaria contaComMaiorSaldo = null;

        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo().compareTo(maior) == 1) {
                maior = conta.getSaldo();
                contaComMaiorSaldo = conta;
            }
        }

        System.out.println(contaComMaiorSaldo);

    }
}
