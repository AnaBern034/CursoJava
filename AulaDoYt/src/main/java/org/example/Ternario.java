package org.example;

public class Ternario {
    public static void main(String[] args) {
        double nota = 4.8;

        String media = nota >= 5.0 ? "approval" : "preapproval";
        /* (?) é o operador ternario, e com ele é acompanhado por dois simbolos ,
        um deles é comparando a resposta anterior (?) e o outro operador é os (:) que simboliza se
         não for um resultado é outro, como se fosse um else-if
        */
      //  System.out.println(media);

        System.out.println("====== DESAFIO ======");

        System.out.println("Digite o primeiro valor");
        double valor1 = Scan.sc.nextDouble();

        System.out.println("Digite o segundo valor");
        double valor2 = Scan.sc.nextDouble();

        System.out.println("Digite o operador lógico"+
                "\n {+}"+
                "\n {-}"+
                "\n {*}"+
                "\n {/}");
        String operador = Scan.sc.next();

        double resultado = operador.equals("+") ? valor1+valor2 : 0;
         resultado = operador.equals("-") ? valor1-valor2 : resultado;
         resultado = operador.equals("*") ? valor1*valor2 : resultado;
         resultado = operador.equals("/") ? valor1/valor2 : resultado;

        System.out.printf("O resultado é %.2f %s %.2f = %.2f ",valor1, operador, valor2, resultado);



    }
}
