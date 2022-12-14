
package boletin15;

public class Boletin15 {

    public static void main(String[] args) {
        Multimedia multi= new Multimedia();
        Pelicula peli = new Pelicula("ActorPrincipal","ActrizPrincipal","Titulo","Autor","Formato","Duración");
        Disco disc = new Disco("Genero","Titulo","Autor","Formato","Duracion");
        System.out.println("DIsco: " + disc.toString() + "\n Pelicula: " + peli.toString());
    }
}