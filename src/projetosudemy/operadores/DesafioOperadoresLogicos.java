package projetosudemy.operadores;

import java.util.Scanner;

public class DesafioOperadoresLogicos {
    /* O desafio é analisar os cenários que vão ocorrer com base na ocorrência de dois trabalhos
    durente a semana.
    - se os dois trabalhos darem certo vamos ao shopping comprar uma tv de 50 polegadas.
    - se apenas um trabalho der certo será comprado uma tv de 32 polegadas
    - se for ao shopping iremos tomar sorvete com a família.
    - um trabalho será na terça e na quinta
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O trabalho de Terça deu certo True or False?");
        boolean terça = input.nextBoolean();

        System.out.println("O trabalho de Quinta deu certo True or False?");
        boolean quinta = input.nextBoolean();

        if(terça == true && quinta == true){
            System.out.println("\33[34mOlá família vamos comprar a TV de 50 polegadas e tomar sorverte" +
                    " no Shopping");

        } else if (terça == true || quinta == true) {
            System.out.println("\33[33mOlá família vamos comprar a TV de 32 polegadas e tomar sorverte" +
                    " no Shopping");

        }
        else {
            System.out.println("\33[31mOlá família infelizmente Nenhum trabalho deu certo e não vamos" +
                    " tomar sorvete, mas pensem pelo lado bom isso vai ser bom para a nossa saúde.");
        }
        input.close();
    }

}

