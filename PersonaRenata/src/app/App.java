package app;

import java.util.*;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Para agregar una persona presione 1.");
        System.out.println("Para eliminar una persona presione 2.");
        System.out.println("Para modificar una persona presione 3.");
        System.out.println("Para ver el listado presione 4.");
        System.out.println("Para salir del sistema, presione 5");

        int opcion = Teclado.nextInt();
        Teclado.nextLine();

        while (opcion <= 4) {

            switch (opcion) {
            case 1:
                alta();
                break;

            case 2:
                baja();
                break;

            case 3:
                modifica();
                break;

            case 4:
                listar();
                break;

            default:
                System.out.println("La opcion no es correcta.");
                break;
            }

            System.out.println("Para agregar una persona presione 1.");
            System.out.println("Para eliminar una persona presione 2.");
            System.out.println("Para modificar una persona presione 3.");
            System.out.println("Para ver el listado presione 4.");

            opcion = Teclado.nextInt();
            Teclado.nextLine();
        }

    }

    public static void alta() {
        Persona p = new Persona();
        System.out.println("Ingrese el nombre:");
        p.nombre = Teclado.nextLine();
        System.out.println("Ingrese el DNI:");
        p.dni = Teclado.nextInt();
        Teclado.nextLine();
        System.out.println("Ingrese la edad:");
        p.edad = Teclado.nextInt();
        Teclado.nextLine();
        Abm.Personas.add(p);
    }

    public static void baja() {
        System.out.println("Ingrese el nombre:");
        String n = Teclado.nextLine();
        System.out.println("Ingrese el DNI:");
        int id = Teclado.nextInt();
        Teclado.nextLine();

        Persona pencontrado = null;
        for (Persona p : Abm.Personas) {
            if (p.nombre.equals(n) && id == p.dni) {
                pencontrado = p;
            }
        }
        if (pencontrado != null) {
            Abm.Personas.remove(pencontrado);
        }
    }

    public static void modifica() {
        System.out.println("Ingrese el nombre:");
        String n = Teclado.nextLine();
        System.out.println("Ingrese el DNI:");
        int id = Teclado.nextInt();
        Teclado.nextLine();

        for (Persona p : Abm.Personas) {
            if (n == p.nombre && id == p.dni) {
                System.out.println("Ingrese el nuevo nombre:");
                p.nombre = Teclado.nextLine();
                System.out.println("Ingrese el nuevo DNI:");
                p.dni = Teclado.nextInt();
                Teclado.nextLine();
                System.out.println("Ingrese la nueva edad:");
                p.edad = Teclado.nextInt();
                Teclado.nextLine();
                Abm.Personas.add(p);
            }
        }

    }

    public static void listar() {
        for (int i = 0; i < Abm.Personas.size(); i++) {
            System.out.println(Abm.Personas.get(i));
        }
    }



}
