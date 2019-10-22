package JAVAII;

public class Salas {

    private int capacidad;
    private String nombre;
    private String pelicula;



    Salas arreglo[] = new Salas[3];


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Salas{" +
                "capacidad=" + capacidad +
                ", nombre='" + nombre + '\'' +
                ", pelicula='" + pelicula + '\'' +
                '}';
    }
}

