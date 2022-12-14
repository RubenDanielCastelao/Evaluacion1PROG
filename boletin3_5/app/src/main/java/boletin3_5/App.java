
package boletin3_5;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Introduzca su sueldo fijo:");
       double sf = scan.nextDouble();
       System.out.println("Introduzca el importe total de ventas:");
       double im = scan.nextDouble();
       double iv = im * (5/100);
       System.out.println("Introduzca los kilometros recorridos:");
       double kms = scan.nextDouble();
       double km = kms * 2;
       System.out.println("Introduzca la cantidad de dias de desplazamiento en los que se a requerido de dieta:");
       double dsd = scan.nextDouble();
       double dd = dsd * 30;
       double sb = sf + iv + km + dd;
       double sl = sb - (sb * 0.18 + 36);
       System.out.println("El sueldo base es de: " + sb +".\nEl sueldo líquido es de: " + sl + "." );
    }
}

