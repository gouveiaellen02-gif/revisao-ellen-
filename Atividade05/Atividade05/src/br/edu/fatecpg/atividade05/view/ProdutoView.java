package br.edu.fatecpg.atividade05.view;
import br.edu.fatecpg.atividade05.model.Produto; // importa a classe do model
public class ProdutoView {

	public static void main(String[] args) {
	
        Produto produto = new Produto();
        
        produto.setNome("Camiseta");
        produto.setPreco(59.90);
        produto.setQuantidadeEstoque(10);

    
        produto.setPreco(-5); // Deve mostrar erro
        produto.setQuantidadeEstoque(-1); // Deve mostrar erro

  
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Estoque: " + produto.getQuantidadeEstoque());
   

	}

}
