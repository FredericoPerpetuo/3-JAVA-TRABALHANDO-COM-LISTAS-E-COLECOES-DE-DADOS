package br.com.devfred.secao1.desafio;

import br.com.devfred.secao1.desafio.entities.Pessoa;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] nomes = {
                "João Silva Santos",
                "Maria Oliveira Souza",
                "Pedro Pereira Costa",
                "Ana Rodrigues Almeida",
                "Lucas Ferreira Gomes",
                "Juliana Martins Ribeiro",
                "Gabriel Carvalho Lima",
                "Fernanda Araújo Rocha",
                "Rafael Barbosa Alves",
                "Camila Cardoso Fernandes"
        };
        int[] idades = {20, 25, 18, 30, 45, 28, 37, 33, 50, 22};

        ArrayList<Pessoa> listaPessoas =  new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Pessoa pessoa = new Pessoa(nomes[i], idades[i]);
            listaPessoas.add(pessoa);
        }

        System.out.println(String.format("A lista de pessoas tem %d elementos", listaPessoas.size()));
        System.out.println(String.format("A primeira pessoa da lista é %s", listaPessoas.get(0)));

        for (int i = 0; i < listaPessoas.size() ; i++) {
            System.out.println(String.format("Índice %d - %s", i, listaPessoas.get(i).toString()));
        }

    }
}
