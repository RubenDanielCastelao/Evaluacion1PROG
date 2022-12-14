

package boletin6_3;



public class circulo {
    public static final double pi = 3.14;
    private double radio;
    
    public circulo(double radio){
        this.radio = radio;
    }
    
    public circulo(){
        
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public double calcularArea(){
        double area = pi * (Math.pow(radio , 2));
        return area;
    }
    
    public double calcularLonxitude(){
        double longitud = pi*(radio*2);
        return longitud;
    }
}
