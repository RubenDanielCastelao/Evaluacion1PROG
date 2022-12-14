
package boletin11_5;

import javax.swing.JOptionPane;

public class Calculos {
    public void sueldos(){
        int cs = 0;
        int cm = 0;
        int c = 0;
        int s;
        do{
        s = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un salario:"));
        if(s<0)
            System.out.println("ERROR");
        else if(s < 1750 && s > 1000){
            cs++;
        }
        else if(s<1000 && s>0){
            cm++;
        }
        c++;
        System.out.println("Salarios de 1750-1000: "+ cs + "\nPorcentaje de salarios de menos de 1000: " + (cm*100/c));
        }while(s!=0);
        
    }
    
}
