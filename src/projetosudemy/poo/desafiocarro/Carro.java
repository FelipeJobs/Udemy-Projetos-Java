package projetosudemy.poo.desafiocarro;

public abstract class Carro {
        protected int velocidade;
        protected int velocidade_maxima;
        protected boolean ligado = false;

        Carro(int velocidade_maxima){
                this.velocidade_maxima = velocidade_maxima;
        }

        protected abstract void Acelerar();
        protected abstract void Frear();

        protected abstract void Ligar();

        protected abstract void Desligar();

        protected void VelocidadeAtual(){
                System.out.println("\33[34m"+velocidade + " KM/H");
        }
}
