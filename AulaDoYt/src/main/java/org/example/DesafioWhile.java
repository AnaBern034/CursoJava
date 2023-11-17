package org.example;

public class DesafioWhile {
    public static void main(String[] args) {
        int i = 0;
        int nota;
        int total = 0;


        System.out.println("Digite a quantidade de alunos");
        int alunos = Scan.sc.nextInt();

        while ( i < alunos){
            System.out.printf("\nDigite a nota do aluno %d :",i++);
            nota = Scan.sc.nextInt();
            total += nota;
        }
        System.out.printf("\nO resultado é %d",total);

    }
}
