package JAVAII;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);


        try {

        System.out.println("Ingrese un numero\n");
        int b = leer.nextInt();



            if (b % 2 == 0) {

                System.out.println("El numero\t" + b + "\tes Par");

            } else System.out.println("El numero\t"+ b + "\t es Impar");

        }catch (InputMismatchException e){

            System.out.println("ERROR solo se puede ingresar numeros!");

        }

    }
}
