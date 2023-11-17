package org.example;

import java.util.Arrays;

public class DesafioArray {
    public static void main(String[] args) {

        System.out.println("Digite a quantidade de alunos");
        int input = Scan.sc.nextInt() ;

        int notas[] = new int[input];    // -> {int[i]} essa parte mostra qual o tamanho do array

        for ( int i = 0; i < input; i++) {
            System.out.printf("Digite a nota %d ",i);
            int notaAdd = Scan.sc.nextInt();
            notas[i] = notaAdd;

        }
        System.out.println("\nNOTAS DOS ALUNOS");
        for (int notass: notas) {
            System.out.println("aluno "+notass);
        }
        System.out.println("===== MÉDIA =====");
        for (int i = 0; i < notas.length ; i++) {
            int total = 0;
            total += notas[i];
            System.out.println(total);
        }



    }
}
