
package boletin7_4;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        String nom1 = JOptionPane.showInputDialog("Nombre de la primera persona: ");
        double peso1 = Double.parseDouble(JOptionPane.showInputDialog("Peso de la primera persona: "));
        String nom2 = JOptionPane.showInputDialog("Nombre de la segunda persona: ");
        double peso2 = Double.parseDouble(JOptionPane.showInputDialog("Peso de la segunda persona: "));
        calculo obx = new calculo();
        obx.compPeso(nom1, nom2, peso1, peso2);
    }
}
