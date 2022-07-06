package projetosudemy.arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

/* O desafios é receber uma quantidade específica de notas
e no final exibir a média. ademais, devo usar um for para percorrer
a lista e um forEach para mostrar os resultados.
 */
public class DesafioNota {
    public static void main(String[] args) {
    double soma = 0;
    Scanner input = new Scanner(System.in);
    DecimalFormat formatar = new DecimalFormat("0.0");
    System.out.print("Quantos notas você quer armazenar? ");
    int quantidade= input.nextInt();

    double notas[] = new double[quantidade];

    for (int i = 0;i<notas.length;i++){
        System.out.printf("\33[33mQual é a %dº nota\n",(i+1));
        notas[i]= input.nextDouble();
    }
    System.out.print("As notas sao: ");
        for (double nota:notas) {
            System.out.print(nota +"  ");
            soma+=nota;
        }
        System.out.println("\n\33[35mA média das notas é: "+ formatar.format( soma/quantidade));

        input.close();
}

}
