package br.com.devfred.aula3.desafio5.entities;

public class Quadrado implements Forma{
    private double lado;


    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }
}
