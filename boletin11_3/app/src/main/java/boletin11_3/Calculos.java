
package boletin11_3;

import javax.swing.JOptionPane;

public class Calculos {
    public void area(){
        int altura;
        int base;
        do{
        base = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base de su rectangulo"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura de su rectangulo"));
        }while(base < 0 || altura < 0);
        int b = base;
        int h = altura;
        int area = b * h;
        System.out.println("El area es: " + area);
    }
}
