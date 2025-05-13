package estruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, height;
		
		System.out.print("Base of the rectangle: ");
		base = sc.nextDouble();
		System.out.print("Height of the rectangle: ");
		height = sc.nextDouble();
		
		double area = area(base, height);
		double perimeter = perimeter(base, height);
		double diagonal = diagonal(base, height);
		
		System.out.println("\nAREA = " + String.format("%.4f", area));
		System.out.println("PERIMETER = " + String.format("%.4f", perimeter));
		System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
		
		sc.close();

	}
	
	public static double area(double base, double height) {
		return base*height;
	}
	
	public static double perimeter(double base, double height) {
		return 2 * (base + height);
	}
	
	public static double diagonal(double base, double height) {
		return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
	}

}

