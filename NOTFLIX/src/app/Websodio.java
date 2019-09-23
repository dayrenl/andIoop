package app;

/**
 * Websodio
 */
public class Websodio extends Episodio {

    public Websodio (String tit) {
        super(tit);
    }

    public void Reproducir() {
        System.out.println("Reproduciendo " + this.titulo); 
    }
}