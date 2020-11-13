/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Telefono;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lisseth Reinoso
 */
public class VistaTelefono {
    
    private Scanner leer;
    Persona p=new Persona();
    public VistaTelefono() {
        
        leer=new Scanner(System.in);
    }
    
    public Telefono ingresarTelefono() {
        leer = new Scanner(System.in);
        System.out.println("Ingrese los datos del teléfono");
        
        System.out.print("Número: ");
        String numero = leer.nextLine();
        System.out.print("Tipo: ");
        String tipo = leer.next();
        System.out.print("Operadora: ");
        String operadora = leer.next();
        return new Telefono(numero, tipo,operadora);
    }
    
    public Telefono actualizarTelefono() {
        leer = new Scanner(System.in);
        System.out.println("Ingresa el numero del telefono a actualizar");
        String numero = leer.next();
        System.out.println("Ingrese los nuevos Datos (tipo,operadora)");
        System.out.print("Tipo: ");
        String  tipo= leer.next();
        System.out.print("Operadora: ");
        String operadora = leer.next();
        
        return new Telefono(numero,tipo, operadora);
    }
    
    public Telefono eliminarTelefono() {
        leer = new Scanner(System.in);
        System.out.println("Ingresa el número del teléfono a eliminar");
        String numero = leer.next();
        return new Telefono(numero, null, null);
    }

    public String buscarTelefono() {
        leer = new Scanner(System.in);
        System.out.println("Ingresa el número del teléfono a buscar");
        String numero = leer.next();
        return numero;
    }

    public void verTelefono( Telefono telefono) {
        System.out.println("Telefono: " + telefono);
    }

    public void verTelefonos(List<Telefono> telefonos) {
        for (Telefono t : telefonos) {
            System.out.println("Datos del teléfono: " + t);
        }
    }
    
}
