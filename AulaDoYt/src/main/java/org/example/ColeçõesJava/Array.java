package org.example.ColeçõesJava;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] notasAlunoA = new int[3];
        notasAlunoA[0] = 5;
        notasAlunoA[1] = 4;
        notasAlunoA[2] = 3;


        System.out.println(Arrays.toString(notasAlunoA)); /*-> Dentro da biblioteca do Array, tem formas de exibir os dados
        sem precisar do laço {for} */

        System.out.println("===== LAÇO FOR ===========");
        for (int i = 0; i < notasAlunoA.length ; i++) {
            System.out.println(notasAlunoA[i]); // -> {notasAlunoA[i]} essa saída de dados referencia todos os dados de dentro do array
        }
        System.out.println("======= FOREACH =======");
        for (int nota: notasAlunoA) { // criar uma variavel do tipo do array e associar a lista a variavel, cada vez que ele repetir
            //vai referenciar a lista anterior com a variavel da que foi criada
            System.out.println(nota+"");
        }


    }
}
