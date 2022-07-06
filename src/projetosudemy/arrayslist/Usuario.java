package projetosudemy.arrayslist;

import java.util.Objects;

public class Usuario {
    String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }
    // eu sobrescrevi o equals  para poder comparar os valores e não os endereços
    //de memória.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return nome.equals(usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
