
package extra4;


public class Calculos {
    private int cifras;

        public int contarCifras(int numP){
            if(numP < 0 || numP > 99999){
                System.out.println("El número indicado no cumple los requisitos.");
            }
            else if(numP/ 10000 > 1){
                 cifras = 5;
            }
            else if(numP/ 1000 > 1){
                cifras = 4;
            }
            else if(numP/ 100 > 1){
                cifras = 3;
            }
            else if(numP/ 10 > 1){
                cifras =2;
            }
            else{
                cifras =1;
            }
            return cifras;            
        }
}
