package projetosudemy.relacionamentonxn;

public class Matricula {
    public static void main(String[] args) {
        Alunos a1 = new Alunos("Marcos");
        Alunos a2 = new Alunos("Paulo");
        Alunos a3 = new Alunos("Lipe");

        Cursos c1 =new Cursos("Java");
        Cursos c2 =new Cursos("Python");
        Cursos c3 =new Cursos("JS");

        //adicionando os alunos no curso
        a1.AdicionarCurso(c1);
        a2.AdicionarCurso(c1);
        a3.AdicionarCurso(c1);
        
        a1.AdicionarCurso(c2);
        a3.AdicionarCurso(c2);
        
        a3.AdicionarCurso(c3);

        // retorna todos os aluno inscritos em um determinado curso.
        for (Alunos aluno: c1.aluno) {
            System.out.println(aluno.nome + " está fazendo o curso de: " + c1.nome);
            
        }
        //retorna todos os cursos que um aluno está inscrito
        for (Cursos cursos: a3.curso) {
            System.out.println(cursos.nome);

        }

        // imprimir todos os alunos presentes em um curso
        System.out.println(c1.aluno.toString());

        // com esse método eu posso retornar todos os alunos presentes em curso de acordo
        // com a o index da lista, neste caso da lista de curso.
        System.out.println("\33[31m"+a1.curso.get(1).aluno);
        System.out.println("\33[31m"+a1.FiltrarCurso("python"));



        }
}
