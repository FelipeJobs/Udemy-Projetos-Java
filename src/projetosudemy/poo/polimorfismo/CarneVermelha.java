package projetosudemy.poo.polimorfismo;

public class CarneVermelha extends Comida {
    private double peso = 0.0025;
    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
