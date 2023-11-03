package numerosMultiplos;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {

		int numA, numB, mult;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		numA = sc.nextInt();

		System.out.print("\nDigite o segundo número: ");
		numB = sc.nextInt();

		if (numA > numB) {
			mult = numA / numB;
		} else {
			mult = numB / numA;
		}
		
		
		if (mult * numA == numB || mult * numB == numA) {
			System.out.printf("\nOs Números %d e %d, são múltiplos ", numA, numB);
			System.out.println("\nMultipicador/Divisor: " + mult);
		}else {
			System.out.printf("\nOs Números %d e %d, NÃO SÃO múltiplos", numA,numB);
		}

		sc.close();

	}

}
