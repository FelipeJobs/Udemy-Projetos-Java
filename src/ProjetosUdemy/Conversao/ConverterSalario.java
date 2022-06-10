package ProjetosUdemy.Conversao;

import java.util.Scanner;

// devo converter um salário em String para double e gerar uma média no final.
public class ConverterSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String salario1, salario2, salario3;
        System.out.print("Digite O seu primeiro salário R$:  ");
        salario1 =input.nextLine().replace(",", ".");
        System.out.print("\nDigite O seu segundo salário R$:  ");
        salario2 = input.nextLine();
        System.out.print("\nDigite O seu terceiro salário R$:  ");
        salario3 = input.nextLine();
        // Utilizei o Replace para garantir que se o usuário colocar vírgula será
        // trocado por ponto, evitando erros no programa.

        // agora vou converter para double
        Double s1 = Double.parseDouble(salario1);
        Double s2 = Double.parseDouble(salario2);
        Double s3 = Double.parseDouble(salario3);

        Double media = Double.valueOf((s1 + s2 + s3))/3;
        System.out.printf("\33[36m\nA média dos três salários é: R$%.2f ", media);
        input.close();
    }

}
