package org.example.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(99.65);
        Comida ingrediente1 = new Arroz(0.25);
        Comida ingrediente2 = new Feijão(0.180);

        pessoa.comer(ingrediente1);
        pessoa.comer(ingrediente2);

        System.out.println(pessoa.getPeso());

    }
}
