package br.com.devfred.aula1.desafio.entities;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "nome: " + nome + " - idade: " + idade;
    }
}
