import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TPN304 {

    public static void main(String[] arg) {

        Scanner leer = new Scanner(System.in);


        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                matriz[i][j] = (int) (Math.random() * 9);

                System.out.print("\t" + matriz[i][j]);

            }
            System.out.println(" ");

        }
        for (int x = 0; x < 3; x++) {

            for (int y = 0; y < 3; y++) {

                for (int m = 0; m < 3; m++) {

                    for (int l = 0; l < 3; l++) {

                        if (matriz[x][y] >= matriz[m][l]) {

                            matriz[x][y] = matriz[x][y];


                        } else {
                            int temp = matriz[m][l];
                            matriz[m][l] = matriz[x][y];
                            matriz[x][y] = temp;


                        }
                    }


                }


            }


        }
        System.out.print("\n");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(" \t"+ matriz[i][j]);
            }
            System.out.println(" ");



        }
    }
}










