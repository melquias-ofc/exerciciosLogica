package estruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao_003 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, valor3;
		
		System.out.print("Primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.print("Segundo valor: ");
		valor2 = sc.nextInt();
		System.out.print("Terceiro valor: ");
		valor3 = sc.nextInt();
		
		System.out.print("\nMENOR = " + menor(valor1, valor2, valor3));
		
		
		sc.close();
	
	}

	public static int menor(int number1, int number2, int number3) {
		
		
		if (number1 < number2 && number1 < number3) {
			
			return number1;
		}
		else if(number2 < number3) {
			
			return number2;
		}
		else {
			return number3;
		}
		
		
	}
}
