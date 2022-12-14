
package extra2;

public class cuenta {
    
    private String nombre;
    private String ncuenta;
    private double tinteres;
    private double saldo;
    
    public cuenta(){
        
    }
    
    public cuenta(String nombre, String ncuenta, double tinteres, double saldo){
        this.nombre = nombre;
        this.ncuenta = ncuenta;
        this.tinteres = tinteres;
        this.saldo = saldo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
        public void setNcuenta(String ncuenta){
        this.ncuenta = ncuenta;
    }
    
    public String getNcuenta(){
        return ncuenta;
    }
    
        public void setTinteres(double tinteres){
        this.tinteres = tinteres;
    }
    
    public double getTinteres(){
        return tinteres;
    }
    
        public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void ingreso(double ingreso){
        saldo += ingreso;
    }
    
    public void reintegro(double reintegro){
        saldo -= reintegro;
    }
    
    public void transferencia(cuenta C2,double importe){
        this.saldo -= importe;
        C2.saldo += importe;
    }
}
 