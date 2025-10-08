package br.edu.fatecpg.atividade05.model;

public class Funcionario {
	 // Atributos privados: só podem ser acessados dentro desta classe
    private String nome;
    private double salario;
    private String cargo;

    // --- Getters ---
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    // --- Setters ---
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setSalario(double novoSalario) {
        if (novoSalario > 0) {
            this.salario = novoSalario;
        } else {
            System.out.println("[ALERTA] Salário deve ser positivo.");
        }
    }

    public void setCargo(String novoCargo) {
        this.cargo = novoCargo;// o this é o próprio objeto
    }
}
