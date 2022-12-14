
package boletin4_3;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        int alumnos = Integer.parseInt(JOptionPane.showInputDialog("Número de alumnos que presentan al viaje: "));
        Calculos obx = new Calculos();
        obx.calcPrecio(alumnos);
        System.out.println("El pago por alumno será de:" + obx.calcPrecio(alumnos) + " ,y el pago total del autobus será de:" + obx.calcPrecio(alumnos)* alumnos);
    }
}
