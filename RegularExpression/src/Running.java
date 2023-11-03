import java.util.Scanner;

public class Running {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu primeiro nome: ");
		String firstName = scanner.nextLine();
		System.out.println("Digite seu sobrenome: ");
		String lastName = scanner.nextLine();
		System.out.println("Digite seu endereço: ");
		String address = scanner.nextLine();
		System.out.println("Digite sua cidade: ");
		String city = scanner.nextLine();
		System.out.println("Digite seu estado: ");
		String state = scanner.nextLine();
		System.out.println("Digite seu cep: ");
		String cep = scanner.nextLine();
		System.out.println("Digite seu telefone: ");
		String phone = scanner.nextLine();
		

		System.out.printf("%nResultado das Validações: ");

		if (!Validating.validateFirstName(firstName))
			System.out.println("Nome Inválido");

		else if (!Validating.validateLastName(lastName))
			System.out.println("Sobrenome Inválido");
		
		else if (!Validating.validateAddress(address))
			System.out.println("Endereço Inválido");
		
		else if (!Validating.validateCity(city))
			System.out.println("Cidade Inválida");
		
		else if (!Validating.validateState(state))
			System.out.println("Estado Inválido");
		
		else if (!Validating.validateCep(cep))
			System.out.println("Cep Inválido");
		
		else if (!Validating.validatePhone(phone))
			System.out.println("Telefone Inválido:");
			
		else
			System.out.println("Tudo Certo! Obrigado.");
	}

}// fim da classe Running
