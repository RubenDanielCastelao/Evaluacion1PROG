
package boletin12_1;

import javax.swing.JOptionPane;

public class Calculos {
    int intentos = 0;
    int num = 0;
    int i = 0;
    int h = 0;
    public void jugar(){
        do{
        intentos = Integer.parseInt(JOptionPane.showInputDialog("Número de intentos para adivinar: "));
        num = Integer.parseInt(JOptionPane.showInputDialog("Número que se debe adivinar: "));
    
        do{
        int adivinar = Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar, te quedan " + intentos + " intentos."));
        intentos = intentos - 1;
        if(adivinar > num){
            JOptionPane.showMessageDialog(null,"El número era demasiado alto,intentalo de nuevo,te quedan " + intentos + " intentos.");
        }
        else if(adivinar < num){
            JOptionPane.showMessageDialog(null,"El número era demasiado bajo,intentalo de nuevo,te quedan " + intentos + " intentos.");
        }
        else if(intentos == 0){
           JOptionPane.showMessageDialog(null,"Perdiste");
           h = 10;
        }
        else if(adivinar == num){
           i = 10;
        }
       }while(i!=10);
        JOptionPane.showMessageDialog(null,"Bien hecho, acertaste");
        int again = JOptionPane.showConfirmDialog(null, "Jugar otra vez?");
        if(again == 0)
            h = 0;
        else{
            h = 10;    
         }
      }while(h != 10);
    }
}  

