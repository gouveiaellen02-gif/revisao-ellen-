package br.edu.fatecpg.atividade05.model;

public class Farmacia {

    String[] nomesMedicamentos = {"Paracetamol", "Ibuprofeno", "Amoxicilina", "Dipirona"};
    int[] diasParaVencimento = {10, 3, 15, 2};
    double[] precos = {12.50, 18.90, 25.00, 9.80};

  
    public void mostrarMedicamentos() {
        System.out.println("=== Medicamentos em Estoque ===");
        for (int i = 0; i < nomesMedicamentos.length; i++) {
            System.out.println(nomesMedicamentos[i] + " - R$" + precos[i] + " - vence em " + diasParaVencimento[i] + " dias");
        }
        System.out.println();
    }

   
    public double calcularMediaDias() {
        int soma = 0;
        for (int i = 0; i < diasParaVencimento.length; i++) {
            soma += diasParaVencimento[i];
        }
        return (double) soma / diasParaVencimento.length;
    }

   
    public void medicamentosProximosDoVencimento() {
        System.out.println("=== Medicamentos próximos do vencimento (menos de 5 dias) ===");
        for (int i = 0; i < nomesMedicamentos.length; i++) {
            if (diasParaVencimento[i] < 5) {
                System.out.println("⚠️ " + nomesMedicamentos[i] + " - vence em " + diasParaVencimento[i] + " dias");
            }
        }
        System.out.println();
    }

   
    public void aplicarDesconto() {
        for (int i = 0; i < nomesMedicamentos.length; i++) {
            if (diasParaVencimento[i] < 5) {
                precos[i] = precos[i] / 2;
            }
        }
        System.out.println("✅ Descontos aplicados em medicamentos próximos do vencimento!");
        System.out.println();
    }

   
    public void venderMedicamento(String nome) {
        boolean encontrado = false;
        for (int i = 0; i < nomesMedicamentos.length; i++) {
            if (nomesMedicamentos[i].equalsIgnoreCase(nome)) {
                System.out.println("💰 Venda realizada: " + nomesMedicamentos[i] + " por R$" + precos[i]);
                nomesMedicamentos[i] = "--- VENDIDO ---";
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("❌ Medicamento não encontrado: " + nome);
        }
        System.out.println();
    }
}

