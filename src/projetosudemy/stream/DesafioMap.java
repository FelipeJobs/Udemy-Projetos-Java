package projetosudemy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) throws InterruptedException {

        List<Object> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Function<Object, String> binario = num->Integer.toBinaryString((int)num);

        UnaryOperator<String> inverter = inv -> {
            String inverso = "";
            for (int i = inv.length() -1; i >= 0; i--) {
                inverso += String.valueOf(inv.charAt(i));
            }
            return inverso;
        };

        UnaryOperator<String> reverter = numero ->{
            int soma =0;
            int potencia = numero.length();
            for (int i = 0; i <= numero.length()-1 ; i++) {
                potencia --;
                String cortar = String.valueOf(numero.charAt(i));
                int converter =Integer.valueOf(cortar);
                int rev = (int) (converter * Math.pow(2,potencia));
                soma += rev;
            }
            return String.valueOf(soma);
        };

        for (Object n:nums) {
            System.out.println("\33[33mO número registrado foi: " + n);
            System.out.println("\33[34mO binário desse número é: " + binario.apply(n));
            System.out.println("\33[34mO inverso do binário é: " + binario.andThen(inverter).apply(n));
            System.out.println("\33[35mA forma binária do inverso é: "+binario.andThen(inverter).andThen(reverter).apply(n));
            System.out.println();
            TimeUnit.SECONDS.sleep(6);


        }
       // outra forma de fazer, só que só vai gerar o resultado final

        System.out.println("Usando o map e Stream");

        nums.stream().map(binario).map(inverter).map(reverter).forEach(System.out::println);



    }

}
