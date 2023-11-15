package org.example;

public class DesafioAritmetico {
    public static void main(String[] args) {
        Integer nm2 = 6 * (3+2) ;

        Integer result1 = (int) Math.pow(nm2,2);
        Integer result2 = 3*2;
        Integer divisão = result1/result2;

        System.out.printf("Primeiro resultado : %d ",divisão);


        Integer nm3 =(1-5) * (2-7);
        Integer nm4 = nm3/2;
        Integer result3 = (int) Math.pow(nm4,2);

        System.out.printf("\nSegundo resultado %d ",result3);

        Integer resultadoQuase = divisão - result3;
        System.out.printf("\nTerceiro resultado %d",resultadoQuase);

        resultadoQuase = (int) Math.pow(resultadoQuase,3);
        Integer resultadoDeBaixo = (int) Math.pow(10,3); // fazendo a conversão para int

        Integer resultadoFinal = resultadoQuase / resultadoDeBaixo;
       System.out.printf("\nResultado final %d",resultadoFinal);



    }
}
