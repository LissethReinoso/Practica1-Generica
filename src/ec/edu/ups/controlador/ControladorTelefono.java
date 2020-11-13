/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.VentanaListado;
import ec.edu.ups.vista.VistaTelefono;
import java.util.List;

/**
 *
 * @author Lisseth Reinoso
 */
public class ControladorTelefono {

    public ControladorTelefono() {
    }
    
    //objetos vist
    private VistaTelefono vistaTelefono;
    private Telefono telefono;
    private ITelefonoDAO telefonoDAO;
    private VentanaListado listadoTelefono;
    
    Persona p=new Persona();

    // constructor
    public ControladorTelefono(VistaTelefono vistaTelefono, TelefonoDAO telefonoDAO) {
        this.vistaTelefono = vistaTelefono;
        this.telefonoDAO = telefonoDAO;
    }

    public ControladorTelefono( VentanaListado listadoTelefono,ITelefonoDAO telefonoDAO) {
        this.telefono = telefono;
        this.telefonoDAO = telefonoDAO;
        this.listadoTelefono = listadoTelefono;
    }

    //llama al DAO para guardar un telefono
    public void registrar() {
        telefono = vistaTelefono.ingresarTelefono();
        telefonoDAO.create(telefono);
    }

    //llama al DAO para obtener un telefono por el numero y luego los muestra en la vista
    public void verTelefono() {
        String numero = vistaTelefono.buscarTelefono();
        telefono = telefonoDAO.read(numero);
        vistaTelefono.verTelefono(telefono);
    }
    
    //llama al DAO para actualizar un telefono
    public void actualizar() {
        telefono = vistaTelefono.actualizarTelefono();
        telefonoDAO.update(telefono);
    }

    //llama al DAO para eliminar un telefono
    public void eliminar() {
        telefono= vistaTelefono.eliminarTelefono();
        telefonoDAO.delete(telefono);
    }

    //llama al DAO para obtener todas las personas y luego los muestra en la vista
    public void verTelefonos() {
        List<Telefono> telefonos;
        telefonos = telefonoDAO.findAll();
        vistaTelefono.verTelefonos(telefonos);
    } 
}
