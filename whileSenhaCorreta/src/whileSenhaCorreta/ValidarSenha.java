package whileSenhaCorreta;

import java.util.Scanner;

public class ValidarSenha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha = 2022;
		int aux = 0;
		int repeat = 0;
		String frase = "Acesso Negado!";

		System.out.print("Digite a senha: ");
		aux = sc.nextInt();

		if (aux == senha) {
			repeat = 3;
			frase = "Acesso liberado!";
		}

		while (repeat < 2) {

			System.out.print("Senha incorreta, digite novamente: ");
			aux = sc.nextInt();
			
			if (aux == senha) {
				repeat = 3;
				frase = "Acesso liberado!";
			}
			repeat += 1;

		}

		System.out.println(frase);

		sc.close();
	}

}
