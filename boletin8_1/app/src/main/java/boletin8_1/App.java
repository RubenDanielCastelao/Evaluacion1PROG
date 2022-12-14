
package boletin8_1;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        Calculos obx = new Calculos();
        String nombre = JOptionPane.showInputDialog("Nombre del producto: ");
        int ventAnual = Integer.parseInt(JOptionPane.showInputDialog("Ventas anuales del producto: "));
        System.out.println("El producto "+nombre+" es de tipo: "+obx.clasificar(ventAnual));
    }
}
