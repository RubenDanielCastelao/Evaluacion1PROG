
package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {
      public static final double M = 1852;
        public static void main(String[] args) {
            Scanner scan = new Scanner (System.in);
            System.out.println("Escriba la cantidad de metros que desea convertir a millas:");
            double milla = scan.nextDouble();
            double r = milla * M;
            System.out.println(milla +" millas, equivalen a "+ r +" metros.");
            
    }
    
}
