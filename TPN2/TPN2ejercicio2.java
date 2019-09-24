import java.util.Scanner;

public class TPN2ejercicio2 {


    public static void main(String[] args) {


        Scanner leer = new Scanner(System.in);

        int arreglo[] = new int[10];


        for (int i = 0; i < 10; i++) {

            System.out.println((+i)+"\tIngrese los numeros para el array"+i);
            arreglo[i] = leer.nextInt();
        }

        int pares = 0;
        int media = 0;

        for (int i = 0; i<10; i++) {

            if (i % 2 == 0 && i != 0) {


                pares++;

                media = media + arreglo[i];


            }

        }            System.out.println("La media de los numeros pares es:" + " " +pares/media);

    }
}