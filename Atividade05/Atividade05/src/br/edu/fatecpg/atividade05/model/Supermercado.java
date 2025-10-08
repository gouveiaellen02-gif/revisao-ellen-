package br.edu.fatecpg.atividade05.model;
import java.util.ArrayList;
public class Supermercado {


	

	
	    private ArrayList<String> nomesProdutos = new ArrayList<>();
	    private ArrayList<Double> precos = new ArrayList<>();
	    private ArrayList<Double> descontos = new ArrayList<>(); // Percentual (ex: 0.10 para 10%)

	    public Supermercado() {
	        nomesProdutos.add("Arroz 5kg");
	        precos.add(25.00);
	        descontos.add(0.10); // 10%

	        nomesProdutos.add("Feijão 1kg");
	        precos.add(8.00);
	        descontos.add(0.05); // 5%

	        nomesProdutos.add("Leite Integral");
	        precos.add(4.50);
	        descontos.add(0.20); // 20%
	    }

	    
	    public void listarProdutos() {
	        System.out.println("\n--- Tabela de Produtos ---");
	        for (int i = 0; i < nomesProdutos.size(); i++) {
	            String nome = nomesProdutos.get(i);
	            double precoOriginal = precos.get(i);
	            double percentualDesconto = descontos.get(i);
	            double precoComDesconto = precoOriginal * (1 - percentualDesconto);
	            double economia = precoOriginal * percentualDesconto;

	            System.out.printf("%d. %s (R$%.2f) | Desconto: %.0f%% | Preço Final: R$%.2f | Economia: R$%.2f\n",
	                (i + 1), nome, precoOriginal, (percentualDesconto * 100), precoComDesconto, economia);
	        }
	    }

	   
	    public double calcularTotalDaCompra() {
	        double total = 0.0;
	        for (int i = 0; i < nomesProdutos.size(); i++) {
	            double precoOriginal = precos.get(i);
	            double percentualDesconto = descontos.get(i);
	            double precoComDesconto = precoOriginal * (1 - percentualDesconto);
	            total += precoComDesconto;
	        }
	        return total;
	    }

	   
	    public String encontrarMaiorEconomia() {
	        double maiorEconomia = 0.0;
	        String produtoMaiorEconomia = "Nenhum produto em estoque.";

	        for (int i = 0; i < nomesProdutos.size(); i++) {
	            double precoOriginal = precos.get(i);
	            double percentualDesconto = descontos.get(i);
	            double economiaAtual = precoOriginal * percentualDesconto;

	            if (economiaAtual > maiorEconomia) {
	                maiorEconomia = economiaAtual;
	                produtoMaiorEconomia = nomesProdutos.get(i);
	            }
	        }
	        return String.format("%s (R$%.2f de economia)", produtoMaiorEconomia, maiorEconomia);
	    }

	    public boolean comprarProduto(String nomeProduto) {
	        int index = nomesProdutos.indexOf(nomeProduto);

	        if (index != -1) {
	            nomesProdutos.remove(index);
	            precos.remove(index);
	            descontos.remove(index);
	            System.out.println("=> Produto '" + nomeProduto + "' COMPRADO e removido do estoque.");
	            return true;
	        } else {
	            System.out.println("=> ERRO: Produto '" + nomeProduto + "' não encontrado no estoque.");
	            return false;
	        }
	    }
	    
	    public void reporProduto(String nome, double preco, double desconto) {
	        nomesProdutos.add(nome);
	        precos.add(preco);
	        descontos.add(desconto);
	        System.out.println("=> Produto '" + nome + "' REPOSTO no estoque com sucesso.");
	    }
	}


