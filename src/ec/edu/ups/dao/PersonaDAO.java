/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IPersonaDAO;
import ec.edu.ups.modelo.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Lisseth Reinoso
 */
public class PersonaDAO implements IPersonaDAO {

    private List<Persona> listaPersona;
    Persona persona;
    PersonaDAO personaDAO;
    public PersonaDAO() {

        listaPersona = new ArrayList<>();
        persona=new Persona();
    }
    

    @Override
    public boolean create(Persona persona) {
        
        return this.listaPersona.add(new Persona(persona.getCedula(), persona.getNombre(), persona.getApellido()));
        
    }

    @Override
    public Persona read(String cedula) {
        for (Persona persona : listaPersona) {
            if (persona.getCedula().equals(cedula)) {
                return persona;
            }
        }
        return null;
    }

    @Override
    public void update(Persona persona) {
        for (int i = 0; i < listaPersona.size(); i++) {
            Persona p = listaPersona.get(i);
            if (p.getCedula().equals(persona.getCedula())) {
                listaPersona.set(i, persona);
                break;
            }
        }
    }

    @Override
    public void delete(Persona persona) {
        Iterator<Persona> it = listaPersona.iterator();
        while (it.hasNext()) {
            Persona p = it.next();
            if (p.getCedula().equals(persona.getCedula())) 
                it.remove();
                break;
            }
        }
    

    @Override
    public List<Persona> findAll() {
        return listaPersona;
    }
}
