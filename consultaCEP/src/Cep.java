
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Cep {

    public static void main(String[] args) {
        String cep;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o cep para consultar: ");
        cep = sc.next();

        try {

            // Construa a URL da API ViaCEP
            String url = "https://viacep.com.br/ws/" + cep + "/json/";

            // Crie uma conexão HTTP
            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

            // Defina o método da requisição para GET
            connection.setRequestMethod("GET");

            // Obtenha a resposta da requisição
            int responseCode = connection.getResponseCode();

            if (responseCode == 200) { // 200 indica sucesso
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = reader.readLine()) != null) {
                    response.append(inputLine);
                }
                reader.close();

                // Exiba os dados do CEP
                System.out.println("*****************");
                System.out.println("Resposta em Json");
                System.out.println("*****************");
                System.out.println(response.toString());

                // Analise o JSON
                JsonObject json = JsonParser.parseString(String.valueOf(response)).getAsJsonObject();

                // Extraia os atributos
                String logradouro = json.get("logradouro").getAsString();
                String bairro = json.get("bairro").getAsString();
                String localidade = json.get("localidade").getAsString();
                String uf = json.get("uf").getAsString();


                // Exiba os atributos
                System.out.println("******************");
                System.out.println("Resposta formatada");
                System.out.println("******************");
                System.out.println("Logradouro: " + logradouro);
                System.out.println("Bairro: " + bairro);
                System.out.println("Localidade: " + localidade);
                System.out.println("UF: " + uf);


            } else {
                System.out.println("A consulta ao CEP falhou. Código de resposta: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
