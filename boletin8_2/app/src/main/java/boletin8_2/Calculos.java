
package boletin8_2;

import javax.swing.JOptionPane;


public class Calculos {
    public void areas(int opcion){
        switch(opcion){
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la longitud del lado del cuadrado: "));
                int areac = lado * lado;
                System.out.println("El área del cudrado es de: "+ areac);
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base del triángulo: "));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura del triángulo: "));
                int areat = base * altura /2;
                System.out.println("El área del triángulo es de" + areat);
                break;
            case 3:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el radio del círculo: "));
                double areacirc = (Math.pow(radio,2) * Math.PI);
                System.out.println("El área del círculo es de: " + areacirc);
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }
}
