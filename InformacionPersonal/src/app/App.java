package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Inicializando Cuenta ");

        Cuenta miCta = new Cuenta();

        //Accediendo desde variable de instancia
        miCta.titular = "Pepe";

        System.out.println("El titular es " + miCta.titular);

    }
}