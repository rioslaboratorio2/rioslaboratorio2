import java.util.Random;

public class TPN301 {
    public static void main(String[] args) {


        int numeros []= new int [100];

        Random randomizer = new Random(System.nanoTime());

            for (int i =0; i<numeros.length; i++){

                numeros[i] = randomizer.nextInt(numeros.length);

            }
            for (int elemento: numeros){

                System.out.println("\n");
                System.out.print(elemento+",");
            }
        System.out.println(" ");

    }

}
