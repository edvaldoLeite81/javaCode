package consultaCEP;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		 Scanner sc = new Scanner(System.in);
	        
		 	System.out.println("");
	        System.out.print("Digite o CEP que deseja consultar: ");
	        String cep = sc.next();
	        
	        String url = "https://viacep.com.br/ws/" + cep + "/json/";
	        
	        HttpClient client = HttpClient.newHttpClient();
	        HttpRequest request = HttpRequest.newBuilder().uri(new URI(url)).build();
	        
	        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
	        
	        if (response.statusCode() == 200) {
	            System.out.println(response.body());
	        } else {
	            System.out.println("Erro ao consultar CEP: " + response.statusCode());
	        }
	        
	     sc.close();

	}

}
