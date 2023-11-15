package org.example;

public class Ternario {
    public static void main(String[] args) {
        double nota = 4.8;

        String media = nota >= 5.0 ? "approval" : "preapproval";
        /* ? é o operador ternario e com ele é acompanhado por dois simbolos ,
        um deles é comparando a resposta anterior (?) e o outro operador é os (:) que simboliza
        for não um resultado é outro, como se fosse um else-if
        */
        System.out.println(media);
    }
}
