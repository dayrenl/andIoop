package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Temporada
 */
public class Temporada {

    public int nroTemporada;
    public List<Episodio> episodios = new ArrayList<Episodio>();
    public Temporada (int nro){
        this.nroTemporada = nro;
    }

    public Episodio getEpisodio(String titulo) {

        for (Episodio capitulo : this.episodios) {
            if (capitulo.titulo.equals (titulo)) {
                return capitulo;

            }
        }
        return null;
    }

    public Episodio getNumeroEpisodio(int nroEpisodio) {

        for (Episodio numero : this.episodios) {
            if (numero.nroEpisodio == nroEpisodio) {
                return numero;
            }
        }
        return null;
    }

}