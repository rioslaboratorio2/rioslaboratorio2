package JAVAII;

import java.util.Scanner;

public class depuracion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);


        int total;
        int valor;

            System.out.println("Ingrese un valor");
            int numero = leer.nextInt();

            System.out.println("Ingreseun segundo valor");
            int num = leer.nextInt();


            System.out.println("Que desea realizar 1-suma // 2-resta // 3-multiplicacion 4-salir");
            String opcion = leer.nextLine();

            switch (opcion) {

                case 1:
                    int suma = num + numero;
                    System.out.println("La suma realizada es:" + total);
                    break;

                case 2:
                    int resta = numero - num;
                    System.out.println("La resta realizada es" + resta);

                case 3:
                    int multi = num * num;
                    System.out.println("La multiplicacion de los dos numeros es:" + multi);


            }

        }

    }
}