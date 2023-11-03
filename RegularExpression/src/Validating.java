
public class Validating {

	// valida nome
	public static boolean validateFirstName(String firstName) {

		return firstName.matches("[A-ZÁ-Ú][a-zá-úA-ZÁ-Ú]*");
		//1º Expressão - [A-ZÁ-Ú] Primeira letra entre A e Z. Primeira letra pode ter acento
		//2º Expressão - [a-zá-úA-ZÁ-Ú] A partir da segunda letra, pode ser a-z, á-ú, aceita acento, A-Z aceita letras maiúsculas, Á-Ú acento em letra maiúscula
		//3º Expressão - * quantidade indefinida de letras para a segunda expressão
	}

	// valida sobrenome
	public static boolean validateLastName(String lastName) {
		
		return lastName.matches("[a-zA-Zá-úÁ-Ú]+([\\s][a-zA-Zá-úÁ-Ú]+)*");
		//1º Expressão [a-zA-Zá-úÁ-Ú] primeira letra maiúscula ou minúscula ou letra acentuada min. ou mai.
		//2º Expressão (\\s[a-zA-ZÁ-Ú]+) aceita espaço  * quantidade de repetição indefinida do bloco
	}

	// valida endereco
	public static boolean validateAddress(String address) {
		return address.matches("[a-zA-Zá-úÁ-Ú]+([\\s][a-zA-Zá-úÁ-Ú]+)*+([\\s][0-9]{1,5})");
		//2º expressão ([\\s][a-zA-Zá-úÁ-Ú]+)* = depois do espaço, letras minúsculas ou maiúsculas acentuadas. O bloco se repete * vezes
		//última expressão ([\\s][0-9]{1,5}) = depois do espaço, contém do 0-9, entre 1 e 5 dígitos
		
	}

	// valida cidade
	public static boolean validateCity(String city) {
		return city.matches("[a-zA-Zá-úÁ-Ú]+([\\s][a-zA-Zá-úÁ-Ú]+)*");
	}

	// valida estado
	public static boolean validateState(String state) {
		return state.matches("([a-zA-Z]{1}+[a-zA-Z]{1})");
		// de a-z min. ou mai. 1 dígito + de a-z min. ou mai. 1 dígito
	}

	// valida cep
	public static boolean validateCep(String cep) {
		return cep.matches("([0-9]{8})");
	}

	// valida telefone
	public static boolean validatePhone(String phone) {
		return phone.matches("([1-9]{2})+[9]+([0-9]{8})");
		//1º expressão ([1-9]{2}) = de 1 a 9, 2 dígitos
		//2º expressão [9] = dígito deve ser 9
		//3º expressão ([0-9]{8}) = de 0-9, 8 dígitos
	}
}
