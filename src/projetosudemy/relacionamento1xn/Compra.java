package projetosudemy.relacionamento1xn;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    String cliente;
    List<Item> itens = new ArrayList<>();



    double gettotal(){
        double total = 0;
        /* Uso o For Each para percorrer a lista de itens e assim conseguir realizar o
        cálculo total */
        for (Item item:itens) {
            total+= item.preco * item.quantidade;
        }

        return total;
    }
    void  getProduto(){
        double precoPorProduto = 0;
        for (Item item:itens) {
            precoPorProduto = item.preco * item.quantidade;
            System.out.println("\33[36mProduto: "+item.nome + " Quantidade: "+item.quantidade+ " Preço total: "+precoPorProduto);

        }




    }


}
