package org.example.ColeçõesJava;

import org.example.Scan;

import java.util.Arrays;

public class Matriz {
    public static void main(String[] args) {
        System.out.println("Informe a quantidade de alunos");
        int qntAlunos = Scan.sc.nextInt();

        System.out.println("Informe a quantidade de notas");
        int qntNotas = Scan.sc.nextInt();

        double[][] notas  = new double[qntAlunos][qntNotas];

        for (int a = 0 ; a < notas.length ; a++) {
            /*fazendo um for dentro de outro for -> o primeiro serve para
            pegar a quantidade de alunos, então ele vai percorrer quantos alunos foram digitados e o segundo refere-se
            a quantidade de notas, a cada vez que um aluno ser inserido ele vai repetindo a quantidade de notas que ele tem */
            for (int i = 0; i < notas[a].length; i++) {
                System.out.printf("Digite a nota %d do aluno %d ",i+1,a+1);
                notas[a][i] = Scan.sc.nextDouble();
            }
        }
        for ( double[] nota : notas) {
            System.out.println(Arrays.toString(nota));
        }
    }
}
