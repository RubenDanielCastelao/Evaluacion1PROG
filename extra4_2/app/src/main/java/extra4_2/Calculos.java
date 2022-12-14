
package extra4_2;

import javax.swing.JOptionPane;

public class Calculos {
        public float ventaUva(float precioUva){
            String tipoUva = JOptionPane.showInputDialog("De que tipo es la uva? (A o B)");
            int tamUva = Integer.parseInt(JOptionPane.showInputDialog("De que tamaño es la uva? (1 o 2)"));
            if((!"A".equals(tipoUva) && !"B".equals(tipoUva)) || (tamUva != 1 && tamUva != 2) ){
                System.out.println("Error en las especificaciones");
            }
            else if("A".equals(tipoUva) && tamUva == 1){
                precioUva += 0.20;
            }
            else if("A".equals(tipoUva) && tamUva == 2){
                precioUva += 0.30;
            }
            else if("B".equals(tipoUva) && tamUva == 1){
                precioUva -= 0.30;
            }
            else if("B".equals(tipoUva) && tamUva == 2){
                precioUva -= 0.50;
            }
            return precioUva;
        }
}
