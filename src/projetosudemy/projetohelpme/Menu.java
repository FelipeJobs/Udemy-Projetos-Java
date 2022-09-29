package projetosudemy.projetohelpme;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Menu{
    Scanner input = new Scanner(System.in);

   private int help;

    public void menu ()  {
        do {

        System.out.println("\33[35m1 if\n" +
                "2 switch\n" +
                "3 for\n" +
                "4 while\n" +
                "5 do-while\n" +
                "6 continue\n" +
                "7 break\n" +
                "8 funções\n" +
                "9 sair\n" );
        System.out.print("Em qual assunto você quer ajuda? ");
        help = input.nextInt();

        Instruções inst = new Instruções();
        inst.instruções(help);

            try {
                TimeUnit.SECONDS.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println();

    }while (help !=9);
        System.out.println("\33[35mEspero ter te ajuda, quando precisar estamos aqui para\n" +
                "ajudar!!!.");
    }

    public int getHelp() {
        return help;
    }
}
