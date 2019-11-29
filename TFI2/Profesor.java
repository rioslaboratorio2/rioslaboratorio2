package JAVAII;

public class Profesor extends Persona{


    private static double basico;
    private static double antiguedad;







    public static void calcularsueldo(){

        double sueldo = ((((10 * basico) / 100) * antiguedad) + basico);

    }
}
