package projetosudemy.poo.polimorfismo;

public class Almocar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setPeso(50);
        Feijao feijao = new Feijao();
        Arroz arroz = new Arroz();

        CarneVermelha carne = new CarneVermelha();


        p1.comer(feijao,200);
        p1.comer(carne,100);
        p1.comer(arroz,300);


        System.out.println(p1);

    }

}
