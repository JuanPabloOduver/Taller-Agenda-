package Agenda.src.main.java.co.edu.uniquindio.poo;

public class Contacto {
    private String nombre,alias,direccion,telefono,email;
    
    public Contacto(String nombre,String alias,String direccion,String telefono,String email){
        this.nombre=nombre;
        this.alias=alias;
        this.direccion=direccion;
        this.telefono=telefono;
        this.email=email;
        
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getAlias(){
        return alias;
    }
    
    public void setAlias(String alias){
        this.alias=alias;
    }

    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    @Override
    public String toString(){
        return  "Contacto [nombre= " + nombre + ", alias= " + alias + ", dirección= " +direccion+ ", telefono= " + telefono + ", email= " + email + "] ";
    }
}
