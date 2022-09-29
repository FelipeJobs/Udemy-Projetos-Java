package projetosudemy.lambda.interfacesfuncionais;

import java.util.function.Predicate;

public class Predicato2 {
    public static void main(String[] args) {
        Predicate<Integer> IsPar = num -> num% 2 ==0;
        Predicate<Integer>ThreeDigits = num -> num >= 100 && num <=999;

        System.out.println(IsPar.and(ThreeDigits).test(100));//nesse caso ambas as afirmações tem que ser vdd.
        System.out.println(IsPar.or(ThreeDigits).test(10)); // nesse caso somente uma das afirmações precisa ser vdd.


    }
}
