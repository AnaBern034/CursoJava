package org.example;

import java.util.Locale;

public class DesafioConversão {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt","BR")); // passar para linguagem br

        System.out.println("======== DESAFIO ========");

        System.out.println("Digite um numero");
        String nmbrDigitado = Scan.sc.nextLine().replace(",",".");
        //target o objetivo é trocar a "," pelo "."

        System.out.println("Digite um numero");
        String nmbrDigitado1 = Scan.sc.nextLine().replace(",",".");

        System.out.println("Digite um numero");
        String nmbrDigitado2 = Scan.sc.nextLine().replace(",",".");

        Double n1 = Double.parseDouble(nmbrDigitado);
        Double n2 = Double.parseDouble(nmbrDigitado1);
        Double n3 = Double.parseDouble(nmbrDigitado2);

        Double result = n1 + n2 + n3 / 3;
        System.out.println(result);


    }
}
