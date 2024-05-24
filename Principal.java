import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class Principal {
   public static void main(String[] args){
       System.out.println("hola");
       URI direccion = URI.create("https://swapi.py4e.com/api/films/1");

       HttpClient client = HttpClient.newHttpClient();
       HttpRequest request = HttpRequest.newBuilder()
               .uri(direccion)
               .build();

       try {
           HttpResponse<String> response = client
                   .send(request, HttpResponse.BodyHandlers.ofString());
           return new Gson().fromJson(response.body(), Pelicula.class);
       } catch (Exception e) {
           throw new RuntimeException("No encontré esa película.");
       }
   }
}
