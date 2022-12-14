
package boletin5;

public class consumo {
    private float km;
    private float litros;
    private int vMed;
    private float pGas;
    
        public consumo(float km,float litros,int vMed,float pGas){
            this.km = km;
            this.litros = litros;
            this.vMed = vMed;
            this.pGas = pGas;
        }
        
        public consumo(){
            float km;
            float litros;
            int vMed;
            float pGas;
        }
        
        public float getTempo(){
            float tempo = km / vMed;
            return tempo;
        }
               
        public float consumoMedio(){
            float cMedio = (litros/(km/100));
            return cMedio;
        }
        
        public float consumoEuros(){
            float cMedio = (litros/(km/100));
            float cEuros = cMedio * pGas;
            return cEuros;
        }
        
        public void setKms(float km){
            this.km = km;
        }
        
        public void setLitros(float litros){
            this.litros = litros;
        }
        
        public void setvMed(int vMed){
            this.vMed = vMed;
        }
        
        public void setpGas(float pGas){
            this.pGas = pGas;
        }
        
        public float getvMed(){
            return vMed;
        }
}
