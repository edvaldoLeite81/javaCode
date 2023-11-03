package lacoDoWhile;

import java.util.Locale;
import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;
		double c;
		double f;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			c = sc.nextDouble();
			f = 9.0 * c / 5.0 + 32.0;
			System.out.printf("\nTemperatura de %.1f ºC em fahrenheit: %.1f ºF\n", c,f);
			System.out.print("\nQuer continuar? (s/n): ");
			resp = sc.next().charAt(0);
			
		}while (resp != 'n');
			

		System.out.println("\nFim de programa.");
		sc.close();

	}

}
