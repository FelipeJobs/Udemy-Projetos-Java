package projetosudemy.poo.restaurante;

public class Jantar {
    public static void main(String[] args) {
        Comida Arroz = new Comida("Arroz",0.3);
        Comida Feijão = new Comida("Feijão",0.2);
        Comida Feijoada = new Comida("Feijoada",0.8);

        Pessoa p1 = new Pessoa("Felipe",80);
        Pessoa p2 = new Pessoa("Maria",60);

        p1.Comer(Feijoada);
        p1.Resultado();
    }
}
