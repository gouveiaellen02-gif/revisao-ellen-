package br.edu.fatecpg.atividade05.view;
import br.edu.fatecpg.atividade05.model.Funcionario;
public class FuncionarioMain {

	public static void main(String[] args) {
	
		 Funcionario desenvolvedor = new Funcionario();

	        // 2. Usar os setters para definir os valores
	        desenvolvedor.setNome("Bruno Mendes");
	        desenvolvedor.setSalario(4200.00);
	        desenvolvedor.setCargo("Desenvolvedor Júnior");
	        
	        System.out.println("\n--- Dados do Funcionário (via Getters) ---");
	        System.out.println("Nome: " + desenvolvedor.getNome());
	        System.out.println("Cargo: " + desenvolvedor.getCargo());
	        System.out.println("Salário: R$" + desenvolvedor.getSalario());
	}

}
