/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.PersonaDAO;
import ec.edu.ups.idao.IPersonaDAO;
import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.*;
import ec.edu.ups.vista.VistaPersona;
import ec.edu.ups.vista.VistaTelefono;
import java.util.List;

/**
 *
 * @author Lisseth Reinoso
 */
public class ControladorPersona {
    //objetos vist
    private VistaPersona vistaPersona;
    private VistaTelefono vistaTelefono;
    //objetos modelo
    private Persona persona;
    private Telefono telefono;
    //objetos DAO
    private IPersonaDAO personaDAO;
    private ITelefonoDAO telefonoDAO;
    private PersonaDAO pDAO;
    
    private VentanaRegistrarPersona registrarPersona1;
    private VentanaListado listadoTelefono;

    public ControladorPersona() {
    }
    
    public ControladorPersona(VentanaRegistrarPersona vistaPersona,VentanaListado listadoTelefono,IPersonaDAO personaDAO,ITelefonoDAO telefonoDAO) {
        this.registrarPersona1 = vistaPersona;
        this.listadoTelefono = listadoTelefono;
        this.personaDAO = personaDAO;
        this.telefonoDAO = telefonoDAO;
    }
    
    public ControladorPersona(VistaPersona vistaPersona,VistaTelefono vistaTelefono,IPersonaDAO personaDAO,ITelefonoDAO telefonoDAO) {
        this.vistaPersona = vistaPersona;
        this.vistaTelefono = vistaTelefono;
        this.personaDAO = personaDAO;
        this.telefonoDAO = telefonoDAO;
    }
    
    //llama al DAO para guardar a una persona
    public void registrar() {
        persona = vistaPersona.ingresarPersona();
        personaDAO.create(persona);
    }

    //llama al DAO para obtener una persona por la cedula y luego los muestra en la vista
    public void verPersona() {
        String cedula = vistaPersona.buscarPersona();
        persona = personaDAO.read(cedula);
        vistaPersona.verPersona(persona);
    }
    
    //llama al DAO para actualizar una persona
    public void actualizar() {
        persona = vistaPersona.actualizarPersona();
        personaDAO.update(persona);
    }

    //llama al DAO para eliminar una persona
    public void eliminar() {
        persona = vistaPersona.eliminarPersona();
        personaDAO.delete(persona);
    }

    //llama al DAO para obtener todas las personas y luego los muestra en la vista
    public void verPersonas() {
        List<Persona> personas;
        personas = personaDAO.findAll();
        vistaPersona.verPersonas(personas);
    }
    
    // agregacion
    public void agregarTelefono(){
        String numero = vistaTelefono.buscarTelefono();
        telefono = telefonoDAO.read(numero);
        persona.agregarTelefono(telefono);
        personaDAO.update(persona);        
    }
    
    
    
    
}
