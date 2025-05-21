package estruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao_9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		System.out.print("Digite a medida A: ");
		A = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		B = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		C = sc.nextDouble();
		
		double areaQuadrado = Math.pow(A, 2);
		System.out.println("\nAREA DO QUADRADO = " + String.format("%.4f", areaQuadrado));
		
		double areaTriangulo = (A * B)/2;
		System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", areaTriangulo));
		
		double areaTrapezio = ((A + B) * C)/2;
		System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f", areaTrapezio));
		
		sc.close();

	}

}
