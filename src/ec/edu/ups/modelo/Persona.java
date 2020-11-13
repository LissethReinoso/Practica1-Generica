/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ec.edu.ups.modelo.Telefono;

/**
 *
 * @author Lisseth Reinoso
 */

//creación de una clase genérica
public class Persona<T> {

    private T cedula;
    private T nombre;
    private T apellido;
    private Telefono telf;
    //Agregacion
    private List<Telefono> telefonos;
    
    public Persona() {
        telefonos = new ArrayList<>();

    }

    public Persona(T cedula, T nombre, T apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;

        telefonos = new ArrayList<>();

    }

    public T getCedula() {
        return cedula;
    }

    public void setCedula(T cedula) {
        this.cedula = cedula;
    }

    public T getNombre() {
        return nombre;
    }

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    public T getApellido() {
        return apellido;
    }

    public void setApellido(T apellido) {
        this.apellido = apellido;
    }

    //métodos de la agregación
    public boolean agregarTelefono(Telefono telefono) {
        return this.telefonos.add(new Telefono(telefono.getNumero(), telefono.getTipo(), telefono.getOperadora()));
    }

    
    public boolean actualizarTelefono( String numero,String tipo, String operadora) {

        int pos = posicion(numero);
        if (pos >= 0) {
            Telefono t = this.telefonos.get(pos);
            t.setNumero(numero);
            t.setTipo(tipo);
            t.setOperadora(operadora);
            return this.telefonos.set(pos, t) != null;
        }
        return false;
    }

    
    public void eliminarTelefono(Telefono telefono) {
        if (telefonos.contains(telefono)) {
            int index = telefonos.indexOf(telefono);
            telefonos.remove(index);
        }
    }

    public void listar() {
        telefonos.stream().forEach(a->System.out.println(a));
        
    }

    public Telefono buscar(int numero) {
        
        return telefonos.get(numero);

    }

    public int posicion(String numero) {
        for (int i = 0; i < this.telefonos.size(); i++) {
            Telefono t = this.telefonos.get(i);
            if (telf.getNumero().equals(numero)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + "\nTeléfonos:" + telefonos + '}';
    }

}
