package projetosudemy.poo.desafiocarro;

 class Gol extends Carro{
    private int aceleracao = 5;

     Gol() {
         super(200);
     }


     @Override
    protected void Acelerar (){

      if (velocidade < velocidade_maxima && ligado == true){
          velocidade += aceleracao;
      }



    }
    @Override
    protected void Frear(){
       if (velocidade_maxima >0 && ligado == true){
        velocidade -= aceleracao;}

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



