
package co.edu.nicolas.domain;

import java.util.List; 
/** 
* 
* @author nixod 
*/ 
public interface PersonaService { 
    List<Persona> listar(); 
        Persona listarId(int id); 
        Persona add(Persona p); 
        Persona edit(Persona p); 
        Persona delete(int id); 
}