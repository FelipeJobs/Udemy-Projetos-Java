package projetosudemy.desafiosCondicionais.desafiosFinais;

import java.util.Scanner;

/* Criar um programa informa se o ano atual é um ano bissexto;*/
public class AnoBissexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual ano gostaria de saber se é bissexto? ");
        int ano = input.nextInt();

        if (ano% 4 == 0 && ano % 100 !=0) {
            System.out.println("\33[36mO ano de " + ano + " è bissexto");
            
        }
        else if (ano % 400 == 0) {
            System.out.println("\33[36mO ano de " + ano + " è bissexto");
            
        }
        else {
            System.out.println("\33[33mO ano de " + ano + " não è bissexto");
        }
        input.close();
    }
}
