
package com.portfoliolg.portfoliolg.Service;

import com.portfoliolg.portfoliolg.Entity.Habilidad;
import com.portfoliolg.portfoliolg.Repository.HabilidadRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HabilidadService {
    @Autowired
    public HabilidadRepository rHabilidad;
    
    
    public List<Habilidad> list(){
        return rHabilidad.findAll();
    }
    
    public Habilidad getOne(int id){
        return rHabilidad.findById(id).orElse(null);
    }
        
    
    public void save(Habilidad habi){
        rHabilidad.save(habi);
    }
    
     public void delete(int id){
        rHabilidad.deleteById(id);
    }
    
     public void edit(Habilidad habi){
        rHabilidad.save(habi);
    }
    
    public List<Habilidad> findByPersonaId(Long personaId) {
        return rHabilidad.findByPersonaId(personaId);
    }
}