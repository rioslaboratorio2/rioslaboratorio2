package JAVAII;

import java.util.Scanner;

public class TPN303 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String [][] array = new String[3][3];  // inicializacion de mi matriz


        for(int columna = 0; columna < 3; columna++) {   // recorrido y relleno de la misma por medio del usuario

            System.out.println("Ingrese su Nombre:");
            array[columna][0]=leer.next();

            System.out.println("Ingrese su Dni: ");  // los tres datos a ingresar y que se guarda en la matriz.
            array[columna][1]=leer.next();

            System.out.println("Ingrese su Edad:");
            array[columna][2]=leer.next();
        }
        System.out.println("\n\n** Datos ingresados **\n");  // uso este print para que quede mas ordenado los datos a expresar.

        for (String columna[]:array) { // ultimo for donde me recoorre los datos guardados y finalizados de la matriz para imprimirlo por pantalla.


            System.out.print("Nombre:\t"+columna[0]+"\t"+"\n");

            System.out.print("Dni:\t"+columna[1]+"\t"+"\n");    // estos 3 print sonla impresion de los datos ingresados en la matriz.

            System.out.print("Edad:\t"+columna[2]+"\n"+"\n");
        }
        System.out.println("\n"); // un prin para provocar espacion final solamente .

    }

}
