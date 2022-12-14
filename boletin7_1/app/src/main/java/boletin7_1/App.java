
package boletin7_1;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
          int num = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu número: "));
          posit obx = new posit();
          obx.comprobarPositivo(num);
    }
}
