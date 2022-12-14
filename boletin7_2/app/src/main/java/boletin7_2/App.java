
package boletin7_2;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        short num1 = Short.parseShort(JOptionPane.showInputDialog("Escriba un número: "));
        short num2 = Short.parseShort(JOptionPane.showInputDialog("Escriba otro número: "));
        calculos obx = new calculos();
     
        System.out.println("La suma de los 2 números es de: " + obx.suma(num1, num2));
        
        if(num1>num2){
            System.out.println("La resta de los 2 números es de: " + obx.resta(num1, num2));
        }
    }
}
