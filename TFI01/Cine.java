package JAVAII;


import java.util.Scanner;

public class Cine {


    public static void main(String[] args) {


        Scanner sn = new Scanner(System.in);
        String nombre;
        int edad;
        String fila;
        int silla;
        Espectadores[] espectadores = new Espectadores[5];

        try {

            System.out.println("En el siguiente paso cargaremos los Espectadores");

            System.out.println("Ingrese nombre: ");
            nombre = sn.next();

            System.out.println("Ingrese edad:");
            edad = sn.nextInt();

            System.out.println("Ingrese fila:");
            fila = sn.next();

            System.out.println("Ingrese silla:");
            silla = sn.nextInt();

            espectadores[0] = new Espectadores(nombre, edad, fila, silla);

        } catch (Exception e) {

            System.out.print("ERROR EN EL INGRESO DE DATOS");
        }

    }
}
