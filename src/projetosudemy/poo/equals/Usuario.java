package projetosudemy.poo.equals;

public class Usuario {
    String nome;
    String email;

    /*Eu spbrescrevi o método equals para garantir que ele não compararia os espaços na memória,
    mas o conteúdo que tem dentro do objeto e assim condigo saber se os dados são
    iguais ou não.*/
    @Override
    public boolean equals(Object obj) {
        // com esse if eu vou verificar se o objeto e da mesma instancia, nesse caso instancia do Usuario.
        if (obj instanceof Usuario) {
            //a linha abaixo converte o objeto recebido na função para o tipo usuário.
            Usuario comparacao = (Usuario) obj;
            //Com essas duas linhas eu uso o objeto recebido para comparar com o que vai entrar
            //dentro do equals, só que eu específico o atributo que será comparado.
            boolean nomeIgual = comparacao.nome.equals(this.nome);
            boolean emailIgual = comparacao.email.equals(this.email);
            // com esse retorn eu garanto que para ser o mesmo usuário o nome e o email tem
            //que ser iguais, para retornar vdd se somente um for igual vai retornar falso.
            return nomeIgual && emailIgual;

        } else {
            return false;
        }

    }
}

// o hash code será abordado em outra aula.

