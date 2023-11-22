package org.example.ColeçõesJava;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Ana"); // retorna uma excessão quando excede o limite de elementos da lista
        fila.offer("Lara"); // ele resulta em true or false

        System.out.println(fila.peek());// -> lança o null
        System.out.println(fila.element());// -> lança uma excesão

        fila.clear(); // limpar
        fila.isEmpty();// saber se a fila esta vazia
        fila.poll(); // remove um lemento e retorna falso
        fila.remove(); // lança um elemento


    }
}
