
package extra4;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        int numP = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entre 0 y 99.999: "));
        Calculos obx = new Calculos();
        System.out.println("El número es de: "+ obx.contarCifras(numP));
    }
}
