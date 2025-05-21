package estruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao_8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double distanciaPecorrida, combustivelGastos, consumoMedio;
		
		System.out.print("Distancia percorrida: ");
		distanciaPecorrida = sc.nextDouble();
		System.out.print("Combustível gasto: ");
		combustivelGastos = sc.nextDouble();
		
		consumoMedio = distanciaPecorrida / combustivelGastos;
		
		System.out.print("\nConsumo medio = " + String.format("%.3f", consumoMedio));
		
		sc.close();

	}

}
