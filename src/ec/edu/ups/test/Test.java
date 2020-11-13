/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.dao.PersonaDAO;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.vista.VistaPersona;
import ec.edu.ups.vista.VistaTelefono;

/**
 *
 * @author Usuario
 */
public class Test {
    
    public static void main(String[] args) {

        // vista
        VistaPersona vistaP = new VistaPersona();
        VistaTelefono vistaT = new VistaTelefono();
        //DAOs
        PersonaDAO personaDAO = new PersonaDAO();
        TelefonoDAO telefonoDAO = new TelefonoDAO();
        // controlador
        ControladorPersona controladorPersona = new ControladorPersona(vistaP,vistaT,personaDAO, telefonoDAO);
        ControladorTelefono controladorTelefono = new ControladorTelefono(vistaT, telefonoDAO);

       
        controladorPersona.registrar(); 
        controladorPersona.registrar();

       
        controladorPersona.verPersonas();
   
      //  controladorPersona.actualizar();

       
       // controladorPersona.verPersonas();

      
     //   controladorPersona.eliminar();

      
     //   controladorPersona.verPersonas();
        
      
        controladorTelefono.registrar();
        //controladorDireccion.registrar();
        //controladorDireccion.registrar();
        
     
      controladorTelefono.verTelefonos();
        
      
        controladorPersona.verPersona();
        controladorPersona.agregarTelefono();
        
        
      
        controladorPersona.verPersonas();
        controladorPersona.verPersona();
        controladorPersona.agregarTelefono();
        
        
            
        
    }
    
    
}
