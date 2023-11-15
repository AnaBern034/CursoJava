package org.example;

public class DesafioAritmetico {
    public static void main(String[] args) {

        Integer result1 = (int) Math.pow(6 * (3+2),2);
        Integer result2 = 3*2;
        Integer divisão = result1/result2;

        System.out.printf("Primeiro resultado : %d ",divisão);

        Integer result3 = (int) Math.pow( (double) (1 - 5) * (2 - 7) / 2,2);
        System.out.printf("\nSegundo resultado %d ",result3);

        System.out.printf("\nTerceiro resultado %d", divisão - result3);

        Integer resultadoQuase= (int) Math.pow(divisão-result3,3);
        Integer resultadoDeBaixo = (int) Math.pow(10,3); // fazendo a conversão para int

        Integer resultadoFinal = resultadoQuase / resultadoDeBaixo;
          System.out.printf("\nResultado final %d",resultadoFinal);

    }
}
