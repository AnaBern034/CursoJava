package org.example;

public class Desafio {
    int a = 3;
// só é possivel acessar um mebro de uma classe dentro de um método static a patir de uma instancia da própia classe
    public static void main(String[] args) {

        // pode mexer
        Desafio desafio = new Desafio();
        System.out.println(desafio.a);    // pode mexer
        // pode mexer

    }

}
