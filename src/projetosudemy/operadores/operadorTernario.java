package projetosudemy.operadores;
/* Operadores ternário funcionam como um if e else, Condição? se verdadeiro : se falso;
ou seja antes do interrogação tem a condição, depois do interrogação tem o resultado
se for verdadeiro e depois dos dois pontos o resultado se for falso

 */
public class operadorTernario {
    public static void main(String[] args) {
        double media = 4.6;
        String recuperacao = media > 5 ? "Mandado para a recuperação":"Reprovado";
        String resultado = media >=7 ? "Aprovado":recuperacao;
        System.out.println("O aluno foi: " + resultado);

    }
}
