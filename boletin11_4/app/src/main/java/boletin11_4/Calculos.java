
package boletin11_4;

import javax.swing.JOptionPane;

public class Calculos {
    public void tablas(){
        int i = 0;
        do{
           int num = Integer.parseInt(JOptionPane.showInputDialog("Escriba el número del que quiere la tabla (0 acaba el programa)"));
           if(num!=0){
               System.out.println("1 x " + num + "=" + (num*1) +
                                  "\n2 x " + num + "=" + (num*2) +
                                  "\n3 x " + num + "=" + (num*3) +
                                  "\n4 x " + num + "=" + (num*4) +
                                  "\n5 x " + num + "=" + (num*5) +
                                  "\n6 x " + num + "=" + (num*6) +
                                  "\n7 x " + num + "=" + (num*7) +
                                  "\n8 x " + num + "=" + (num*8) +
                                  "\n9 x " + num + "=" + (num*9) +
                                  "\n10 x " + num + "=" + (num*10));
           }
           else{
               i=10;
               System.out.println("FIN"); 
           }
        }while(i!=10);
    }
}
