
package boletin13_1;

import javax.swing.JOptionPane;
import org.danielcastelao.ruben.Personal;

public class Academica {
    
    public static int numReferencia = 2018;
    private String nome;
    private int nota;
    private Personal alumno;
    
    public Academica(){
        numReferencia++;
    }
    public Academica(String nome,int nota,Personal alumno){
        Academica.numReferencia ++;
        this.nome = nome;
        this.nota = nota;
        this.alumno = alumno;
    }
    public String getNome(){
        return nome;
    }
    public int getNota(){
        return nota;
    }
    public Personal getAlumno(){
        return alumno;
    }
    public int getNumReferencia(){
        return numReferencia;
    }
    public void setNumReferencia(){
        this.numReferencia = numReferencia;
    }
    public void setAlumno(){
        this.alumno = alumno;
    }
    public void setNome(){
        this.nome = nome;
    }
    public void setNota(){
        this.nota = nota;
    }
    public int validaNota(){
        do{
           nota = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la nota (Debe estar entre 0 y 10)"));
        }while(nota<1 || nota>10);
        return nota;
    }
    @Override
    public String toString(){
        return "Nota= " + nota + " Nome= " + nome + " Alumno= " + alumno;
    }
}