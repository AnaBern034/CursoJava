package org.example;

public class Switch {

    public static void main(String[] args) {
        System.out.println("============ BREAK ==============");
        int joao = 1;

        switch(joao){
            case 1:
                System.out.println("Fala");
            case 2 :
                System.out.println("Anda");
               // break; // -> quando vc não tem o "break" ele não quebra os blocos por cada caso
            case 3:
                System.out.println("Come");
            default:
                System.out.println("Não sei");
        }


        System.out.println("============= CONTINUE =================");
        for (int i = 0; i < 10; i++) {
            if ( i % 2 ==1){
                continue; // -> ele interrompe a repetição, por exemplo : ele pula todos os numeros impares
            }
            System.out.println(i);
        }
        System.out.println("======== SEM NUMEROS PARES ==========");
        for (int i = 0; i < 20; i++) {
            if(i == 5) continue;
            System.out.println(i);
        }
    }
}
