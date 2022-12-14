package boletin4;

public class libro {
    
   private String titulo;
   private String autor;
   private int ano;
   private short numPaginas;
   private float valoracion;
    
    public libro(String titulo, String autor, int ano, short numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
        
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void setNumPaginas(short numPaginas){
        this.numPaginas = numPaginas;
    }
    
    public void setValoracion(float valoracion){
        this.valoracion = valoracion;
    }
    
     public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getAno(){
        return ano;
    }
    
    public short getNumPaginas(){
        return numPaginas;
    }
    
    public float getValoracion(){
        return valoracion;
    }
    
    public void mostrar(){
        System.out.println("Titulo del libro: "+ titulo);
        System.out.println("Autor del libro: "+ autor);
        System.out.println("Año de salida del libro: "+ ano);
        System.out.println("Número de paginas: "+ numPaginas);
        System.out.println("Valoraciones del libro: "+ valoracion);   
    }
}
