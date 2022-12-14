
package boletin7_4;


public class calculo {
     
    public void compPeso(String nom1, String nom2, double peso1, double peso2){
        if(peso1>peso2){
            System.out.println(nom1 +"\n" + peso1 + "\n La diferencia de peso es: " + (peso1 - peso2));
        }
        
        else if(peso2>peso1){
            System.out.println(nom2 +"\n" + peso2 + "\n La diferencia de peso es: " + (peso2 - peso1));
        }
        else{
            System.out.println("Los 2 pesan lo mismo");
        }
    }
}
