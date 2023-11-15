package org.example;

public class Ternario {
    public static void main(String[] args) {
        Double nota = 4.8;

        String média = nota >= 5.0 ? "aprovado" : "reprovado";
        /* ? é o operador ternario e com ele é acompanhado por dois simbolos ,
        um deles é comparando a resposta anterior (?) e o outro operador é os (:) que simboliza
        for não um resultado é outro, como se fosse um else-if
        */
        System.out.println(média);
    }
}
