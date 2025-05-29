package estruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao_004 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		
		System.out.print("Digite a quantidade de minutos: ");
		minutos = sc.nextInt();
		
		System.out.print("\nVALOR A PAGAR= " + valorPagar(minutos));
		
		
		sc.close();

	}
	
	public static double valorPagar(int minutos) {
		
		final double PLANO = 50.00;
		
		if (minutos > 100) {
			
			return (minutos - 100) * 2 + PLANO;
		}
		else {
			return PLANO;
		}

	}
	
}
