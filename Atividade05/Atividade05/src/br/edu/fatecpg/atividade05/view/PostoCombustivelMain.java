package br.edu.fatecpg.atividade05.view;
import br.edu.fatecpg.atividade05.model.PostoCombustivel;

public class PostoCombustivelMain {

	public static void main(String[] args) {
		
        PostoCombustivel posto = new PostoCombustivel();

       
        posto.exibirCombustiveis();

    
        double valorEstoque = posto.calcularValorEstoque();
        System.out.println("💰 Valor total em estoque: R$ " + valorEstoque);
        System.out.println();

      
        posto.mostrarEstoqueMaiorEMenor();


        posto.venderCombustivel("Gasolina", 200);
        posto.venderCombustivel("Etanol", 1000); 
        System.out.println();

      
        posto.reabastecerCombustivel("Etanol", 500);

   
        System.out.println();
        posto.exibirCombustiveis();
	}

}
