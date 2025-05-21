package estruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao_7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		double valorHora, horasTrabalhadas, pagamento;
		
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Valor por hora: ");
		valorHora = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();
		
		pagamento = valorHora * horasTrabalhadas;
		
		System.out.print("\nO pagamento para " + name + " deve ser " + String.format("%.2f", pagamento));
		
		sc.close();
		
	
	}

}
