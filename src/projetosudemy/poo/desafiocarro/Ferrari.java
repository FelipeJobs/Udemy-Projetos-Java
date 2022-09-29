package projetosudemy.poo.desafiocarro;

public class Ferrari extends Carro{
    private int aceleracao = 20;

    Ferrari(){
        super(300);
    }

    @Override
    protected void Acelerar (){
        if (velocidade_maxima <300 && ligado == true){
            velocidade += aceleracao;
        }


    }
    @Override
    protected void Frear(){
        if (velocidade_maxima >0 && ligado == true){
            velocidade -= aceleracao;
        }

    }

    @Override
    protected void Ligar() {
        ligado = true;
        velocidade =0;
    }

    @Override
    protected void Desligar() {
        ligado = false;
        velocidade =0;

    }


}
