package br.com.devfred.topicosDeAprendizado.iterandoArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class EvolucaoDoFor {
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

        //Evolução de formas para percorrer ArrayList em JAVA
        System.out.println("FORI");
        for (int i = 0; i < devsFamosos.size(); i++) {
            System.out.println(devsFamosos.get(i));
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("FOREACH LAÇO");
        for(String dev : devsFamosos){
            System.out.println(dev);
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("FOREACH MÉTODO");
        devsFamosos.forEach(dev ->{
            System.out.println(dev);
        });

        System.out.println("------------------------------------------------------------");
        System.out.println("FOREACH Method Reference");
        devsFamosos.forEach(System.out::println);
    }
}
