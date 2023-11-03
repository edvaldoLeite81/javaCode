package irrpf;

import java.util.Locale;
import java.util.Scanner;

public class IRRPF {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double aux, renda,ir;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da renda: ");
		renda = sc.nextDouble();
	
		if(renda > 0 && renda < 2826.66) {
			System.out.println("IR a pagar: ISENTO");
		}else if(renda > 2826.66 && renda < 3751.06) {
			ir = renda;

			System.out.println("IR a pagar: " + ir);
		}
		
		sc.close();

	}

}
