package projetosudemy.map;

import java.util.HashMap;
import java.util.Map;

public class MapNomes {
    public static void main(String[] args) {
        Map<Integer,String> nomes = new HashMap<>();
        //o put adiciona caso não exista a chave e atualiza se existir.
        nomes.put(1,"Fernando");
        nomes.put(2,"Paula");
        nomes.put(3,"Roberto");
        nomes.put(4,"Lipe");
        nomes.put(5,"Maria");
        // values retorna os valores dentro das chaves
        for (String nome:nomes.values()) {
            System.out.println("\33[34m"+nome);
        }
        //key retorna os valores da chave
        for (Integer id:nomes.keySet()) {
            System.out.println("\33[36m"+id);
        }
        // dessa forma eu imprimo tanto a chave como os valores
        for (Map.Entry<Integer, String> nome:nomes.entrySet()) {
            System.out.println("\33[35m"+nome);
        }

        // retornando valor pelo id
        System.out.println("\33[31m"+nomes.get(4));

        // removendo pelo valor da chave
        System.out.println("\33[32m"+nomes.remove(2));
        // o outro remove que retorna um boolean só remove se o valor da chave e o valor foram encontrados.


    }
}
