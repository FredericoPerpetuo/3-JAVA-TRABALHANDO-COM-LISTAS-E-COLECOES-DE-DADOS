package br.com.devfred.aula3.desafio2.entities;

public class Cachorro extends Animal{
    private String nome;

    public Cachorro(String nomeCientifico, String nome) {
        super(nomeCientifico);
        this.nome = nome;
    }
}
