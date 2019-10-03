package JAVAII;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int b;
        boolean f = false;

        do {
            System.out.println("Ingrese un numero\n");

            try {

                b = leer.nextInt();

                if (b % 2 == 0) {

                    System.out.println("El numero\t" + b + "\tes Par");
                } else System.out.println("El numero\t" + b + "\t es Impar");

                f = true;

            } catch (InputMismatchException e) {


                System.out.println("ERROR el valor introducido no es numerico, reingrese!");

                leer.nextLine();

            }

        } while (!f);
    }
}

