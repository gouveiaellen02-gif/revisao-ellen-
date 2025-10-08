package br.edu.fatecpg.atividade05.model;

public class Livro {
	// Livro.java
	class Livros {
	    public String Titulo;
	    public String Autor;
	    public int AnoPublicacao;
	    
// Nesse caso especificamente coloquei tudo em um arquivo só, o eclipse não estava aceitando o outro arquivo

	
	 public class LivroMainSimples {
	     
	     public static void main(String[] args) {
	         
	    	 Livros meuLivro =  Livros();

	         meuLivro.Titulo = "A Revolução dos Bichos";
	         meuLivro.Autor = "George Orwell";
	         meuLivro.AnoPublicacao = 1945;

	     
	         System.out.println("--- Informações do Livro ---");
	         System.out.println("Título: " + meuLivro.Titulo);
	         System.out.println("Autor: " + meuLivro.Autor);
	         System.out.println("Ano de Publicação: " + meuLivro.AnoPublicacao);
	     }
	 }





	 public static Livros Livros() {
		// TODO Auto-generated method stub
		 System.out.println("Método do Livro Chamado!");
		return null;
	 }
	}
}
