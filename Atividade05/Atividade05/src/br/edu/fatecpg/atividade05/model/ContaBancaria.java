package br.edu.fatecpg.atividade05.model;
 
public class ContaBancaria {
	
	private double saldo;
	   private String titular;
	   public ContaBancaria(String titular) {
	       this.titular = titular;
	       this.saldo = 0.0;
	   }
	   public String getTitular() {
	       return this.titular;
	   }
	   public double getSaldo() {
	       return this.saldo;
	   }
	   public void depositar(double valor) {
	       if (valor > 0) {
	           this.saldo += valor;
	           System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
	       } else {
	           System.out.println("Valor de depósito inválido.");
	       }
	   }
	   public void sacar(double valor) {
	       if (valor > 0 && valor <= this.saldo) {
	           this.saldo -= valor;
	           System.out.println("Saque de R$" + valor + " realizado com sucesso.");
	       } else {
	           System.out.println("Saque inválido. Verifique o valor ou saldo disponível.");
	       }
	   }
	}
 
 
 


