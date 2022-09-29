package projetosudemy.relacionamentonxn;

import java.util.ArrayList;
import java.util.List;

public class Alunos {
    String nome;
    List<Cursos>curso = new ArrayList<>(); // relacionamento nxn

    // construtor para torna obrigatório receber o nome do aluno quando for instanciado o obj.
    Alunos(String aluno){
        this.nome = aluno;
    }
    void AdicionarCurso(Cursos curso){
        this.curso.add(curso); // adicionar curso a lista
        curso.aluno.add(this);// essa parte é para adicionar o aluno ao curso específico.
    }
    // sobescrivi o método para retorne específicamente os nomes dos alunos quando chamado.
    @Override
    public String toString() {
        return nome;
    }


    /* Com o método filtrar eu retorno o nome de tds os alunos caso o curso buscado
    exista na llista. Usei o tipo Object como retorno para poder retornar os nomes.
     */
    Object FiltrarCurso(String nome){
        for (Cursos curso:this.curso) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso.aluno.toString();
            }
        }
        return null;
    }
}
