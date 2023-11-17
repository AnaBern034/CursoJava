package org.example;

public class While {
    public static void main(String[] args) {
        double nota = 0;
        while (nota < 5){
            System.out.printf("I = %.1f\n",nota);
            nota++; //-> enquanto nota for menor que 10, faça o incremento até o 10
        }
        System.out.println("========= PARES ============");
        double pares = 0;
        while (pares < 10){
            System.out.printf("Numero = %.1f\n",pares);
            pares += 2; //-> Fazendo uma atribuição dos numeros pares até 10
        }
        /* O laço for é identico as linhas anteriores do while
        * double paresFor = 0 , consiste na linha 11
        *  paresFor < 10 , consiste na linha 12
        *  paresFor+=2, consiste na linha 14
        * ou seja, o for de uma certa maneira é a versão simplificada do while */
        System.out.println("------------ LAÇO FOR -------------");
        for (double paresFor = 0; paresFor < 10 ; paresFor+=2) {
            System.out.printf("Numero usando o for  = %.1f\n",paresFor);
        }

        //Laço infinito
//        for (;true;) {
//            System.out.println("Infinito");
//        }

    }
}
