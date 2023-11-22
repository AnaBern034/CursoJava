package org.example.Desafio;

import org.example.Scan;
public class DesafioArray {
    public static void main(String[] args) {

        System.out.println("Digite a quantidade de alunos");
        int input = Scan.sc.nextInt() ;

        int notas[] = new int[input];// -> {int[i]} essa parte mostra qual o tamanho do array

        for ( int i = 0; i < input; i++) {
            System.out.printf("Digite a nota %d ",i+1);
            int notaAdd = Scan.sc.nextInt();
            notas[i] = notaAdd;// adicionar notas no array
        }


        System.out.println("\nNOTAS DOS ALUNOS");
        for (int notass: notas) {
            System.out.println("aluno "+notass); // exibir notas do array
        }


        System.out.println("===== MÉDIA =====");
        int total = 0;
        for (int i = 0; i < notas.length ; i++) {
            total += notas[i] / notas.length; // {notas[i]} somar por cada indice de dentro do array
        }
        System.out.printf("A média é %d ",total);


    }
}
