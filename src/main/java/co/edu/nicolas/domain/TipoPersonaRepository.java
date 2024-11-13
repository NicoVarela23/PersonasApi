
package co.edu.nicolas.domain;

import java.util.List; 
import org.springframework.data.repository.Repository; 
/** 
* 
* @author nixod 
*/ 
public interface TipoPersonaRepository extends Repository<TipoPersona, Integer>{ 
    List<TipoPersona> findAll(); 
}