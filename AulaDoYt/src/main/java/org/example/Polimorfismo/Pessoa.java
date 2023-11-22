package org.example.Polimorfismo;

public class Pessoa {
    private double peso;

    public Pessoa(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }
    public double comer(Comida sorvete) {
         return this.peso += sorvete.getPeso();

    }
}
