package projetosudemy.lambda.interfacesfuncionais;

import java.util.function.UnaryOperator;
// O UnaryOperator recebe um parâmetro e da um retorno do mesmo tipo.
public class OneOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> moreTwo = n-> n+2;
        UnaryOperator<Integer>timesTwo = n -> n*2;
        UnaryOperator<Integer> squared = n->n*n;

        int resultado = moreTwo.andThen(timesTwo).
                andThen(squared).apply(4);

        System.out.println(resultado);

        /* em vez de ter usado o Método andThen eu poderia ter utilizado o
        compose, só que ele começa de baixo para cima.*/

    }



}
