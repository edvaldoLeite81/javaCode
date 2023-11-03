package parOuImpar;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nDigite um número para saber se é par ou ímpar: ");
		number = sc.nextInt();
		
		if (number %2 == 0) {
			System.out.println("\nO número " + number + " é par.");
		}else {
			System.out.println("\nO número " + number + " é ímpar.");
		}
		sc.close();
	}

}
