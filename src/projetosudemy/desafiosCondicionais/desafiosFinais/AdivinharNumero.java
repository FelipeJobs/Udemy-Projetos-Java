package projetosudemy.desafiosCondicionais.desafiosFinais;
/* Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas
para adivinhar o número gerado. Ao final de cada tentativa, imprima a
quantidade de tentativas restantes, e imprima se o número inserido é
maior ou menor do que o número armazenado.*/

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AdivinharNumero {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        Random aleat = new Random();
        int aleatorio = aleat.nextInt(0,100);


        int i = 1;

        for (; i <= 10; i++) {
                System.out.print("\33[32mEu escrevi um número entre 0 e 100, consegue adivinhar? "
                );
                int numero = input.nextInt();
                TimeUnit.SECONDS.sleep(5);

            if(numero == aleatorio ){
                System.out.println("\33[34mParabéns você acertou o número é: " + aleatorio);
                System.out.println("Ademais você ainda tinha " + (10-i) + " tentativas!!!\n");
                break;

            }
            else if (numero > aleatorio) {
                System.out.println("\33[35mVocê errou o número digitado é maior que o que eu escrevi");
                System.out.println("Ademais você ainda tem " + (10-i) + " tentativas!!!\n");

            }
            else if (numero < aleatorio) {
                System.out.println("\33[36mVocê errou o número digitado é menor que o que eu escrevi");
                System.out.println("Ademais você ainda tem " + (10-i) + " tentativas!!!\n");

            }
        }

        if(i == 10){
            System.out.println("Acabaram as suas tentativas o número que eu escrevi" +
                    " foi: " + aleatorio);
        }
        input.close();
    }
}
