package br.edu.fatecpg.atividade05.view;
import br.edu.fatecpg.atividade05.model.Farmacia;
public class FarmaciaMain {

	public static void main(String[] args) {
		
		   Farmacia farmacia = new Farmacia();

	        farmacia.mostrarMedicamentos();

	        double media = farmacia.calcularMediaDias();
	        System.out.println("📅 Média de dias para vencimento: " + media);
	        System.out.println();

	        farmacia.medicamentosProximosDoVencimento();

	        farmacia.aplicarDesconto();

	        farmacia.mostrarMedicamentos();

	        farmacia.venderMedicamento("Dipirona");
	        farmacia.mostrarMedicamentos();
	}

}
