package br.com.devfred.aula3.desafio5.entities;

public class Circulo implements Forma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
