
package boletin8_2;

import javax.swing.JOptionPane;

public class App {


    public static void main(String[] args) {
       int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción: \n1-- Cuadrado\n2--Triángulo\n3--Círculo"));
       Calculos obx = new Calculos();
       obx.areas(opcion);
    }
}
