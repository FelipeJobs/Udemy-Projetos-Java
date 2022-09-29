package projetosudemy.poo.desafioecommerce;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    List<Compra>compras = new ArrayList<>();
    String nome;

    Cliente(String nome){
        this.nome=nome;
    }

    double ClienteTotal(){
        double total = 0;

        for (Compra compra:compras) {
            total += compra.TotalCompra();
        }

        return total;
    }

}
