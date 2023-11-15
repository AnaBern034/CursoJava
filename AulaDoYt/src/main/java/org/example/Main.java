package org.example;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
     String valor1 = JOptionPane.showInputDialog("Digite um numero"); // é uma interface visual para a entrada do usuário
     String valor2 = JOptionPane.showInputDialog("Digite o segundo numero");

     Double numero1 = Double.parseDouble(valor1);
     Double numero2 = Double.parseDouble(valor2);
     double soma = numero1+numero2;
     System.out.printf("Soma é %.2f ",soma);
    }

}