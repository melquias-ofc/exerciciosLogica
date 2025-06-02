package estruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao_005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double valorUnidade, quantidadeUnidades, dinheiro;
		
		System.out.print("Preço unitário do produto: ");
		valorUnidade = scanner.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		quantidadeUnidades = scanner.nextDouble();
		
		System.out.print("Dinheiro recebido: ");
		dinheiro = scanner.nextDouble();
		
		troco(valorUnidade,quantidadeUnidades, dinheiro);
		
		
		scanner.close();
	
	}

	public static void troco(double preco, double quantidadeItens, double dinheiro) {
		
		double totalCompra = preco*quantidadeItens;
		
		if (totalCompra > dinheiro) {
			double falta = totalCompra - dinheiro;
			System.out.print("\nDINHEIRO INSUFICIENTE. FALTAM " + String.format("%.2f", falta) + " REAIS");
		}
		else {
			double trocoCliente = dinheiro - totalCompra;
			System.out.print("\nTROCO = " + String.format("%.2f", trocoCliente));
		}
		
		
	}
}
