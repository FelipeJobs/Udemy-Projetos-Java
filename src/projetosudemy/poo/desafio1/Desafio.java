package projetosudemy.poo.desafio1;
/* O desafio é imprimir o A sem colocar ele dentro do método main, sendo que
só posso mexer dentro do método main.

 */
public class Desafio {
    int A = 3;

    static int B = 5;

    public static void main(String[] args) {
        Desafio des = new Desafio();
        System.out.println(des.A);
        System.out.println(B);

    }

    // nesse exercício eu tive que criar uma instancia da classe para poder acessar o A
    // visto que ele é um membro de instancia da classe.
    // eu poderia tb transformar a instancia em um membro estático e assim eu poderia
    //utilizar ele como um membro da classe, como fiz com o b.
}
