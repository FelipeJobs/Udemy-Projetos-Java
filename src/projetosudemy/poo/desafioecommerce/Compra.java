package projetosudemy.poo.desafioecommerce;

import java.util.ArrayList;
import java.util.List;

public class Compra {
        List<Item>itens = new ArrayList<>();

        Compra compras = new Compra();

        void AdicionarNoCarrinho(Produtos p, int quantidade){
                this.itens.add(new Item(p,quantidade));

        }

        double TotalCompra(){
                double total = 0;

                for (Item item:itens) {
                        total += item.quantidade * item.produto.preco;
                }

                return total;
        }

}
