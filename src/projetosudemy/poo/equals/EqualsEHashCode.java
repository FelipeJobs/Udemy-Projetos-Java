package projetosudemy.poo.equals;

public class EqualsEHashCode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();

        u1.nome = "Lipe";
        u1.email = "Lipe@gmail.com";

        u2.nome = "lipe";
        u2.email = "Lipe@gmail.com";

        System.out.println(u1 == u2);
        // esses print só funcionam por causa da sobescrita do método equals(Usuario) se não
        //avaliariam os valores na memória.
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

    }
}
