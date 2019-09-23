package app;

/**
 * Episodio
 */
public class Episodio {

    public int nroEpisodio;
    public String titulo;
    public int duracion; 

    public void Reproducir() {
        System.out.println("Reproduciendo " + this.titulo);
    }
    public Episodio (String tit) {
        this.titulo = tit;
    }
}