package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        List<Produto> p = new ArrayList<>();
//        p.add(new Produto(1L,"Compiuter", 1000));
//        p.add(new Produto(2L,"TV", 2000));
//        p.add(new Produto(1L,"Compiuter", 1000));
//        p.add(new Produto(2L,"TV", 2000));
//        System.out.println(p);

//        Set<Produto> conjunto = new HashSet<>();
//        conjunto.add(new Produto(1L,"Compiuter", 1000));
//        conjunto.add(new Produto(2L,"Compiuter", 1000));
//        System.out.println(conjunto);

        Produto p1 = new Produto(1L,"mouse",10.0);
        Produto p2 =  new Produto(1L,"mouse",10.0);
        System.out.println();
        p1.equals(p2);

    }
}