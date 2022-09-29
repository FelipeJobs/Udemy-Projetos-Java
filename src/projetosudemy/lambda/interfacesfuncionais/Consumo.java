package projetosudemy.lambda.interfacesfuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// o Consumer recebe um parâmetro mais não gera um retorno
public class Consumo {
    public static void main(String[] args) {
        Consumer<Produto> name = n -> System.out.println(n.nome);

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Caneta",10,0.1));
        produtos.add(new Produto("Borracha",3.5,0.05));
        produtos.add(new Produto("Lápis",2.8,0.5));
        produtos.add(new Produto("Lapiseira",15,0.2));
        produtos.add(new Produto("Caderno",31.90,0.3));

        produtos.forEach(name);
        System.out.println();
        produtos.forEach(p->System.out.println(p.toString()));


    }


}
