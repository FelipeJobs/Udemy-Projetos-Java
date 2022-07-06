package projetosudemy.poo.restaurante;

public class Pessoa {
    String nome;
    double peso;
    String comeu;
    double pesoFinal;



    public Pessoa(String nome, double peso) {

        this.nome = nome;
        this.peso = peso;

    }

     //aqui eu recebo como parâmetro um objeto em vez de um tipo primitivo
    void Comer(Comida comida) {
        if (comida.nomeComida != null) {
            this.pesoFinal = peso + comida.pesoComida;
            this.comeu = comida.nomeComida;
        }

    }

    void Resultado(){
        System.out.printf("\33[36m%s tinha %.2f KG, só que depois de comer, %s, está agora com: %.2f KG",
                nome,peso,comeu,pesoFinal);
    }
}
