package numeroEDivisorComFor;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		int result;

		System.out.println("Qual número analisar os seus respectivos divisores: ");
		x = sc.nextInt();

		for (int i = 1; i <= x; i++) {

			result = x / i;
			
			if (x % i == 0) {
				System.out.println(x + " / " + i + " = " + result);
			}

		}

		sc.close();

	}

}
