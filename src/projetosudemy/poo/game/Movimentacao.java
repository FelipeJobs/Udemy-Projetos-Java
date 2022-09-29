package projetosudemy.poo.game;

public class Movimentacao {
    int y;
    int x;

    void andar(Direcao direcao){
        switch (direcao){
            case Norte:
                y++;
                break;

            case Sul: x++;
            break;

            case Oeste: x--;
            break;

            case Leste: x++;
            break;
        }
    }

    void posiçao(){

    }
}
