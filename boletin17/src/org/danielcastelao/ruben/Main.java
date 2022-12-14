
package org.danielcastelao.ruben;

import com.billy.datos.dataValidation;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Main {
    
private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        boolean ex1;
        boolean ex2;
        double examen1;
        double examen2;
        int repeat;
        
        methods obx = new methods();
        do{
        do{
         examen1 = obx.notaPrueba("Nota del primer examen");
         ex1 = dataValidation.dn0to10(examen1);
        }while(ex1 == false);
        do{
        examen2 = obx.notaPrueba("Nota del segundo examen");
        ex2 = dataValidation.dn0to10(examen2);
        }while(ex2 == false);
        double mediapt = obx.mediaPT(examen1, examen2);
        double examenPractico = obx.notaPrueba("Nota del examen practico");
        double notaBoletin = obx.notaBoletin("Nota del boletin(0.5 es igual a 50%)");
        
        System.out.println("Examen 1:  " + df.format(examen1) + 
                           "\nExamen 2: " + df.format(examen2) + 
                           "\nMedia examen teorico: " + df.format(mediapt) + 
                           "\nExamen practico: " + df.format(examenPractico) + 
                           "\nBoletin: " + df.format(notaBoletin) +
                           "\nNota total: " + df.format(((mediapt * 0.4)+(examenPractico * 0.4)+(notaBoletin))));
        repeat = JOptionPane.showConfirmDialog(null,"Quiere calcular otra nota?");
        }while(repeat == 0);
    }
    
}
