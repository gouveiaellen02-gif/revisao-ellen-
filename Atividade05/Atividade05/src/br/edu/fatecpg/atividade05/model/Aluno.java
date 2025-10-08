package br.edu.fatecpg.atividade05.model;

public class Aluno {
	 // --- Atributos privados ---
    private String nome;
    private String matricula;
    private double notaFinal;

    // --- Métodos GET e SET ---
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0 && notaFinal <= 10) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("❌ Nota inválida! Deve ser entre 0 e 10.");
        }
    }
}
