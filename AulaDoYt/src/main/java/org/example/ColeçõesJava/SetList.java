package org.example.ColeçõesJava;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetList {

    public static void main(String[] args) {
        HashSet conjunto = new HashSet ();

        conjunto.add(19);
        conjunto.add("Ana");
        conjunto.add(1);
        conjunto.add(true);

        System.out.println("O tamanho é"+conjunto.size()); // para identificar o tamanho da linha, quantos elementos possui
        System.out.println(conjunto.remove(1)); // true foi removido
        System.out.println(conjunto.remove(1)); // false, não existe na lista
        System.out.println(conjunto.contains("Ana"));

        HashSet num = new HashSet();
        num.add(1);
        num.add(2);
        num.add(19);

        System.out.println("==== Lista ====");

        System.out.println(num);
        System.out.println(conjunto);

        conjunto.retainAll(num);//exibe a os dados iguais que contem na lista e retira os que são diferentes
        System.out.println(conjunto);

        System.out.println("========= Limpar a lista =======");
        conjunto.clear();
        System.out.println(conjunto);

        System.out.println("======= LISTA SET ======");
        Set<String> list = new HashSet<String>(); // -> <String> significa que a lista é sobre esse tipo que com define
        //no escopo, então tudo que estiver dentro da lista será do tipo string

        list.add("Ana");
        list.add("Ana Julia");
        list.add("Ana Luiza");
        list.add("Ana Maria");

        for (String lista : list) {
            System.out.println(lista);
        }

        System.out.println("======= LISTA USANDO SORTEDSET ======");

        SortedSet<String> listSorted = new TreeSet<>();
        listSorted.add("Ana");
        listSorted.add("Ana Julia");
        listSorted.add("Ana Luiza");
        listSorted.add("Ana Maria");

        for (String listaS : listSorted) {
            System.out.println(listaS);
        }

    }
}
