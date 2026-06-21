package br.com.devfred.aula3.desafio6.entities;

import java.math.BigDecimal;

public class ContaBancaria {
    private int numero;
    private BigDecimal saldo;

    public ContaBancaria(int numero, BigDecimal saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return """
                Conta: %d
                Saldo: R$%.2f
                """.formatted(numero, saldo);
    }
}
