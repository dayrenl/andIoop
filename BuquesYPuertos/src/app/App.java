package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicializando Buques y Puertos");

        Buque barquito = Buque.NuevoBuqueCargado();
        
        for (Contenedor contenedorcito : barquito.losContenedores) {
            switch(contenedorcito.puertoArribo.nroPuerto) {
                case 1: 
                Puerto.BuscarPuerto(1).contenedoresaRecibir.add(contenedorcito);
                break;
                case 2:
                Puerto.BuscarPuerto(2).contenedoresaRecibir.add(contenedorcito);
                break;
                case 3:
                Puerto.BuscarPuerto(3).contenedoresaRecibir.add(contenedorcito);
                break;
            }
        }
        //Por cada puerto voy a imprimir sus cantidades, size devuelve el elemento de la lista
        for (Puerto puertito : Puerto.PuertosDelMundo) {
            System.out.println("El puerto " + puertito.nombre + puertito.contenedoresaRecibir.size());
        }
        //Imprimo el peso del Buque
        System.out.println("El peso del barco " + barquito.nombre + "es" + barquito.calcularPeso());

        //Ahora saco el contenedor máximo
        Contenedor elConteMasPesado = barquito.getContenedorMaximo();

        System.out.println("El contenedor más pesado" + elConteMasPesado.idContenedor + ",cuyo peso es" + elConteMasPesado.peso)  ;
    }
}