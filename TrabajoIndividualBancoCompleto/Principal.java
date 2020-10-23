package TrabajoIndividualBanco;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int option = 0;
        int x = 0;

        Set<CuentaCorriente> usuarios = new HashSet<CuentaCorriente>();

        CuentaCorriente cliente = new CuentaCorriente();
        CuentaCorriente cliente2 = new CuentaCorriente();// todavia no la utilice

        try {
            System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            System.out.printf("\t\tBienvenido a Banco Napoles\n");
            System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
            System.out.printf("Ingrese su Nro de Cuenta Por Favor ---> : \t");
            cliente.setNrocuentacorriente(leer.nextInt());
            usuarios.add(cliente);
            System.out.printf("\nIngrese Nombre del tirular:\t");
            cliente.setNombre(leer.next());
            System.out.printf("Ingrese Apellido del titular:\t");
            cliente.setApellido(leer.next());


            do {
                System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                System.out.printf("\t----- Que Desea Realizar -----\n\n");
                System.out.printf("1-- Ingresar Dinero\n 2-- Retirar Dinero\n 3-- Ver Saldo\n 4-- Realizar una tranferencia\n 5-- Ver Datos de la Cuenta \n\n");
                option = leer.nextInt();

                switch (option) {
                    case 1:
                        System.out.printf("\nIngrese el moto a Depositar--->:\t");
                        cliente.setIngresardinero(leer.nextInt());
                        System.out.printf("Monto depositado correctamente\n" + "Nro Cuenta:\t" + cliente.getNrocuentacorriente() + "\n" + "Su saldo es:\t" + cliente.getSaldo());
                        break;

                    case 2:
                        System.out.printf("\nIngrese el moto a Retirar--->:\t");
                        cliente.setRetirardinero(leer.nextInt());
                        break;

                    case 3:
                        System.out.printf("Cuenta Corriente nro:\t" + cliente.getNrocuentacorriente() + "\nNombre y Apellido del Titular:\t" + cliente.getNombre() + "\t" + cliente.getApellido() + "\n" + "Su saldo actual es:\t" + cliente.getSaldo() + "\n\n");
                        break;

                    case 4:
                        System.out.print("\nIngrese Nombre ");
                        cliente2.setNombre(leer.nextLine());
                        System.out.printf("\n y Apellido del Destinatario--->: ");
                        cliente2.setApellido(leer.nextLine());

                        System.out.printf("\nIngrese Nro de Cuenta Destino\n");
                        cliente2.setNrocuentacorriente(leer.nextInt());
                        System.out.printf("Ingrese monto a Transferir\n\n");
                        int monto = leer.nextInt();

                        if (cliente.getSaldo() >= monto && monto > 0) {
                            cliente.setTrasferencia(cliente, cliente2, monto);
                            System.out.printf("\n\nTransferencia realizada con Exito\n Nro Cuenta Origen:\t" + cliente.getNrocuentacorriente() + "\nNombre y Apellido del Titular:\t" + cliente.getNombre() + "\t" + cliente.getApellido() + "\nsaldo actual:\t" + cliente.getSaldo() + "\nNombre y Apellido del Destinatario:\t" + cliente2.getNombre() + "\t" + cliente2.getApellido() + "\nCuenta Destino:\t" + cliente2.getNrocuentacorriente() + "\nsaldo actual:\t" + cliente2.getSaldo() + "\n");
                        } else {
                            System.out.printf("Esta operacion no se puede realizar, No dispone de dinero en su cuenta, Ingrese dinero y vuelva a intentar\n");
                        }
                        break;

                    case 5:
                        if (cliente2.getSaldo() > 0) {
                            System.out.printf("\nLos Datos de las cuentas son:\n" + cliente.toString());
                            System.out.printf("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.printf("\n" + cliente2.toString());
                        } else {
                            System.out.printf("\nLos Datos de la cuenta son:\n" + cliente.toString());
                        }
                        break;
                }

                System.out.printf("\n\nDesea Realizar otra operacion? ---> 1- CONTINUAR  ******  9- SALIR\n");
                x = leer.nextInt();

            } while (x == 1);
        } catch (Exception e) {
            System.out.printf("SE INGRESO MAL UN DATO , VUELVA A INTENTARLO\n\n\n");
        }
        try {
            ObjectOutputStream flujoDeSalida = new ObjectOutputStream(new FileOutputStream(
                    "C:\\Users\\diego\\OneDrive\\Documentos\\Usuariosbanco\\Usuariosbanco.dat"));
            flujoDeSalida.writeObject(usuarios);
            flujoDeSalida.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

