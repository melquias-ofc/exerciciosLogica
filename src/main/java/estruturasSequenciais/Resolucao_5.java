package estruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double unitPriceProduct, quantity, money;
		
		System.out.print("Unit price of the product: ");
		unitPriceProduct = sc.nextDouble();
		System.out.print("Quantity purchased: ");
		quantity = sc.nextDouble();
		System.out.print("Money received: ");
		money = sc.nextDouble();
		
		double totalValue = total(unitPriceProduct, quantity);
		
		System.out.print("\nCHANGE = " + change(totalValue, money));
		
		sc.close();
	
	}
	
	public static double total(double value, double quantity) {
		return value * quantity;
	}
	
	public static double change(double total, double money) {
		return money - total;
	}

}
