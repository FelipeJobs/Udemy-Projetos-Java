package projetosudemy.desafiosCondicionais.desafiosFinais;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*  Criar um programa que receba uma palavra e imprime no console letra por letra.
 */
public class QuebrandoAPalavra {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.print("\33[34mDigite a palavra: ");
        String palavra = input.nextLine();

        //com essa parte eu quebro o código e transformo em uma lista de letras
        char letras[] = palavra.toCharArray();

        // uso o for para percorrer a lista e imprimir cada letra
        for (int i = 0; i < letras.length; i++) {
            System.out.println("\33[36m"+letras[i]);
            TimeUnit.SECONDS.sleep(3);
        }

        input.close();
    }
}
