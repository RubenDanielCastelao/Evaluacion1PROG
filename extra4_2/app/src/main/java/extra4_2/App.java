
package extra4_2;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        float precioUva = Float.parseFloat(JOptionPane.showInputDialog("Cual es el precio base de la uva en este momento?"));
        Calculos obx = new Calculos();
        System.out.println("El precio de la uva será de: " + obx.ventaUva(precioUva));
    }
}
