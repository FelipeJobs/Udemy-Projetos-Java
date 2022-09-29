package projetosudemy.poo.polimorfismo;

public class Arroz extends Comida{
    private double peso = 0.005;



    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
