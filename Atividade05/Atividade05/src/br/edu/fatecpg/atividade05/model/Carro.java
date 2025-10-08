package br.edu.fatecpg.atividade05.model;
 
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double tanque;
    private double capacidadeTanque;
 
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
 
    public String getMarca() {
        return this.marca;
    }
 
    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }
 
    public String getModelo() {
        return this.modelo;
    }
 
    public void setModelo(String novoModelo) {
        this.modelo = novoModelo;
    }
 
    public int getAno() {
        return this.ano;
    }
 
    public void setAno(int novoAno) {
        this.ano = novoAno;
    }
 
    public double getTanque() {
        return this.tanque;
    }
 
    public void setTanque(double novoTanque) {
        this.tanque = novoTanque;
    }
 
    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }
 
    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
 
    public void ligar() {
        System.out.println("Carro ligado!");
    }
 
    public void acelerar() {
        System.out.println("Carro acelerado!");
    }
 
    public double calcularValorEncherTanque(double valorLitro) {
        return (capacidadeTanque - tanque) * valorLitro;
    }
}


