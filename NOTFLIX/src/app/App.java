package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicializando Catálogo...");

        Notflix.InicializarCatalogo();

        Serie depresion = Notflix.getSerie("Depresión");

        Temporada laMejorTemporada = depresion.getTemporada(1);

        Episodio episodito;

        episodito = laMejorTemporada.getEpisodio("Ataque de pánico");

        episodito.Reproducir();

    }
}