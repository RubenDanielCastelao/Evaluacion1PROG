
package boletin7_3;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        float num = Float.parseFloat(JOptionPane.showInputDialog("Escriba un numero: "));
        polaridadNumero obx = new polaridadNumero();
        obx.numPrueba(num);
    }
}
