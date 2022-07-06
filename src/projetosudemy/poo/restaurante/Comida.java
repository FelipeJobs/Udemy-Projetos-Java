package projetosudemy.poo.restaurante;

public class Comida {
    String nomeComida;
    public double pesoComida;

    public Comida(String nomeComida, double pesoComida) {
        this.nomeComida = nomeComida;
        this.pesoComida = pesoComida;
    }

    public double getPesoComida() {
        return pesoComida;
    }
}
