package br.edu.fatecpg.atividade05.view;
import br.edu.fatecpg.atividade05.model.Carro;
import br.edu.fatecpg.atividade05.model.ContaBancaria;
import br.edu.fatecpg.atividade05.model.Produto;
 
 
public class Main {
	 public static void main(String[] args) {
	  Carro meuCarro = new Carro("Renault","Logan", 2015); //VALORES CRUCIAIS DENTRO DA Classe, ele é o construtor
	  
	  meuCarro.setAno(2020);//Setter do ano
	  
	  System.out.println(meuCarro.getModelo()); //Getter do modelo
	  String marca= meuCarro.getMarca();//Getter da marca pegando o retorno
	  System.out.println(marca); // Impressão da variável
	  meuCarro.ligar();//vai chamara o método ligar
	  meuCarro.acelerar();/// vai chamhar o método acelerar
			double valorLitro = 5.89;
      	 	double valorTotal = meuCarro.calcularValorEncherTanque(valorLitro);
       		System.out.println("Valor para encher o tanque: R$" + valorTotal);
 
   }
}
 
 
 
 


