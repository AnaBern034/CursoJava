package org.example.Desafio;

import org.example.Produto;
import java.util.*;
import java.util.stream.Collectors;

public class StreamAndListFromProduct {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();
        lista.add(new Produto(1L,"Compiuter", 1000));
        lista.add(new Produto(2L,"TV", 2000));
        lista.add(new Produto(1L,"Compiuter", 1000));
        lista.add(new Produto(2L,"TV", 2000));
        System.out.println(lista);

        Set<Produto> conjunto = new HashSet<>();
        conjunto.add(new Produto(1L,"Compiuter", 1000));
        conjunto.add(new Produto(3L,"Mouse", 1000));
        conjunto.add(new Produto(2L,"Compiuter", 1000));
        conjunto.add(new Produto(3L,"Mouse", 1000));
        System.out.println(conjunto);

        Produto p1 = new Produto(1L,"mouse",10.0);
        Produto p2 =  new Produto(1L,"mouse",10.0);
        System.out.println(p1.equals(p2));

        System.out.println("\n======= PERCORRER A LISTA SEM USAR STREAM  ======");
        for (Produto p: lista) {  // o tipo da lista e o objeto lista que foi criada do tipo produto
            System.out.println(p);
        }
        System.out.println("=====  USANDO STREAM  ======");
        //STREAM

        lista.stream().forEach((p) -> {System.out.println(p);});
    //    ´para cada p -> (lista) de produtos, coloque o sout "p" para mostrar a lista de produtos

        System.out.println("\nAplicando porcentagem com cada produto da lista usando stream");
        // aplicando porcentagem de preços
        lista.stream().forEach(produto -> {produto.setPreço(produto.getPreço() * 1.20);System.out.println(produto);});

        System.out.println("\n===== ORDENAR POR PREÇO ======");
        lista.stream().sorted(Comparator.comparing(produto -> produto.getPreço()))// comparar o preço de forma ordenada
                .forEach(produto -> {System.out.println(produto); // mostrar no console a lista de produtos com preços de forma ordenada
                });                                              // de forma ordenada
        // essa lista é uma cópia das listas de produtos, agora para criar de forma ordenada :

        System.out.println(" ======= LISTA CRIADA E ORDENADA POR PREÇO ======= ");
        List<Produto> novaList = lista.stream().sorted(Comparator.comparing(produto -> produto.getPreço())).collect(Collectors.toList());
        // ordene o preço dos produtos pegue o conteudo e torne uma lista
        System.out.println(novaList);

        Optional<Produto> maisCaro = lista.stream().max(Comparator.comparing(produto ->  produto.getPreço()));
        System.out.println(maisCaro);
    }
}