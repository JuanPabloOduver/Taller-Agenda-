package Agenda.src.main.java.co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Grupo {
    private String nombre;
    private String categoria;  
    private Collection<Contacto> contactos;

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.contactos = new LinkedList<>();
    }

    public boolean verificarContacto(String nombre, String telefono) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                return true;
            }
        }
        return false;
    }

    public void agregarContacto(Contacto contacto) {
        if (!verificarContacto(contacto.getNombre(), contacto.getTelefono())) {
            contactos.add(contacto);
        }
    }

    public void eliminarContacto(String telefono) {
        for (Contacto contacto : contactos) {
            if (contacto.getTelefono().equals(telefono)) {
                contactos.remove(contacto);
                break;
            }
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(Collection<Contacto> contactos) {
        this.contactos = contactos;
    }

    @Override
    public String toString() {
        return "Grupo [nombre=" + nombre + ", categoría=" + categoria + ", contactos=" + contactos + "]";
    }
}
