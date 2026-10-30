import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaJSONTest {

    @Test
    void deveExibirAlunoEmJSON() {
        Aluno aluno = new Aluno(1, "Ana", new Curso("Sistemas de Informação"));

        PessoaJSON visitor = new PessoaJSON();
        assertEquals(
                "{\"tipo\":\"Aluno\",\"matricula\":1,\"nome\":\"Ana\",\"curso\":\"Sistemas de Informação\"}",
                visitor.exibir(aluno));
    }

    @Test
    void deveExibirProfessorEmJSON() {
        Professor professor = new Professor(1, "Maria", "Doutorado");

        PessoaJSON visitor = new PessoaJSON();
        assertEquals(
                "{\"tipo\":\"Professor\",\"matricula\":1,\"nome\":\"Maria\",\"titulacao\":\"Doutorado\"}",
                visitor.exibir(professor));
    }

    @Test
    void deveExibirFuncionarioEmJSON() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        PessoaJSON visitor = new PessoaJSON();
        assertEquals(
                "{\"tipo\":\"Funcionario\",\"codigo\":1,\"nome\":\"Pedro\",\"salario\":5000.0}",
                visitor.exibir(funcionario));
    }
}