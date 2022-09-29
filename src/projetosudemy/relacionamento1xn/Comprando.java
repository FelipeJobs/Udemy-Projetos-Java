package projetosudemy.relacionamento1xn;

public class Comprando {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "Lipe";
        c1.itens.add(new Item("Lápis",10,2.50));
        c1.itens.add(new Item("Caneta",10,5.00));
        c1.getProduto();
        System.out.print(c1.cliente +" o total da sua compra foi: ");
        System.out.println("\33[33mR$ "+c1.gettotal());

    }
}
