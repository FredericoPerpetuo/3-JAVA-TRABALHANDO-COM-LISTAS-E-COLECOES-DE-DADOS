package br.com.devfred.aula3.desafio3;

import br.com.devfred.aula3.desafio3.entities.Animal;
import br.com.devfred.aula3.desafio3.entities.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro cao = new Cachorro("Canis lupus familiaris", "Rex");

        if(cao instanceof Cachorro){
            Animal caoConvertido = (Animal) cao;
            System.out.println("Casting feito com sucesso");
        }else{
            System.out.println("O casting não pode ser feito");
        }

    }
}
