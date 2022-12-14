
package boletin4_3;


public class Calculos {
    private int precioAlumno;
        public int calcPrecio(int alumnos){
            if(alumnos < 0){
                System.out.println("El número de alumnos debe de ser mayor a 0");
            }
            else if(alumnos >= 100){
                precioAlumno = 65;
            }
            else if(alumnos >= 50 && alumnos <= 99){
                precioAlumno = 70;
            }
            else if(alumnos >= 30 && alumnos <= 49){
                precioAlumno = 95;
            }
            else{
                precioAlumno = 4000/alumnos;
            }
            return precioAlumno;
        }
}
