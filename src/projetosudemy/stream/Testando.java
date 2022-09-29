package projetosudemy.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Testando {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Maria","Paulo","Carlos","Tiago","Felipe");

        // percorrendo a lista usando o for each
        System.out.println("ForEach");
        for (String n:nomes) {
            System.out.println(n);}

        // basicamente o iterator verifica se tem um próximo dado e interagi com ele.
        //normalmente vou ter que usar uma estrura de repetição em conjunto com ele.
        System.out.println();
        System.out.println("Iterator");
        Iterator<String>Nomes = nomes.iterator();
        while (Nomes.hasNext()){
            System.out.println(Nomes.next());
        }

        // a stream tem métodos que facilitam a escrita do código, neste caso usei
        // o forEach e ainda fiz uma referencia de função. é muito comum utilizar
        //refencia com o stream.
        System.out.println();
        System.out.println("Stream");
        Stream<String>funcionarios = nomes.stream();
        funcionarios.forEach(System.out::println);

}}
