package projetosudemy.poo.polimorfismo;

import java.util.Objects;
import java.text.DecimalFormat;

public class  Pessoa {
    DecimalFormat converter = new DecimalFormat("0.00");
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >=0){
        this.peso = peso;
    }}

    public void comer(Comida p , double grama){
        peso +=p.getPeso() * grama;
    }

    @Override
    public String toString() {
        return "\33[34mO seu peso atual é: "+converter.format(getPeso());
    }
}
