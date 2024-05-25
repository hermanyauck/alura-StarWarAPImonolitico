import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class Principal {
   public static void main(String[] args){
       try {
           HttpClient client = HttpClient.newHttpClient();
           HttpRequest request = HttpRequest.newBuilder()
                   .uri(URI.create("http://swapi.py4e.com/api/films/1/"))
                   .timeout(Duration.ofMinutes(2))
                   .build();
           HttpResponse<String> response = client
                   .send(request, HttpResponse.BodyHandlers.ofString());

           System.out.println(response);
           System.out.println(response.body());
           Pelicula peli = new Gson().fromJson(response.body(), Pelicula.class);
           System.out.println("GSON es el sigueinte:");
           System.out.println(peli);
       } catch (Exception e) {
           throw new RuntimeException("No encontré esa película.");
       }
   }
}
