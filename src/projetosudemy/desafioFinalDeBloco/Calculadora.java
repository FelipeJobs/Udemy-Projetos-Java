package projetosudemy.desafioFinalDeBloco;

import java.util.Scanner;


/* O desafio é construir uma calculadora sem utilizar laço de repetição e nem condição.

 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\33[34mDigite o primeiro Número: \n");
        double n1 = input.nextDouble();

        System.out.println("\33[35mQual operação você quer realizar? (+,-,/,*,%");
        String escolha = input.next();

        System.out.print("\33[34mDigite o Segundo Número: \n");
        double n2 = input.nextDouble();

        double resultado = "+".equals(escolha) ? n1 + n2:0;
        resultado = "-".equals(escolha) ? n1 - n2:resultado;
        resultado = "/".equals(escolha) ? n1 / n2: resultado;
        resultado = "*".equals(escolha) ? n1 * n2:resultado;
        resultado = "%".equals(escolha) ? n1 % n2:resultado;

        System.out.println("\33[36mO resultado da operação " +n1 +" " + escolha +" "+ n2 +": " +
                resultado);


    }


}
