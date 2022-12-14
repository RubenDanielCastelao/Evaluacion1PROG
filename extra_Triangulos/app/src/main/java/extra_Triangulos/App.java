
package extra_Triangulos;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        Calculos obx = new Calculos();
        switch(Integer.parseInt(JOptionPane.showInputDialog("1-.Triángulo rectángulo izquierda.\n2-.Triángulo rectángulo derecha.\n3-.Triángulo equilatero."))){
            case 1:
                obx.triangulo();
                break;
            case 2:
                obx.triangulo2();
                break;
            case 3:
                obx.triangulo3();
                break;
            default:
                System.out.println("Introduzca una opción valida");
                
        }
    }
}
