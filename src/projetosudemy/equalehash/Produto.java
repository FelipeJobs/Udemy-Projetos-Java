package projetosudemy.equalehash;

import java.util.Objects;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preco;
    }

    public void setPreço(double preço) {
        this.preco = preço;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), preco);
    }

    
}
