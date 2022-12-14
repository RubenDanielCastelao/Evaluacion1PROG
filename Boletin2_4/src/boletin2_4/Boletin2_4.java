
package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba su primer número:");
        double n1 = scan.nextDouble();
        System.out.println("Escriba su segundo número");
        double n2 = scan.nextDouble();
        double s = n1 + n2;
        double r = n1 - n2;
        double m = n1 * n2;
        double d = n1 / n2;
        System.out.println("Los numeros "+ n1 + " y "+ n2 +" tienen los siguientes resultados"
                + "\n Suma: "+ s + "\n Resta: "+ r +"\n Multiplicación: "+ m +"\n División: "+d +".");
        
    }
    
}
