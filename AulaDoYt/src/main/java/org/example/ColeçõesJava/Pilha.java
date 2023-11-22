package org.example.ColeçõesJava;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        livros.add("SeiLá");
        livros.push("SeiLá2");

        System.out.println(livros.peek());
        livros.pop(); // quando não tem elementos para remover ele lança uma exception
    }
}
