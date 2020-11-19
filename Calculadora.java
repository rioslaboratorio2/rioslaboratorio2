import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    public static void main(String[] args) {

        Marcocalculadora marquito = new Marcocalculadora();
        marquito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marquito.setVisible(true);

    }
}
class Marcocalculadora extends JFrame {

    public  Marcocalculadora(){
        setTitle("Calculadora");
        setBounds(500,300,450,300);

        LaminaCalculadora lamina = new LaminaCalculadora();
        add(lamina);
       // pack();  // al indicarle el metodo pack le decimos que  se tiene que adapatar a lo contiene dentro
    }
}
class LaminaCalculadora extends  JPanel{

    public LaminaCalculadora(){
        principio = true;

        setLayout(new BorderLayout());

         frente  = new JButton("0");

        frente.setEnabled(false);

        add(frente,BorderLayout.NORTH);

         lamina2 = new JPanel();

        lamina2.setLayout(new GridLayout(4,4));

        ActionListener insertar = new insertanumero();
        ActionListener orden = new Accionorden();

        ponerbotones("7",insertar);
        ponerbotones("8",insertar);
        ponerbotones("9",insertar);
        ponerbotones("x",orden);
        ponerbotones("4",insertar);
        ponerbotones("5",insertar);
        ponerbotones("6",insertar);
        ponerbotones("-",orden);
        ponerbotones("1",insertar);
        ponerbotones("2",insertar);
        ponerbotones("3",insertar);
        ponerbotones("+",orden);
        ponerbotones("/",orden);
        ponerbotones("0",insertar);
        ponerbotones(" ",insertar);
        ponerbotones("=",orden);

        add(lamina2,BorderLayout.CENTER);

        operacionfinal = "=";


    }
    private void ponerbotones (String botons , ActionListener oyente){
        JButton boton = new JButton(botons);
        boton.addActionListener(oyente);

        lamina2.add(boton);


    }

    private class insertanumero implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada =  e.getActionCommand();
            if(principio){
                frente.setText("");
                principio = false;

            }

            frente.setText(frente.getText()+entrada);
        }


    }
    private class Accionorden implements ActionListener { // aca eliminamos el cero que aparece de arranque sin que precionemos ni un boton
        @Override
        public void actionPerformed(ActionEvent e) {
            String operacion = e.getActionCommand();

            calcular(Double.parseDouble(frente.getText()));
            operacionfinal = operacion;
            principio = true;

        }

        public void calcular(double x) { // metodo que realiza todas las operaciones de la calculadora

            if (operacionfinal.equals("+")) { // suma
                resultado += x;
                System.out.print(resultado);

            } else if (operacionfinal.equals("=")) { // resultado
                resultado = x;
            } else if (operacionfinal.equals("-")) { // resta
                resultado -= x;
            } else if (operacionfinal.equals("/")) { //division
                resultado /= x;

            } else if (operacionfinal.equals("x")) { // multiplicacion
                resultado *= x;
            }
             frente.setText(""+resultado);
        }
    }

    private JPanel lamina2;
    private JButton frente;
    private  boolean principio ;
    private double resultado;
    private String operacionfinal;
}