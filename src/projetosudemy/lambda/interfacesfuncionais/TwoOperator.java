package projetosudemy.lambda.interfacesfuncionais;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class TwoOperator {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (n1,n2) -> (n1+n2)/2;

        Function<Double,String> aprovado = med -> med>=7 ? "\33[36mParabéns você foi " +
                "aprovado !!!":"\33[31mSorry você foi reprovado, mas não desanime";

        String resultadoFinal = media.andThen(aprovado).apply(10.0,5.0);

        System.out.println(resultadoFinal);

        // poderia fazer tudo com uma única function

        BiFunction<Double,Double,String> resul = (n3, n4) ->{
            double notaFinal = (n3+n4)/2;
            return notaFinal >=7 ? "Aprovado!!!":"Reprovado";
        };

        System.out.println(resul.apply(10.0,10.0));



    }}
