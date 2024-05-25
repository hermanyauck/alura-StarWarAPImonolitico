import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Scanner;

public class Principal {
   public static void main(String[] args){
       System.out.print("De la 1 hasta la 6, eleji una peli de Star War: ");
       Scanner lectura = new Scanner(System.in);
       int numeroDePelicula = Integer.valueOf(lectura.nextLine());
           Pelicula peli = new BuscarPelicula().busquedaPelicula(numeroDePelicula);
           System.out.println("GSON es el sigueinte:");
           System.out.println(peli);
   }
}
