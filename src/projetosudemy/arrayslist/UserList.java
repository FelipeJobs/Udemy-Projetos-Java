package projetosudemy.arrayslist;


import java.util.ArrayList;
import java.util.List;

public class UserList {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Paulo");
        // adicionando novos usuários na lista.
        lista.add(u1);
        lista.add(new Usuario("Tatiane"));
        lista.add(new Usuario("Roberta"));
        lista.add(new Usuario("Ricardo"));
        lista.add(new Usuario("Mariane"));
        lista.add(new Usuario("Tiago"));

        // imprimindo a lista.
        for (Usuario nomes:lista) {
            System.out.println(nomes.nome);
        }

        // imprimindo pelo id da lista, neste caso o index.
        System.out.println("\33[35m"+lista.get(3).nome);

        // verificando se o usuário está presente na lista

        System.out.println("\33[34mTem " + lista.contains(u1));
        // sem sobescrever o equals o resultado seria falso porque os objetos poderiam
        //ter o mesmo conteúdo, mas seria comparado os endereços de memórias, que são diferentes.
        System.out.println("\33[34mTem " + lista.contains(new Usuario("Tiago")));

        System.out.println("A " + lista.remove(1).nome +" foi removida da lista");
        System.out.println(lista.remove(new Usuario("Tiago")));

        // lista nova
         System.out.println("--------------------------------------------------------------");
        for (Usuario nomes:lista) {
            System.out.println(nomes.nome);
        }
        System.out.println("--------------------------------------------------------------");
    }





}
