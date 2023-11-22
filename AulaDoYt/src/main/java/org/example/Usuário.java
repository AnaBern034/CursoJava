package org.example;

import java.util.Comparator;
import java.util.Objects;

public class Usuário  implements Comparable<Usuário> {

    public String nome;

    public Usuário(String nome) {
        this.nome = nome;
    }

    /* estão comparando para saber se o objeto corresponde ao mesmo endereço de memória, caso não seja
        ele vai retornar como false*/
    public boolean equals(Object objeto) {
      if (objeto instanceof Usuário){ // instanceof é para saber se essa instancia é de tal classe f
          Usuário usuário = (Usuário) objeto; // -> fazendo o cast da classe Usuário para o tipo Object
          return usuário.equals(objeto);
      }
        return false;
    }

    @Override
    public int compareTo(Usuário o) { //-> u can only use the methods of comparable if this BaseClass implements the comparable
        return 0;
    }

//    List<User> users = Lists.newArrayList(
//            new User(33L, "A"),
//            new User(25L, "B"),
//            new User(28L, ""));
//      Collections.sort(users);
//     System.out.print(users);
//     [B:25, C:28, A:33]

//    public int hashCode() {
//        return Objects.hash(nome, email);
//    }
}
