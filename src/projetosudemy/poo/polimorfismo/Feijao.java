package projetosudemy.poo.polimorfismo;

public class Feijao extends Comida{
    private double peso = 0.003;

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }


}
