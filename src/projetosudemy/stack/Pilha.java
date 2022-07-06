package projetosudemy.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> Games = new ArrayDeque<>();
        Games.add("Resident 5");
        Games.add("Naruto Storm 5");
        Games.add("Fifa 20");
        Games.push("Digimon 4");//caso a pilha esteja com seu limite atingido vai retorna uma exception.

        // removendo um termo da pilha
        System.out.println(Games.poll()); // vemos que removo o último termo a entrar.
        /* Tb posso usar o pop para remover e ele retorna uma exception caso não tenha
           elementos para serem removidos.
         */

        // retornando um termo da lista
        System.out.println(Games.peek());//vemos que retorna o primeiro termo da pilha



    }

}

