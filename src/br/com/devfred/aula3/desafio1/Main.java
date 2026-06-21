package br.com.devfred.aula3.desafio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> devsFamosos = new ArrayList<>();
        devsFamosos.add("Ada Lovelace");
        devsFamosos.add("Grace Hopper");
        devsFamosos.add("Margaret Hamilton");
        devsFamosos.add("Radia Perlman");
        devsFamosos.add("Barbara Liskov");
        devsFamosos.add("Linus Torvalds");
        devsFamosos.add("Alan Turing");
        devsFamosos.add("Steve Wozniak");

        for(String nomeDev : devsFamosos){
            System.out.println(nomeDev);
        }
    }
}
