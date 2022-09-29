package projetosudemy.poo.game;

public class Status {
    int life;
    int ataque;
    int defesa;


    // atribuí um valor para vida
    private void life(Jogador jogador){

        this.life = jogador.Level*30;
    }

    // atribuí um valor para defesa
    private void defesa(Jogador jogador){
        if(jogador.Estilo.equalsIgnoreCase("Defensivo")){
            this.defesa = jogador.Level *2;
        }
        else{
            this.defesa = jogador.Level *1/2;
        }
    }


    // atribuí um valor para ataque
    private void ataque(Jogador jogador){
        if(jogador.Estilo.equalsIgnoreCase("Ofensivo")){
            this.ataque = jogador.Level *2;
        }
        else{
            this.ataque = jogador.Level *1/2;
        }
    }
}
