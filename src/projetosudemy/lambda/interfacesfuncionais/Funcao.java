package projetosudemy.lambda.interfacesfuncionais;

import java.util.function.Function;

// esse tipo de interface recebe o parâmtro de um tipo e retorna um valor com tipo diferente
public class Funcao {
    public static void main(String[] args) {
        Function<Integer,String>MaiorDeIdade = idade-> idade>=18 ? "Sim":"Não";

        Function<String, String> TemIdadeParaDirigir = idade -> idade == "Sim" ? "Você pode dirigir!!!":
                "Você ainda não tem idade para dirigir, sorry!!!";

        String resultado = MaiorDeIdade.andThen(TemIdadeParaDirigir).apply(18);
        //nesse caso acima o retorno do MaiorIdade é utilizado como parâmetro para a função
        //idade para dirigir e assim uma está encadeando a outra.

        System.out.println(resultado);

    }



}
