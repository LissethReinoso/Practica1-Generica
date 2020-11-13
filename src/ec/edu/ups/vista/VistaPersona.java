/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Persona;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lisseth Reinoso
 */
public class VistaPersona {
    
    private Scanner leer;

    public VistaPersona() {
        leer=new Scanner(System.in);
    }
    
    public Persona ingresarPersona(){
        leer = new Scanner(System.in);
        System.out.println("Ingresa los datos");
        System.out.print("Cédula: ");
        String cedula = leer.nextLine();
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Apellido: ");
        String apellido = leer.next();
        return new Persona(cedula, nombre, apellido);
        
        
    }
    
     public Persona actualizarPersona() {
        leer = new Scanner(System.in);
        System.out.println("Ingresa la cédula del cliente a actualizar");
        String cedula = leer.nextLine();
        System.out.println("Ingrese los nuevos Datos (nombre, apellido)");
         System.out.print("Nuevo nombre: ");
        String nombre = leer.next();
         System.out.print("Nuevo apellido: ");
        String apellido = leer.next();
        return new Persona(cedula, nombre, apellido);
    }
     
     public Persona eliminarPersona() {
        leer = new Scanner(System.in);
        System.out.println("Ingresa la cédula del cliente a eliminar");
        String cedula = leer.nextLine();
        return new Persona(cedula, null, null);
    }
    
     public String buscarPersona() {
        leer = new Scanner(System.in);
        System.out.println("Ingresa la cédula del cliente a buscar");
        String cedula = leer.next();
        return cedula;
    }
     
     public void verPersona(Persona persona) {
        System.out.println("Datos de la persona: " + persona);
    }

    public void verPersonas(List<Persona> personas) {
        for (Persona p : personas) {
            System.out.println("Datos de la persona: " + p);
        }
    }
    
    
    
}
