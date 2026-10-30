package org.example;

public interface Visitor {

    String exibirAluno(Aluno aluno);
    String exibirProfessor(Professor professor);
    String exibirFuncionario(Funcionario funcionario);

}
