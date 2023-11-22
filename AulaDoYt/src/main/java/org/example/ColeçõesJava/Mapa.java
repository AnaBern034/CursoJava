package org.example.ColeçõesJava;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Long,String> usuarios = new HashMap<>();

        usuarios.put(1L,"Ana");
        usuarios.put(2L,"AnaL");
        usuarios.put(3L,"AnaJ");
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());


        for (Long chave : usuarios.keySet()){
            System.out.println(chave);
        }

        for (Map.Entry<Long, String> u: usuarios.entrySet()){
            System.out.println(u.getKey());
            System.out.println(u.getValue());
        }
    }
}
