package estruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao_3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name1, name2;
		int age1, age2;
		
		System.out.println("First person data: ");
		System.out.print("Name: ");
		name1 = sc.nextLine();
		System.out.print("Age: ");
		age1 = sc.nextInt();
		sc.nextLine(); //consome quebra de linha
		
		System.out.println("\nFirst person data: ");
		System.out.print("Name: ");
		name2 = sc.nextLine();
		System.out.print("Age: ");
		age2 = sc.nextInt();
		
		double media = average(age1, age2);
		
		System.out.print("\nThe average age of " + name1 + " and " + name2 + " is from " + String.format("%.1f", media) + " years");
		
		sc.close();
	}
	
	public static double average(int age1, int age2) {
		return (age1 + age2)/2.0;
	}

}
