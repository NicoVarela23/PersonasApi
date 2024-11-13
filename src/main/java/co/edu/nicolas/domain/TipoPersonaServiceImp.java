
package co.edu.nicolas.domain;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
/** 
* 
* @author nixod 
*/ 
@Service 
public class TipoPersonaServiceImp implements TipoPersonaService{ 
@Autowired 
private TipoPersonaRepository tp_repositorio; 
     
    @Override 
    public List<TipoPersona> listar() { 
        return tp_repositorio.findAll(); 
    } 
     
}   
