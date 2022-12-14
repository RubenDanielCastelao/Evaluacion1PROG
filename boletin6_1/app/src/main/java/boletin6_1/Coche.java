
package boletin6_1;

public class Coche {
     private int velocidade ;

    public Coche(){
        int velocidade;
    }
    
    public int getVelocidade(){
        return velocidade;
    }
    
    public void acelerar(int valor){
        velocidade += valor;
    }
    
    public void frenar(int menos){
        velocidade -= menos;
    }
    
}
