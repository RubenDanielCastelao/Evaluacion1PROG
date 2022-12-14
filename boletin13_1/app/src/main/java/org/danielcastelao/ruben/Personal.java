
package org.danielcastelao.ruben;

public class Personal {
    private String telefono;
    private String correo;
    public Personal(){
        
    }
    public Personal(String correo, String telefono){
        this.telefono=telefono;
        this.correo=correo;
    }
    public String getCorreo(){
        return correo;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setCorreo(){
        this.correo=correo;
    }
    public void setTelefono(){
        this.telefono=telefono;
    }
    public String toString(){
        return "Telefono= " + telefono + " Correo= " + correo;
    }
}
