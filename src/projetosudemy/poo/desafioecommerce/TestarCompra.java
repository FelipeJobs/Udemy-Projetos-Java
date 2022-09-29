package projetosudemy.poo.desafioecommerce;

public class TestarCompra {
    public static void main(String[] args) {

        //Lista de produtos
        Produtos Teclado = new Produtos("Teclado",50);
        Produtos Mouse = new Produtos("Mouse",35.50);
        Produtos Fone = new Produtos("Hedset",180);
        Produtos Cabousb = new Produtos("USB",25);
        Produtos Tela = new Produtos("Tela 18 polegadas",1200);
        Produtos Gabinete = new Produtos("Gabinete gamer",190);
        Produtos Fonte = new Produtos("Fonte 500W",255);
        //Lista de produtos



        Cliente cliente = new Cliente("Paulo Roberto");

        Compra c1 = new Compra();

        c1.AdicionarNoCarrinho(Mouse,2);
        c1.AdicionarNoCarrinho(Teclado,1);
        c1.AdicionarNoCarrinho(Fone,1);
        c1.AdicionarNoCarrinho(Cabousb,3);

        cliente.compras.add(c1);

        System.out.println(cliente.ClienteTotal());


    }
}
