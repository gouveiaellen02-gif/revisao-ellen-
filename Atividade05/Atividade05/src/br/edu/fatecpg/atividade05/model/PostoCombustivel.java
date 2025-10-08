package br.edu.fatecpg.atividade05.model;

public class PostoCombustivel {


	
	    String[] tiposCombustivel = {"Gasolina", "Etanol", "Diesel"};
	    double[] precosLitro = {5.49, 3.89, 4.99};
	    int[] litrosDisponiveis = {1000, 800, 600};

	    public void exibirCombustiveis() {
	        System.out.println("=== Combustíveis disponíveis ===");
	        for (int i = 0; i < tiposCombustivel.length; i++) {
	            System.out.println(tiposCombustivel[i] + " - R$ " + precosLitro[i] + " /litro - " 
	                               + litrosDisponiveis[i] + " litros disponíveis");
	        }
	        System.out.println();
	    }

	 
	    public double calcularValorEstoque() {
	        double total = 0;
	        for (int i = 0; i < tiposCombustivel.length; i++) {
	            total += precosLitro[i] * litrosDisponiveis[i];
	        }
	        return total;
	    }

	    public void mostrarEstoqueMaiorEMenor() {
	        int maior = 0, menor = 0;
	        for (int i = 1; i < litrosDisponiveis.length; i++) {
	            if (litrosDisponiveis[i] > litrosDisponiveis[maior]) {
	                maior = i;
	            }
	            if (litrosDisponiveis[i] < litrosDisponiveis[menor]) {
	                menor = i;
	            }
	        }

	        System.out.println("Combustível com maior estoque: " + tiposCombustivel[maior] + " (" + litrosDisponiveis[maior] + " litros)");
	        System.out.println("Combustível com menor estoque: " + tiposCombustivel[menor] + " (" + litrosDisponiveis[menor] + " litros)");
	        System.out.println();
	    }

	 
	    public void venderCombustivel(String tipo, int litros) {
	        for (int i = 0; i < tiposCombustivel.length; i++) {
	            if (tiposCombustivel[i].equalsIgnoreCase(tipo)) {
	                if (litros <= litrosDisponiveis[i]) {
	                    litrosDisponiveis[i] -= litros;
	                    double valor = litros * precosLitro[i];
	                    System.out.println("Venda realizada: " + litros + " litros de " + tipo + " por R$ " + valor);
	                } else {
	                    System.out.println("❌ Estoque insuficiente de " + tipo);
	                }
	                return;
	            }
	        }
	        System.out.println("❌ Tipo de combustível não encontrado: " + tipo);
	    }

	   
	    public void reabastecerCombustivel(String tipo, int litros) {
	        for (int i = 0; i < tiposCombustivel.length; i++) {
	            if (tiposCombustivel[i].equalsIgnoreCase(tipo)) {
	                litrosDisponiveis[i] += litros;
	                System.out.println("✅ Reabastecido " + litros + " litros de " + tipo);
	                return;
	            }
	        }
	        System.out.println("❌ Tipo de combustível não encontrado: " + tipo);
	    }
	}


