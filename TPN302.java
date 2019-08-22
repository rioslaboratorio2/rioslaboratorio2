package JAVAII;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.Scanner;

public class TPN302 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);


        int array[][] = new int[3][3];  // En esta lines creo  la matriz a rellenar.

        for (int i = 0; i < 3; i++) {       //creo mi bucle for para el recorrido y carga de la matriz.

            for (int j = 0; j < 3; j++) {

                array[i][j] = ( int ) ( Math . random () * 100 ); //  uso la funcion math. random,
                                                                  //  para rellenar de forma aleatoria mi matriz


                System.out.print("\t"+array[i][j]);   // uso un print para la impresion de mi matriz.
            }
            System.out.println(" "); // un nuevo print solamenta para generar espacio y que mi matriz quede mas ordenada.
        }



    }
}


