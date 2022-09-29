package projetosudemy.equalehash;

public class Testando {
    public static void main(String[] args) {
        Produto n1 = new Produto("Lg",10);
        Produto n2 = new Produto("Lg",10);
        Produto celular1 = new Produto("Samsung note 10", 1000.0);
        Produto celular2 = new Produto("Samsung note 10", 1000.0);
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());
        System.out.println(celular1.hashCode());
        System.out.println(celular2.hashCode());
    }
}
