package co.edu.uniquindio.poo;

import java.sql.Time;

public class App {

    public static void main(String[] args) {

        
        

        Time Hora = Time.valueOf("14:00:00");

        //Crear Contactos
        Contacto contacto1 = new Contacto("Daniel", "Dani", "Barrio Colinas", "23103903919", "daniel@uqvirtual.edu.co");
        Contacto contacto2 = new Contacto("Johan", "Idk", "Barrio 3 Esquinas", "2329716369", "johan@uqvirtual.edu.co");
        Contacto contacto3 = new Contacto("Pablo" ,"Juan", "Barrio 7 Agosto", "23124353569", "pablo@uqvirtual.edu.co");
        
        //Crear Reunion
        Reunion reunion = new Reunion("Clase de Programacion I", "2/09/24", Hora);

        //Asignar Contactos a la reunion
        reunion.asignarContacto(contacto1);
        reunion.asignarContacto(contacto2);

        //Crear Grupo
        Grupo grupo = new Grupo("Amigos", "amigos");

        //Agregar contactos
        grupo.agregarContacto(contacto3);
        grupo.agregarContacto(contacto1);
        grupo.agregarContacto(contacto2);

        //imprimir
        System.out.println(grupo);
        System.out.println(reunion);


    }
}
