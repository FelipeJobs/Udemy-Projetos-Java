package projetosudemy.lambda.interfacesfuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

// o Supplier não recebe parâmetro, mas retorna um resultado
public class Suppl {


    public static void main(String[] args) {
        Supplier<List<String>> umalista= ()-> Arrays.asList("Cacau Show","Bauduco","Panco");

        System.out.println(umalista.get());


    }
}
