/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Persona;
import java.util.List;

/**
 *
 * @author Lisseth Reinoso
 */
public interface IPersonaDAO {
    public boolean create(Persona persona);
    public Persona read(String cedula);
    public void update(Persona persona);
    public void delete(Persona persona);   
    public List<Persona> findAll(); 
}
