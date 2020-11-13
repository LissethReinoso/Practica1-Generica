/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Lisseth Reinoso
 */

public class Telefono<T> {
    
    private T numero;
    private T tipo;
    private T operadora;

    public Telefono() {
    }

    public Telefono( T numero, T tipo, T operadora) {
       
        this.numero = numero;
        this.tipo = tipo;
        this.operadora = operadora;
    }

   

    public T getNumero() {
        return numero;
    }

    public void setNumero(T numero) {
        this.numero = numero;
    }

    public T getTipo() {
        return tipo;
    }

    public void setTipo(T tipo) {
        this.tipo = tipo;
    }

    public T getOperadora() {
        return operadora;
    }

    public void setOperadora(T operadora) {
        this.operadora = operadora;
    }

    
    
    @Override
    public String toString() {
        return "Telefono{" + ", numero=" + numero + ", tipo=" + tipo + ", operadora=" + operadora + '}';
    }

    

    
   
}
