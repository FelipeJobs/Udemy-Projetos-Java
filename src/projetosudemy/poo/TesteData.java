package projetosudemy.poo;

public class TesteData {
    public static void main(String[] args) {
        Data d1 = new Data("25","12","2022");
        Data d2 = new Data();

       System.out.printf("\33[35mO próximo natal será: %s",d1.DataFormatada());
       System.out.println();


        System.out.printf("\33[36mO,marco zero do calendário foi: %s",d2.DataFormatada());


    }
}
