package br.com.devfred.aula3.desafio5;

import br.com.devfred.aula3.desafio5.entities.Circulo;
import br.com.devfred.aula3.desafio5.entities.Forma;
import br.com.devfred.aula3.desafio5.entities.Quadrado;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Forma> listaFormas = new ArrayList<>();

        Circulo circulo1 = new Circulo(5.0);
        Circulo circulo2 = new Circulo(6.0);
        Quadrado quadrado1 = new Quadrado(7.0);
        Quadrado quadrado2 = new Quadrado(8.0);

        listaFormas.add(circulo1);
        listaFormas.add(quadrado1);
        listaFormas.add(circulo2);
        listaFormas.add(quadrado2);

        for(Forma forma : listaFormas){
            if(forma instanceof Circulo){
                System.out.println(String.format("figura: %s - raio: %.2f - área: %.2f",
                        forma.getClass().getSimpleName(), ((Circulo) forma).getRaio(), forma.calculaArea()));
            }
            if(forma instanceof Quadrado){
                System.out.println(String.format("figura: %s - lado: %.2f - área: %.2f",
                        forma.getClass().getSimpleName(), ((Quadrado) forma).getLado(), forma.calculaArea()));
            }
        }

    }
}
