package projetosudemy.desafiosCondicionais;

import java.util.Scanner;

/* retornar o dia da semana de acordo com o dado digitado pelo usuário.
sendo domingo = 1, segunda = 2 e assim sucessivamente.

 */
public class DesafioDiaDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual é o dia da semana? ");
        String dia = input.next();

        switch (dia){
            case "Domingo":
                System.out.println("\33[34mHoje é o primeiro dia da semana");
                break;

            case "Segunda":
                System.out.println("\33[34mHoje é o segundo dia da semana");
                break;

            case "Terça":
                System.out.println("\33[34mHoje é o terceiro dia da semana");
                break;

            case "Quarta":
                System.out.println("\33[34mHoje é o quarto dia da semana");
                break;

            case "Quinta":
                System.out.println("\33[34mHoje é o quinto dia da semana");
                break;

            case "Sexta":
                System.out.println("\33[34mHoje é o sexto dia da semana");
                break;

            case "Sabado":
                System.out.println("\33[34mHoje é o Sétimo dia da semana");
                break;

            default:
                System.out.println("\33[31mEsse não é um dia válido, Ou a primeira letra não foi colocada" +
                        " em maiúscula, tente novamente");
        }

        input.close();
    }
}
