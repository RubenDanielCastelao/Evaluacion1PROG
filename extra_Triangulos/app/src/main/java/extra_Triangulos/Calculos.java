
package extra_Triangulos;

import javax.swing.JOptionPane;

public class Calculos {
    int filas;
    int n = 0;
    int nfilas;
    public void triangulo(){
        nfilas = Integer.parseInt(JOptionPane.showInputDialog("Número de filas"));
        for(filas=1;filas<(nfilas+1);filas++){
           for(n=0;n<filas;n++){
            System.out.print("*");
           }
           System.out.println("");
        }
        
    }


    public void triangulo2(){
        nfilas = Integer.parseInt(JOptionPane.showInputDialog("Número de filas"));
        for(filas=1;filas<(nfilas+1);filas++){
           for(n=0;n<((nfilas+1)-filas);n++){
            System.out.print(" ");
           }
           for(n=0;n<filas;n++){
            System.out.print("*");
           }
            System.out.println("");
        }
        
    }
    
    public void triangulo3(){
        nfilas = Integer.parseInt(JOptionPane.showInputDialog("Número de filas"));
        for(filas=1;filas<(nfilas+1);filas++){
           for(n=0;n<((nfilas+1)-filas);n++){
            System.out.print(" ");
           }
           for(n=0;n<filas;n++){
            System.out.print("* ");
           }
            System.out.println("");
        }
        
    }
}