package traviscimafer;
import javax.swing.*;
/**
 *
 * Autora:Mafer Delgado
 */
public class TravisCIMafer {

    public static void main(String[] args)
    {
        System.out.println("Universidad Laica Eloy Alfaro de Manabí");
        System.out.println("Calculadora Básica");
        System.out.println("Ingeniería de Software");
        System.out.println("Ing. Diego Toala");
        System.out.println("Mafer Delgado");
        
        int op=0;
        double n1,n2,multiplicacion,suma,division,resta;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("nCalculadoran"+
            "************n"+
            "[1] SUMARn"+
            "[2] RESTARn"+
            "[3] MULTIPLICARn"+
            "[4] DIVIDIRn"+
            "[5] SALIRn"+
            "Ingresa una opción:"));

            switch(op)
            {
                case 1:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 2"));
                    suma=n1+n2;
                    JOptionPane.showMessageDialog(null,"La suma es:"+suma);
                    break;
                case 2:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 2"));
                    resta=n1-n2;
                    JOptionPane.showMessageDialog(null,"La resta es:"+resta);
                    break;
                case 3:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 2"));
                    multiplicacion=n1*n2;
                    JOptionPane.showMessageDialog(null,"La multiplicación es:"+multiplicacion);
                    break;
                case 4:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 2"));
                    division=n1/n2;
                    JOptionPane.showMessageDialog(null,"La división es:"+division);
                   break;
            }
        }while(op!=5);
    }
}

    
