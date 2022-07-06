package projetosudemy.queuelist;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adicionam elementos na fila, contudo o offer não add elemento
        // caso a fila esteja com seu limite máximo e lança uma exceção, já o add retorna
        //false


        fila.add("Richard"); // retorna false
        fila.offer("Lipe"); // Lança uma exceção
        fila.add("Marcos");
        fila.offer("Maria");
        fila.add("Paulo");
        fila.offer("Gustavo");

        // Peek e Element -> obtém o prox elemento da fila (sem remover)

        // Diferença é o comportamento ocorre quando a fila está vazia!
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança uma exceção
        System.out.println(fila.element());

        // Poll e Remove -> retorna o prox elemento da fila e o remove!

        // Diferença é o comportamento ocorre quando a fila está vazia!
        System.out.println(fila.poll()); // retorna Null
        System.out.println(fila.remove()); // Lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        // fila.size() tamanho da fila
        // fila.clear() limpar a fila
        // fila.isEmpty() verifica se a fila está ou não vazia
        // fila.contains(...) analisa se um dado está na fila
    }
}
