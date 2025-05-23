package estruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao_001 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2;
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		double resultado = media(nota1, nota2);
		
		System.out.println(" \nNOTA FINAL = " + String.format("%.1f", resultado));
		
		if (resultado < 60.0) {
			System.out.print("REPROVADO");
		}
		
		
		sc.close();
		
	}
	
	public static double media(double nota1, double nota2) {
		return nota1 + nota2;
	}

}
