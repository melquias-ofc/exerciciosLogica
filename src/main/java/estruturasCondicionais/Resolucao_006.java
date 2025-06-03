package estruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao_006 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a medida da glicose: ");
		double medidaGlicose = scanner.nextDouble();
		
		classificacaoGlicose(medidaGlicose);
		
		scanner.close();
	}
	
	public static void classificacaoGlicose(double medida) {
		
		if(medida <= 100) {
			System.out.print("Classificação: Normal");
		}
		else if(medida <= 140) {
			System.out.print("Classificação: Elevado");
		}
		else {
			System.out.print("Classificação: Diabetes");
		}
	}
	

}
