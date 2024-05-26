import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.net.ConnectException;

public class BuscarPelicula {

    public Pelicula busquedaPelicula(int numero) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://swapi.py4e.com/api/films/" + numero + "/"))
                .timeout(Duration.ofMinutes(1))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Pelicula o = new Gson().fromJson(response.body(), Pelicula.class);
            if (0 == o.episode_id()){
                throw new ExceptionNoExist();
            }
            return o;
        } catch (ConnectException e) {
            System.out.println("No hay internet");
        }catch(Exception e){
                System.out.println(e.toString());
        }
        return null;
    }
}
