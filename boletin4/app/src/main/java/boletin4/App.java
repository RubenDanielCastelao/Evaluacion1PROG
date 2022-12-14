package boletin4;

public class App {
    
    public static void main(String[] args) {
        libro Libro1 = new libro("Don Quijote", "Miguel De Cervantes",1605,(short)1350);      
        libro Libro2 = new libro("Voltereta","Billy",186,(short)1869);

        Libro2.setValoracion(9.9f);
        Libro1.setValoracion(9.1f);
        
        Libro1.mostrar();
        Libro2.mostrar();
        
    }
}