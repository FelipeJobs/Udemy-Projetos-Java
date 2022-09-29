package projetosudemy.lambda.interfacesfuncionais;

import java.util.function.Predicate;

/* essa recebe um valor e retorna um boolean*/
public class Predicato {
    public static void main(String[] args) {
        Predicate<Integer> par = ispar -> ispar % 2 ==0;

        System.out.println(par.test(3));

    }
}
