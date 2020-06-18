package aula1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class Case4Api {

	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, IOException, MalformedURLException {
		double dolar;
		
		String url_str = "https://prime.exchangerate-api.com/v5/7d7ae3c1f002c878db55d8d0/latest/USD";
		
		URL url = null;
		url = new URL(url_str);
		
		HttpURLConnection request = null;
		
		request = (HttpURLConnection) url.openConnection();
		request.connect();
		
		JsonParser jp = new JsonParser();
		JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
		JsonObject jsonobj = root.getAsJsonObject();
		jsonobj = jsonobj.get("conversion_rates").getAsJsonObject();
		
		Double valor_real_hoje = jsonobj.get("BRL").getAsDouble();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor em U$:");
		dolar = entrada.nextDouble();
		
		System.out.println("Valor em REAIS hoje: "+valor_real_hoje*dolar);
		
		entrada.close();
	}

}
