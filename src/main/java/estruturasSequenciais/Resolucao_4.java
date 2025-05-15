package estruturasSequenciais;

import java.util.Scanner;

public class Resolucao_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Enter the first number: ");
		x = sc.nextInt();
		System.out.print("Enter the second number: ");
		y = sc.nextInt();
		
		System.out.print("\nSUM = " + sum(x, y));
		
		sc.close();
		
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}

}
