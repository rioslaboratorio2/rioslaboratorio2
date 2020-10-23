package TrabajoIndividualBanco;


import java.io.Serializable;

public class CuentaCorriente implements Serializable {

        // atributos .

    private String Nombre;
    private String Apellido;
    private double Saldo = 0;
    private int Nrocuentacorriente;

        // getters and setters

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public double getSaldo() {
        return Saldo;
    }

    public int getNrocuentacorriente() {
        return Nrocuentacorriente;
    }

    public void setNrocuentacorriente(int nrocuentacorriente) {
        Nrocuentacorriente = nrocuentacorriente;
    }


    public double setIngresardinero(double monto) {// ingresa dinero a una cuenta ya que solo ingresa no necesita nada mas
        this.Saldo = Saldo + monto;
        return Saldo;
    }

    public double setRetirardinero(double monto) { // metodo para retirar dinero pero corroborando siempre antes que haya dinero en la cuenta
        if (monto > getSaldo()) {
            System.out.printf("\nNo Diespone de dinero suficiente para realizar la operacion, Ingrese dinero y vuelva a intentarlo\n Su Saldo actual es:\t" + getSaldo());
        } if(monto <getSaldo()&& monto >0) {
            this.Saldo = Saldo - monto;
            System.out.printf("\nOperacion realizada con exito!\n" + "Monto retirado:\t" + monto + "\nSaldo actual:\t" + getSaldo());
        }else{
            System.out.printf("\nIngreso un monto Negativo y vuelva a intentarlo\n Su Saldo actual es:\t" + getSaldo());
        }
        return Saldo;
    }

    public void setTrasferencia(CuentaCorriente cuentaorigen, CuentaCorriente cuentadestino, double monto) {
        cuentaorigen.setRetirardinero(monto);
        cuentadestino.setIngresardinero(monto);
    }



    @Override
    public String toString() {
        return "Tipo: CuentaCorriente" + "\nNombre:\t" + getNombre() + "\nApellido:\t" + getApellido() + "\nSaldo:\t" + getSaldo() + "\nNrocuentacorriente:\t" + getNrocuentacorriente();
    }
}