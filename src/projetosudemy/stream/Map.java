package projetosudemy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        List<String>animes = Arrays.asList("naruto","black clover","pokemon");

        animes.stream().map(m -> m.toUpperCase()).forEach(print);

        System.out.println();
        System.out.println("Primeira letra dos animes");
        animes.stream().map(primeira -> primeira.toUpperCase().charAt(0 )+"").forEach(print);
        // tive que concatenar um vazio, para deixar o char no formato string.

        // outra forma de fazer
        UnaryOperator<String> maius = m->m.toUpperCase();
        UnaryOperator<String> pri = p->p.charAt(0)+"";
        System.out.println();
        System.out.println("Outro jeito de usar o map");
        animes.stream().map(maius.andThen(pri)).forEach(print);

        System.out.println();
        System.out.println("Usando o map com funções de outras classes");
        animes.stream().map(Genericas.maiuscula.andThen(Genericas.primeira)).forEach(print);
        //o static da classe Genericas permitiu que eu usasse os métodos dentro do map
        //mesmo o método não estando dentro dessa classe e sem a necessidade de importação
        //porque está no mesmo pacote.






    }
}
