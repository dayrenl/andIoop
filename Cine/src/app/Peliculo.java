package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Peliculo
 */
public class Peliculo {

    public String titulo;
    public int duracion;
    public int edadMinima;
    public String director;

    public Peliculo(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    List<Peliculo> peliculas = new ArrayList<Peliculo>();

    public void agregarPelis() {

        Peliculo peli = new Peliculo("Corriendo bajo la luna ", 90, 16, "Juanito Alimaña ");
        peliculas.add(peli);

        Peliculo peli1 = new Peliculo("Surfeando sobre Marte ", 85, 18, "Charles Manson ");
        peliculas.add(peli1);

        Peliculo peli2 = new Peliculo("Bailando con las estrellas ", 60, 12, "Hannibal Lecter ");
        peliculas.add(peli2);

        Peliculo peli3 = new Peliculo("La vie en rose ", 70, 10, "Dorángel Vargas ");
        peliculas.add(peli3);


        }
    
}