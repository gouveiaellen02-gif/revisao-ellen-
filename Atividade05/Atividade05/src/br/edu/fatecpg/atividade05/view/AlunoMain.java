package br.edu.fatecpg.atividade05.view;

import br.edu.fatecpg.atividade05.model.Aluno;

public class AlunoMain {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(); 
        aluno.setNome("Ellen Gouveia");
        aluno.setMatricula("FATEC2025");
        aluno.setNotaFinal(9.0);

        System.out.println("=== Dados do Aluno ===");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Nota Final: " + aluno.getNotaFinal());
    }
}

