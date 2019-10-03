package JAVAII;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Ingrese un número entre-- 1 y 100:\n  ");

        try {

            num = input.nextInt();

            if (num>=1 && num<=100) System.out.println("El numero ingresado esta dentro del rango establecido es: " + num);

            else    System.out.println("El numero ingresado esta fuera del rango establecido\n");

        }catch (Exception e){

            System.out.println("Error el digito ingresado no es un numero\n");
        }


    }

}