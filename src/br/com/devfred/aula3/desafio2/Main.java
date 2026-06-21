package br.com.devfred.aula3.desafio2;

import br.com.devfred.aula3.desafio2.entities.Animal;
import br.com.devfred.aula3.desafio2.entities.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro cao = new Cachorro("Canis lupus familiaris", "Rex");
        Animal caoConvertido = (Animal) cao;

    }
}
