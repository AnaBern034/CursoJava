package org.example;

public class Main {

    public static void main(String[] args) {
      var b = 3.5;  // esse valor o java vai inferir qual o tipo da variavel
        // as variaveis em java são em um determinado em tipo e elas são imutaveis
        // os tipos var em java, não consegue ser mutaveis então após a criação da var sem ser inicialiazada, ele dá problema
        System.out.println("Valor da variavel {var} "+b);

       /*
       ------------------------ ------------------------------- --------------------------------   -------------------
         TIPOS PRIMITIVOS -> QUANTIDADE DE BYTES

        Caso queira fazer o cast de tipos, o byte precisa ser maior que outro tipo para serem convertido, caso contrario o sistema dá erro

          BYTE > 1byte
         SHORT > 2byte
         INT > 4byte
         LONG > 8byte
         FLOAT > 4byte
         DOUBLE > 8byte
       ------------------------ ------------------------------- --------------------------------   -------------------
        */

        String h = "hello world";
        String upperCase = h.toUpperCase(); // -> essa função converte o valor para maiuscula
        System.out.println(upperCase);

         String s = "Bom dia, como você chama?";
         s = s.replace("Bom dia, como você chama?","Bom dia S"); // -> a função replace muda/substitui o valor da string
        System.out.println(s);
         s = s.concat("enhora"); // -> essa função serve para concetar o valor de uma string
        System.out.println(s);

        //Tipos primitivos não tem o operador "."
        String testandoString = "Ola ana";
        System.out.println(testandoString.startsWith("Ola")); // -> esse método é para mostrar se o valor que começa é verdadeiro ou falso
        System.out.println(testandoString.length()); // -> retorna o valor da quantidade de caracteres
        System.out.printf("Frase: %s",testandoString); // esse método não precisa de concatenar apenas colocar o "dolla S" mas funciona só para printf



    }


}