package projetosudemy.relacionamentonxn;

import java.util.ArrayList;
import java.util.List;

public class Cursos {
    String nome;
    List<Alunos>aluno = new ArrayList<>();

    Cursos(String curso){
        this.nome = curso;
    }

    void AdicionarAluno(Alunos aluno){
        this.aluno.add(aluno);
        aluno.curso.add(this);
    }


}
