package JAVAII;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String a;
        int b;


        System.out.println("Ingrese su nombre");
        a = leer.nextLine();

        System.out.println("Ingrese su edad");
        b = leer.nextInt();


        if (b < 18 && b > 0) {
            System.out.println(a + " " + "Tiene" + " " + b + " " + "anos " + " " + "todavia es menor de edad");

        }
        if (b >= 18) {

            System.out.println(a + " " + "Tiene" + " " + b + " " + "anos" + " " + "ya es mayor de edad");


        } else {
            System.out.println(a+" "+"La edad ingresada no es correcta");

        }
    }
}