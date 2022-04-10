package ProjetosUdemy;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// o objetivo desse exercício é converter a temperatura.

public class ConverterTemperatura {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00"); // usando essa biblioteca
        // eu consigo formatar o número para apenas 3 casas decimais.

        int escolha = 0;
        final double fairh = 1.8;
        final double kelvin = 273.15;
        double temperatura = 0.0;
    // criei um laço para impedir que o usuário digite uma opção inválida.
        while (true){
            System.out.print("\33[32mVocê quer converter de:\n" +
                    "1 = Celcius para Kelvin\n" +
                    "2= Kelvin para Celcius\n" +
                    "3= Celcius para Fahrenheit\n" +
                    "4= Fahrenheit para Celcius\n" +
                    "5= Fahrenheit para Kelvin\n" +
                    "6= Kelvin para Fahrenheit\n" +
                    "Escolha: ");
                escolha = input.nextInt();
                if(escolha <=0 || escolha >6){
                    System.out.println("\33[31mEscolha uma opção válida");
                    TimeUnit.SECONDS.sleep(5);
                    // usei o time para atrasar um pouco.
                    System.out.println();
            }
                else {
                    break;
                }
        }

        System.out.println();
        System.out.print("\33[34mQual o valor da temperatura: ");
        temperatura = input.nextDouble();
        // utilizado para controlar as opções válidas.
        switch (escolha) {
            case 1:
                System.out.println("A temperatura em Kelvin é: " + deci.format (temperatura + kelvin) + "ºC");
                break;
            case 2:
                System.out.println("A temperatura em Celcius é: " + deci.format(temperatura - kelvin) + "ºK");
                break;
            case 3:
                System.out.println("A temperatura em Fahrenheit é: " + deci.format(temperatura * fairh + 32) + "ºF");
                break;
            case 4:
                System.out.println("A temperatura em Celcius é: " + deci.format ((temperatura - 32) / fairh)  + "ºC");
                break;
            case 5:
                System.out.println("A temperatura em Kelvin é: " + deci.format((temperatura - 32) * 5 / 9 + kelvin) + "ºK");
                break;
            case 6:
                System.out.println("A temperatura em Fahrenheit é: " + deci.format((temperatura - kelvin) * fairh + 32) + "ºF");
                break;


        }}}

