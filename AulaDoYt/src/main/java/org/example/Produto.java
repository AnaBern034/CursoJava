package org.example;

import java.util.Objects;

public class Produto {
    private Long id;
    private String descrição;
    private double preço;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public Produto(Long id, String descrição, double preço) {
        super();
        this.id = id;
        this.descrição = descrição;
        this.preço = preço;
    }
    public Produto(){
        super();
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descrição='" + descrição + '\'' +
                ", preço=" + preço +
                '}';

    }
    // observnado de os objetos são iguais quando é a mesma classe e o mesmo conteudo
    @Override
    public boolean equals(Object o){  // faz comparação com os objetos para saber se os objetos são iguais
        if (o == this){
            return true; // se apotam para a mesma referencia é igual a o mesmo objto
        }
        if (o.getClass() != o.getClass()){
            return  false; // se as classes são diferentes, então não compare
        }
       // se s objetos forem da mesma classe confere os conteudos
        Produto p = (Produto) o; // faz o casting para conferir o conteudo dos objetos
        return (p.id == this.id && p.descrição.equals(this.descrição) && p.preço == this.preço );
    }
    @Override
    public int hashCode(){
        // dar um numero que representa informações armazenadas
        return Objects.hash(id,descrição,preço);
    }



}
