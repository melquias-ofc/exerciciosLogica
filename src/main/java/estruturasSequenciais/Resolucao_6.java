package estruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao_6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double radius;
		System.out.print("Enter the value of the circle radius: ");
		radius = sc.nextDouble();
		
		System.out.print("\nAREA = " + String.format("%.3f", area(radius)));
		
		
		sc.close();
	}
	
	public static double area(double radius) {
		
		final double PI = 3.14159;
		return PI * Math.pow(radius, 2);
		
	}

}
