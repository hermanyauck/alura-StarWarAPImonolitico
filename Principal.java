import java.util.Scanner;

public class Principal {
   public static void main(String[] args){
       System.out.print("De la 1 hasta la 9, eleji una peli de Star War: ");
       Scanner lectura = new Scanner(System.in);
       int numeroDePelicula = Integer.valueOf(lectura.nextLine());
           Pelicula peli = new BuscarPelicula().busquedaPelicula(numeroDePelicula);
           System.out.println("GSON es el sigueinte:");
           System.out.println(peli);
   }
}
