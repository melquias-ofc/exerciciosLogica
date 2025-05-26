package estruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao_002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.print("Coeficiente a: ");
		a = sc.nextDouble();
		System.out.print("Coeficiente b: ");
		b = sc.nextDouble();
		System.out.print("Coeficiente c: ");
		c = sc.nextDouble();
		
		double delta = calcularDelta(a, b, c);
		
		if(delta > 0) {
			double raizes[] = calcularRaizes(b, a, delta);
			System.out.printf("\nX1 = %.4f", raizes[0]);
			System.out.printf("\nX1 = %.4f", raizes[1]);
		}
		else if(delta == 0) {
			double x = -b / (2 * a);
			System.out.printf("\nX1 e X2 = %.4f", x);
		}
		else {
			System.out.print("\nNÃO POSSUI RAIZES REAIS");
		}
		
		
		sc.close();
	}
	
	public static double calcularDelta(double a, double b, double c) {
		return (Math.pow(b, 2) - 4 * a * c);
	}
	
	public static double[] calcularRaizes(double b, double a, double delta) {
		
		double[] raizes = new double[2];
		
		raizes[0] = (-b + Math.sqrt(delta))/(2 * a);
		raizes[1] = (-b - Math.sqrt(delta))/(2 * a);
		
		return raizes;
	}

}
