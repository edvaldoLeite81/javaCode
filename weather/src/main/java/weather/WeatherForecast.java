package weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherForecast {
    private static final String API_KEY = "1cc15ab1dc6948a9be9d62cbee0b3249";
    private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String city; 
    	
        System.out.println("");
    	System.out.print("Qual cidade deseja consultar a previsão do tempo: ");
    	city = sc.nextLine();
    	
        String apiUrl = String.format(API_URL, city, API_KEY);

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String response = in.lines().reduce("", (acc, line) -> acc + line);
                in.close();

                JSONObject jsonResponse = new JSONObject(response);
              
                JSONArray weatherArray = jsonResponse.getJSONArray("weather");
                JSONObject weather = weatherArray.getJSONObject(0);
                String description = weather.getString("description");

                JSONObject main = jsonResponse.getJSONObject("main");
                double temperature = main.getDouble("temp");
                int humidity = main.getInt("humidity");
                

                System.out.println("");
                System.out.printf("Previsão do tempo para %s:\n", city.toUpperCase());
                System.out.printf("- Condição: %s\n", description.toUpperCase());
                System.out.printf("- Temperatura: %.1f°C\n", temperature);
                System.out.printf("- Umidade: %d%%\n", humidity);
            } else {
                System.out.println("Erro ao consultar API: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
