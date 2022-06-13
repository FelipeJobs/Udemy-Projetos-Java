package projetosudemy.desafiosCondicionais;

import java.util.Scanner;
import java.text.DecimalFormat;

import static java.util.concurrent.TimeUnit.*;

/* O desafio é fazer um laço que armazene as notas digitadas pelo usuário e no final informar
a média com base na quantidade de notas digitadas e o número de notas válidas.
Notas válidas = de 0 a 10
o programa vai parar quando o usuário digitar -1.
*/
public class DesafioWhile {
    public static void main(String[] args) throws InterruptedException {
        Scanner input= new Scanner(System.in);
        DecimalFormat formate = new DecimalFormat("0.0");

        Double nota = 0.0;
        int quantidadeDeNotas = 0;
        double somaNota = 0;
        double media;

        while (true){
            System.out.print("Digite o valor da nota: ");
            nota = input.nextDouble();
            if (nota == -1){
                System.out.println("\n\33[35mObrigado por utilizar a nossa ferramenta !!!\n");
                break;
            }
            else if(nota < 0 || nota >10){
                System.out.println("\33[31mPor favor digite uma nota válida(entre 0 a 10)!!\n");
                continue;
            }
            else{
                quantidadeDeNotas += 1;
                somaNota += nota;
            }
        }
        media = somaNota/quantidadeDeNotas;

        System.out.println("\33[34mResultados:\n");
        SECONDS.sleep(5);
        System.out.println("\33[36mA quantidade de nota válidas digitadas foram: " + quantidadeDeNotas +"\n");
        System.out.println("\33[32mA média geral foi: " + formate.format(media));
        input.close();
    }
}
