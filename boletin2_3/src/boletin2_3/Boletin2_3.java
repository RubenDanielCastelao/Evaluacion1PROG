
package boletin2_3;

import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor actual del dolar:");
        double c = scan.nextDouble();
        System.out.println("Cantidad de euros a cambiar:");
        double e = scan.nextDouble();
        double d = c * e;
        System.out.println("Sus "+ e + "€ equivalen a "+ d +"$.");
        //Hola bon dia, esta e a version 1.0
    }
    
}
