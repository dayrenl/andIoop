package app;

import app.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidx al sistema");

        final List<Persona> Persones = new ArrayList<Persona>();
        
    
        System.out.println("Ingrese nombre, DNI y edad ");
        Persona p1 = new Persona();
        p1.nombre = Teclado.nextLine();
        p1.dni = Teclado.nextInt();
        p1.edad = Teclado.nextInt();
        Persones.add(p1);
        System.out.println("Sus datos son " +"Nombre " + p1.nombre + ", su DNI " + p1.dni + " y su edad " + p1.edad );
        System.out.println("Si desea modificar algún dato, presione 0");


        System.out.println("Ingrese nombre, DNI y edad ");
        Persona p2 = new Persona();
        p2.nombre = Teclado.nextLine();
        p2.dni = Teclado.nextInt();
        p2.edad = Teclado.nextInt();
        Persones.add(p2);

        System.out.println("Ingrese nombre, DNI y edad ");
        Persona p3 = new Persona();
        p3.nombre = Teclado.nextLine();
        p3.dni = Teclado.nextInt();
        p3.edad = Teclado.nextInt();
        Persones.add(p3);

    }
}