package projetosudemy.lambda.interfacesfuncionais;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
 * 1. A partir do produto calcular o preco real (com desconto)
 * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
 * 3. Frete: >= 3000 (100)/ < 3000 (50)
 * 4. Arredondar: Deixar duas casas decimais
 * 5. Formatar: R$1234,56
 */
public class DesafioInt {
    public static void main(String[] args) {
        DecimalFormat arredondar = new DecimalFormat("0.00");

        Function<Produto, Double> precoFinal = produto-> produto.preco *
                (1- produto.desconto);

        UnaryOperator<Double> imposto = preco -> preco >= 2500 ? preco * 1.085 : preco;

        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;

        Function<Double, String> formatar = valor -> arredondar.format(valor);

        UnaryOperator<String> resultado = valor ->
                "\33[32mO valor final do produto é: " + valor;


        Produto computador = new Produto("Computador",1500,0.15);

        String valorFinal = precoFinal
                .andThen(imposto)
                .andThen(frete).
                andThen(formatar).
                andThen(resultado)
                .apply(computador);

        System.out.println(valorFinal);
    }
}
