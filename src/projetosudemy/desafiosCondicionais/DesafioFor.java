package projetosudemy.desafiosCondicionais;
/* Eu devo construir um escadinha usando o for sem utilizar
nenhum valor numérico para controlar o laço de repetição.
resultados:
#
##
###
####
#####
 */
public class DesafioFor {
    public static void main(String[] args) {
        String resultado = "######";

        for (String valor = "#"; valor.length()< resultado.length();valor+="#"){
            System.out.println("\33[36m"+valor);

        }
        /* Outra forma de resolver o exercícios é desse jeito:
        for (String valor = "#"; !valor.equals("#####");valor+="#"){
            System.out.println("\33[36m"+valor);
        }
         */

    }
}
