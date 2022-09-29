package projetosudemy.poo.polimorfismo;

public abstract class Comida {

    private double peso;
    public void comer(Pessoa p , double grama)
    {peso +=p.getPeso() * grama;}

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
