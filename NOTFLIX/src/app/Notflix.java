package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Notflix
 */
public class Notflix {

    public static List<Pelicula> Peliculas = new ArrayList<Pelicula>();
    public static List<Serie> Series = new ArrayList<Serie>();

    public static Serie getSerie(String nombre) {
        for (Serie serie : Series) {
            if (serie.nombre.equals(nombre))
                ;
            return serie;

        }
        return null;
    }

    public static void LimpiarCatalogos() {
        Notflix.Series.clear();
        Notflix.Peliculas.clear();
    }

    public static void InicializarCatalogo() {
        Notflix.AgregarDepresion();
    }

    public static void AgregarDepresion() {

        Serie depresion = new Serie();
        depresion.nombre = "Depresión";
        depresion.anio = 1997;
        depresion.genero = "Drama";

        Temporada t1 = new Temporada(1);
        depresion.temporadas.add(t1);

        Episodio ep = new Episodio("Llorar");

        ep.nroEpisodio = 2;

        ep.duracion = 40;

        t1.episodios.add(ep);

        ep = new Episodio("Sufrir");

        ep.nroEpisodio = 3;

        ep.duracion = 35;

        t1.episodios.add(ep);

        ep = new Episodio("Ansiedad");

        ep.nroEpisodio = 4;

        ep.duracion = 32;

        t1.episodios.add(ep);

        Websodio ep1 = new Websodio("Ataque de pánico");

        ep1.nroEpisodio = 5;
        ep1.duracion = 7;

        t1.episodios.add(ep1);

        Notflix.Series.add(depresion);
    }
}