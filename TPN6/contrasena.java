package JAVAII;

import java.util.Scanner;

public class contrasena {

    public static void main(String[] args) {


        Scanner leer = new Scanner(System.in);

        //Se ingresan los datos.

        System.out.print("Ingrese la cantidad de contraseñas a crear:\n ");
        int cantidad = leer.nextInt();

        System.out.print("Cuantos caracteres por contraseña:\n ");
        int cantidades =leer.nextInt();

        crearcontrasena [] password = new crearcontrasena[cantidad];       //Se crea un arreglo de objetos.

        //Se crea la cantidad de objetos "contraseña" que indico el usuario al inicio.

        for(int i = 0 ; i < cantidad ; i++) {
            password[i] = new crearcontrasena(cantidades);
        }

        //Se imprime una lista con las contraseñas y los datos ingresados.

        System.out.println( "\nContraseñas \t ----Cant. Caracteres \t---- Nivel de Seguridad" +
                "\n-----------------------------------------");

        for (int i=0;   i<cantidad; i++){
            if (password[i].getSeguro()){       //Se verifica si el password es o no seguro.
                System.out.println(password[i].getContraseña() + "\t\t" + password[i].getlargoCont() + "\t\tSegura");
            }else   System.out.println(password[i].getContraseña() + "\t\t" + password[i].getlargoCont() + "\t\tNo Segura");

        }

    }



}

