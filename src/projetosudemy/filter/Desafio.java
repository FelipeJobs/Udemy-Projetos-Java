package projetosudemy.filter;
/*  o objetivo desse desafio é filtrar todos os produtos da cor vermelha e com preço menor
que 50 reais.*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {
    public static void main(String[] args) {
        Produto p1 = new Produto("Calça","Preto",10);
        Produto p2 = new Produto("Camiseta","Vermelho",30);
        Produto p3 = new Produto("Sapato","Vermelho",100);
        Produto p4 = new Produto("Cinto","Preto",20.5);
        Produto p5 = new Produto("Cueca","vermelho",29.99);

        List<Produto>produtos = Arrays.asList(p1,p2,p3,p4,p5);
        Predicate<Produto> cor = p -> p.cor == "Vermelho" || p.cor == "vermelho";

        produtos.stream().filter(cor).filter(produto -> produto.preco <=30).
                map(produto -> produto.nome).forEach(System.out::println);
    }
}
