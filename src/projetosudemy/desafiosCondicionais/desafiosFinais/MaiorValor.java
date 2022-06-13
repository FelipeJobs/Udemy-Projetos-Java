package projetosudemy.desafiosCondicionais.desafiosFinais;

import java.util.Scanner;

/*Crie um programa que recebe 10 valores e ao final imprima o maior número.
 */
public class MaiorValor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maior = 0;
        for (int i = 1; i <=10 ; i++) {
            System.out.printf("\33[35mDigite o %dºvalor: ",i);
            int valor = input.nextInt();
            if(valor > maior){
                maior = valor;
            }


        }
        System.out.printf("\33[34mO maior valor digitado foi: " + maior);
        input.close();
    }

}

