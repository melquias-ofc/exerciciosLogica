package estruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao_10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horasSegundos;
		
		System.out.print("Digite a duracao em segundos: ");
		horasSegundos = sc.nextInt();
		
		int horas = horasSegundos / 3600;
		int resto = horasSegundos % 3600;
		int minutos = resto / 60;
		int segundos = resto % 60;
		 
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();

	}

}
