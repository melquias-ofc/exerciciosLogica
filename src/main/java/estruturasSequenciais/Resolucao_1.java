package estruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double width, length, squareMeter;
		
		System.out.print("Enter the width of the land: ");
		width = sc.nextDouble();
		System.out.print("Enter the length of the land: ");
		length = sc.nextDouble();
		System.out.print("value per square meter: ");
		squareMeter = sc.nextDouble();
		
		double landArea = area(width, length);
		double landPrice = price(landArea, squareMeter);
		
		System.out.printf("\nLAND AREA = %.2f", landArea);
		System.out.printf("\nLAND PRICE = %.2f", landPrice);
		
		
		sc.close();
		

	}
	
	public static double area(double width, double length) {
		return width * length;
	}
	
	public static double price(double area, double squareMeter) {
		return area * squareMeter;
	}

}
