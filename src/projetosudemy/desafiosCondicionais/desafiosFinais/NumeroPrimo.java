package projetosudemy.desafiosCondicionais.desafiosFinais;

import java.util.Scanner;

/*Criar um programa que receba um número e diga se ele é um número primo.*/
public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 0;
        System.out.print("Qual número gostaria de saber se é primo? ");
        int numero = input.nextInt();

        for (int i = 1; i <=numero ; i++) {
            if(numero %i == 0){
                contador++;
            }
        }
        if (contador == 2){
            System.out.println("\33[35mO número " + numero + " è primo");
        }
        else {
            System.out.println("\33[32mO número " + numero + " não è primo");

        }
        input.close();
    }
}
