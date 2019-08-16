import java.util.Scanner;

public class TPN2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int arreglo[] = new int[10];

        int negativos = 0;
        int positivos = 0;
        int ceros = 0;

        System.out.print("Ingrese los numeros del array\n");

        for (int i = 0; i < 10; i++) {

            arreglo[i] = leer.nextInt();

            if (arreglo[i]<0) {
                negativos++;
            } else if (arreglo[i]>0) {
                positivos++;

            }else if (arreglo[i] == 0){

                ceros++;

            }
        }System.out.println("Los numeros del array son");




            for (int i = 0; i < 10; i++) {
                System.out.print(arreglo[i] + "\t");

            }System.out.println(" \n  ");
        System.out.println("La cantidad de numeros positivos es:" + " " + positivos );
        System.out.println("La cantidad de numeros negativos es:"+ " "+ negativos);
        System.out.println("La cantidad de ceros es: " + " "+ ceros );

    }
}