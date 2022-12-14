
package boletin8_1;

public class Calculos {
    private int ventAnual;
        public String clasificar(int ventAnual){
            if(ventAnual <= 100){
                return "baixo";
            }
            else if(ventAnual > 100 && ventAnual <= 500){
                return "medio";
            }
            else if(ventAnual > 500 && ventAnual <= 1000){
                return "alto";
            }
            else{
                return "primera necesidad";
            }
        }
}
