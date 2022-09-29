package projetosudemy.filter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ListaDeAprovados {
    public static void main(String[] args) {


    Alunos a1 = new Alunos("Ana",10);
    Alunos a2 = new Alunos("Paulo",6);
    Alunos a3 = new Alunos("Maria",8);
    Alunos a4 = new Alunos("Tiago",7.5);
    Alunos a5 = new Alunos("Alice",7.8);
    Alunos a6 = new Alunos("Fernando",6.9);

    List<Alunos> aprovados = Arrays.asList(a1,a2,a3,a4,a5,a6);

    aprovados.stream().filter(a -> a.nota >=7).
            map(a -> "parabéns " + a.nome + " você foi aprovado(a)!!!!!").
            forEach(System.out::println);


}    }
