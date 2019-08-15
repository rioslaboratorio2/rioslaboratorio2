package programacion.I;

public class Main {

    public static void main(String[] args) {

        int matriz[][] = new int[9][9];  // mi matrz de 9x9
        System.out.println("\n");

        for (int i =0; i<9; i++){   // este for me recorre y rellena el arreglo con el math.random
            for (int j=0; j<9; j++)


     // lo que hace math.random es rellenar el arreglo automaticamente de forma aleatoria sin ingresarle valores

                matriz [i][j]= (int)(Math.random()*100);
             }
        }



        // un forich es mas rapido de codificar y recorre exactamente el arreglo sin colocarle valores

        for (int[] dimension:matriz) {
            for (int elementos:dimension) {

                System.out.print("\t"+ elementos );


            }// realiza un salto de linea nada mas
            System.out.println("\n");
        }
    }
}