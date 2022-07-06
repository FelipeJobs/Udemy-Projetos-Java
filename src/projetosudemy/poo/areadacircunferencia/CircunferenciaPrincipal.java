package projetosudemy.poo.areadacircunferencia;

public class CircunferenciaPrincipal {
    double raio;
    final static double pi = 3.14;

    public CircunferenciaPrincipal(double raio) {
        this.raio = raio;
        System.out.println("\33[35mO valor da área da circunferência é: "+Math.pow(raio,2)*pi);
    }


}
