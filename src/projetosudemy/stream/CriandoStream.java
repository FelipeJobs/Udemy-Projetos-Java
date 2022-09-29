package projetosudemy.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
    public static void main(String[] args) {
        Consumer<Object>print = System.out::print;
        Consumer<Object>println = System.out::println;

        // criando a stream usando um método estático(Stream.of)
        System.out.println("Estático");
        Stream<String>linguagens = Stream.of("Java ","Pyhon ","JS\n");
        linguagens.forEach(print);
        System.out.println();

        System.out.println("A partir de uma lista");
        String[] outrasling = {"Go ","PHP ","C\n"};
        Stream.of(outrasling).forEach(print);
        Arrays.stream(outrasling).forEach(print);
        Arrays.stream(outrasling,1,2).forEach(print);
        //neste caso acima eu retorno somente o índice inicial estipulado até o índice que
        // aparece antes do índice final estipulado, neste caso foi o 2.
        System.out.println();

        System.out.println("Stream infinito");
        Stream.iterate(0,n->n+1).forEach(println);

        //nesse caso eu usei o método iterate que recebe um parâmtro e gerar um retorno
        //porque recebe um Unary Operator.
        //ademais, é muito comum combinar o Stream com funções lambdas.

    }
}
