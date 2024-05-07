import java.net.URL;
import java.net.HttpURLConnection;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Conversor {
    public static void ConversorMoeda(String moedaOrigem, String moedaDestino, Scanner scanner) {
        try {
            String apiKey = "775f31b7a482f4f7d8df22f4";
            String url_str = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + moedaOrigem;

            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            JsonObject conversionRates = jsonobj.getAsJsonObject("conversion_rates");

            if (!conversionRates.has(moedaDestino)) {
                System.out.println("Moeda inválida.");
                return;
            }

            double taxaDeCambio = conversionRates.get(moedaDestino).getAsDouble();

            System.out.print("Digite o valor: ");
            double valor = scanner.nextDouble();

            double valorConvertido = valor * taxaDeCambio;

            System.out.println("----Resultado----");
            System.out.println(" --- " + valor + " --- " + moedaOrigem + " Igual a " + valorConvertido + " " + moedaDestino);
            System.out.println("***********************************");
            System.out.println("\nPressione Enter para voltar ao menu principal...");
            scanner.nextLine();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("*********************************** --ERRO-- ***********************************");
            System.out.println("Erro: " + e.getMessage());
            System.out.println("***********************************");
            System.exit(1);
        }
    }
}