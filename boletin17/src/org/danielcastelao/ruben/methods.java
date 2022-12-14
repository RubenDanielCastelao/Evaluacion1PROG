
package org.danielcastelao.ruben;

import com.billy.datos.avg;
import com.billy.datos.getters;

public class methods {
    boolean x;
    boolean y;
    
    public double notaPrueba(String message){
       double nota = getters.getDouble(message);
       return nota;
    }
    
    public double mediaPT(double nota1, double nota2){
        double mpt = avg.avg2double(nota1, nota2); 
        return mpt;
    }
    
    public double notaBoletin(String message){
        double notaf;
        double nota;
        do{
        nota = getters.getDouble(message);
        }while((nota <0) || (nota >1));
        if(nota>=0.9){
            notaf = 2;
            return notaf;
        }
        else if(nota>=0.7){
            notaf = 1;
            return notaf;
        }
        else
            notaf = 0;
            return notaf;
    }
}
