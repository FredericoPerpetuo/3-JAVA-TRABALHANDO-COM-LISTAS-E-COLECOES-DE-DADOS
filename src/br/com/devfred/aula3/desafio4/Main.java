package br.com.devfred.aula3.desafio4;

import br.com.devfred.aula3.desafio4.entities.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto p1 = new Produto("Mouse Gamer RGB", new BigDecimal("149.90"));
        Produto p2 = new Produto("Teclado Mecânico Compacto", new BigDecimal("159.90"));
        Produto p3 = new Produto("Headset USB Stereo", new BigDecimal("154.90"));

        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);

        BigDecimal soma =  new BigDecimal("0.0");
        BigDecimal size = new BigDecimal(listaProdutos.size());


        for(Produto prod : listaProdutos){
            soma = soma.add(prod.getPreco());
        }
        System.out.println(String.format("Média de preços = R$%.2f", soma.divide(size)));
    }
}
