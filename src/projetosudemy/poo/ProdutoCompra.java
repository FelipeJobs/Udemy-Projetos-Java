package projetosudemy.poo;

import java.util.concurrent.TimeUnit;

public class ProdutoCompra {
    public static void main(String[] args) throws InterruptedException {
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        p1.nome = "Caneta";
        p1. preco = 10;

        p2.nome = "Caneta";
        p2. preco = 25;

        double carrinho = p1.precoComDesconto()+ p2.precoComDesconto();
        System.out.printf("\33[34mVocê comprou uma %s e um %s\n",p1.nome,p2.nome);
        TimeUnit.SECONDS.sleep(3);
        System.out.printf("\33[36mO total da suas compras foi:%.2f",carrinho);

    }
}
