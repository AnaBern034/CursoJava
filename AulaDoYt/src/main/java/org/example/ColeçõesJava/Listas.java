package org.example.ColeçõesJava;

import org.example.Usuário;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<Usuário> nomes = new ArrayList<>();

        nomes.add(new Usuário("Ana"));
        nomes.add(new Usuário("Julia"));
        nomes.add(new Usuário("Gabriela"));

    //    nomes.stream().forEach(p -> System.out.println(p.nome)); -> usando stream

        System.out.println("Nome : "+nomes.get(2).nome);

        for (Usuário user : nomes) {
            System.out.println(user.nome);
        }

        nomes.remove(new Usuário("Julia"));
        nomes.contains(new Usuário("Julia"));
    }

}
