
package boletin5;

public class App {


    public static void main(String[] args) {
        consumo cons1 = new consumo();
        cons1.setLitros(50f);
        cons1.setpGas(1.57f);
        consumo cons2 = new consumo(100f,5.6f,67,1.78f);
        System.out.println("El consumo medio es de: "+cons2.consumoMedio());
        cons2.setLitros(7.8f);
        System.out.println("La velocidad media es de: "+cons2.getvMed());
    }
}
