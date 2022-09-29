package projetosudemy.projetohelpme;

public class Instruções extends Menu {


    public void instruções(int escolha){



        switch (escolha){
            case 1: System.out.println("\33[32mo if é uma instrução condicional, ou seja\n " +
                    "só vai acionar as informações do escopo quando a condição\n " +
                    "for atingida. Modelo de if:\n" +
                    " if(coloco a condição){o que irá ocorrer caso o resultado da condição " +
                    "seja verdadeira\n " +
                    "atingida.}");break;

            case 2: System.out.println("\33[32mè um modelo condicional, só que mais simples \n" +
                    "é ideal para construção de menus ou algo do tipo, porque\n" +
                    "as opções de escolhas é bem limitadas. Modelo:\n" +
                    "Switch(nome da variável que vou controlar ou usar para análise)\n" +
                    "{case + o que eu comparo e depois dos dois pontos e o dado que vai \n" +
                    "retornar caso o valor analisado seja igual ao case.\n" +
                    "Extra: no final de cada case colocamos um break. ");break;

            case 3: System.out.println("\33[33mO for é utilizado para criar laços de repetições,\n" +
                    "ou seja, fazer que um determinado escopo continue rodando até\n " +
                    "uma determina condição ser atingida. Modelo:\n" +
                    "for(inicialização, condição, incremento ou decremento que será\n" +
                    "utilizado para controlar o número de vezes que o laço vai rodar.)");break;

            case 4: System.out.println("\33[33mO while é outro estrutura de controle, normalmente\n" +
                    "ela é utilizada no lugar do for quando não sabemos quantas repetições\n" +
                    "serão necessárias para o bom desempenho do programa. Modelo:\n" +
                    "while(condição){escopo de repetição}\n" +
                    "extra: o código vai continiar funciona enquanto a condição for verdadeira.");break;

            case 5: System.out.println("\33[33mÉ outra estrutura de controle, diferente \ndo while\n" +
                    "ele roda primeiro o escopo e depois analisa a condição. Logo,\n" +
                    "ele sempre vai rodar pelo menos uma vez, visto que a condição só será\n" +
                    "analisada no final do código. Modelo:\n" +
                    "do{o que vai executar}while(condição)");break;

            case 6: System.out.println("\33[34mO continue é utilizado dentro de estruturas de controles \n" +
                    "quando você precisa saltar para a próxima iteração dco laço\n" +
                    "Extra: para utilizar basta colocar o continue no local onde \n" +
                    "quiser que o código não rode caso uma condição seja atendida.");break;

            case 7: System.out.println("\33[34mO break é utilizado com as estruturas de controle\n" +
                    "usando ele automaticamente vai finalizar a \n" +
                    "estrtura de contrle no qual\n" +
                    "ele estiver imbutido.");break;

            case 8: System.out.println("\33[36muma função é um pedaço de código organizado e reutilizável \n" +
                    "que é usado para executar uma única ação; as funções proporcionam uma \n" +
                    "melhor modularidade e um alto grau de reutilização de código; Modelo:" +
                    "Nível de acesso + \n" +
                    "tipo de retorno + nome da função + \n" +
                    "(paramêtros, eles não são obrigatórios)\n" +
                    "{escopo de retorno da função.}");break;

            case 9: System.out.println();break;

            default: System.out.println("\33[31mNão é uma opção válida, tente novamente");
        }


    }


}
