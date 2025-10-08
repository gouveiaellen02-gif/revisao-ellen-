package br.edu.fatecpg.atividade05.view;
import br.edu.fatecpg.atividade05.model.Supermercado;
public class SupermercadoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supermercado meuMercado = new Supermercado();

        meuMercado.listarProdutos();

      
        String maiorEconomia = meuMercado.encontrarMaiorEconomia();
        System.out.println("\n--- Análise de Economia ---");
        System.out.println("O produto que gera a MAIOR ECONOMIA é: " + maiorEconomia);

     
        System.out.println("\n--- Testando Compras e Reposições ---");
        meuMercado.comprarProduto("Arroz 5kg");

     
        meuMercado.reporProduto("Farinha de Trigo", 6.00, 0.10); // 10% de desconto

     
        double novoTotal = meuMercado.calcularTotalDaCompra();
        System.out.printf("\nO NOVO total da compra (com desconto) é: R$%.2f\n", novoTotal);
	}

}
