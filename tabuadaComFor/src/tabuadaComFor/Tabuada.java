package tabuadaComFor;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numerador;
		int resultado;

		System.out.print("Qual tabuada você deseja: ");
		numerador = sc.nextInt();
		System.out.println("");

		for (int i = 1; i <= 10; i++) {
			resultado = numerador * i;

			System.out.println( numerador + " X " + i + " = " + resultado);
		}
		
		
		sc.close();

	}

}
