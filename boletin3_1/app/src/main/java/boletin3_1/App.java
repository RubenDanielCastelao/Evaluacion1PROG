/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package boletin3_1;

import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserte la tarifa inicial del producto:");
        double t = scan.nextDouble();
        System.out.println("Inserte el precio pagado por el producto:");
        double p = scan.nextDouble();
        double resto = t-p;
        System.out.println("El % ahorrado en la compra ha sido de: "+ resto*100/t+ "%.");
    }
}