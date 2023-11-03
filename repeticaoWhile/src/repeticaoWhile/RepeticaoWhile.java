package repeticaoWhile;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int soma = 0;
		
		System.out.print("Defina um valor diferente de 0 ou 0 para finalizar: ");
		x = sc.nextInt();
		
		while( x != 0) {
			System.out.print("Digite outro valor ou 0 para finalizar: ");
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.print("A soma dos números digitados é: " + soma);
		
		sc.close();

	}

}
