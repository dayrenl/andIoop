package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Inicializando Persona");

        System.out.println("Ingrese su nombre ");
        String nombre = Teclado.nextLine();

        System.out.println("Ingrese su edad ");

        int edad = Teclado.nextInt();

        System.out.println("Ingrese su DNI ");
        int dni = Teclado.nextInt();

        char sexo = 'F';

        System.out.println("Ingrese su peso ");
        double peso = Teclado.nextDouble();

        System.out.println("Ingrese su altura ");
        double altura = Teclado.nextDouble();

        Persona p1 = new Persona();
        p1.nombre = nombre;
        p1.edad = edad;
        p1.dni = dni;
        p1.sexo = sexo;
        p1.peso = peso;
        p1.altura = altura;

    }
}