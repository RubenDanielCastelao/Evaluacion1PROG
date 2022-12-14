
package boletin11_2;

public class Calculos {
    public void suma(){
        int suma = 0;
        double mult = 1;
        int x = 10;
        do{
          x++;
          suma = suma + x;
          mult = mult *x;
        }while(x<90);
        System.out.println("La suma es de: " + suma + "\nLa multiplicación es de: " + mult);
    }
}
