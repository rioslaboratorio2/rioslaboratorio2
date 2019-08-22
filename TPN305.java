import java.util.Scanner;

public class TPN305 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);


        int array[][] = new int[3][3];


        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                System.out.println("Ingrese los numeros para llenar el array");
                array[i][j]=leer.nextInt();

            }

            System.out.println(" ");

        }
        for (int x = 0; x < 3; x++) {

            for (int y = 0; y < 3; y++) {

                for (int m = 0; m < 3; m++) {

                    for (int l = 0; l < 3; l++) {

                        if (array[x][y] <= array[m][l]) {

                            array[x][y] = array[x][y];


                        } else {
                            int temp = array[m][l];
                            array[m][l] = array[x][y];
                            array[x][y] = temp;


                        }
                    }


                }


            }


        }
        System.out.print("\n");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(" \t"+ array[i][j]);
            }
            System.out.println(" ");



        }
    }
}
