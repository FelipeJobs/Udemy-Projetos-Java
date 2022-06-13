package projetosudemy.desafiosCondicionais.desafiosFinais;

import java.util.Scanner;

/*Criar um programa que receba um número e verifique se ele está entre
0 e 10 e é par;
 */
public class NumeroPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\33[32mDigite um número qualquer?");
        double numero = input.nextDouble();

        if (numero >=0 && numero <=10 && numero%2 ==0) {
            System.out.println("\33[35mO número digitado está entre 0 e 10," +
                    " sendo esse número o digito: " + numero + " .Ademais é par");

        }
        else if(numero >=0 && numero <=10){
            System.out.println("\33[36mO número digitado está entre 0 e 10," +
                    " sendo esse número o digito: " + numero );


        }
        else{
            System.out.println("\33[33mO número digitado não está entre 0 e 10");

        }
        input.close();

    }

}
