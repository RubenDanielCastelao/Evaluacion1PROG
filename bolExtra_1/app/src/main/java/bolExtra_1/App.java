
package bolExtra_1;
    
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formato1 = new DecimalFormat("#.##");    
        System.out.println("Introduzca la base imponible:");
        double bi = scan.nextDouble();
        System.out.println("Introduzca el % de IVA que se le aplica:");
        float ivao = scan.nextFloat();
        double it,ivat;
        it = bi + (bi*(ivao/100.0));
        ivat = it - bi;
        System.out.println("El importe total a pagar es de: " + (formato1.format(it)) + ".\nEl importe de IVA es de: " + (formato1.format(ivat)) +".");
    }
}
