
package com.portfoliolg.portfoliolg.Service;

import com.portfoliolg.portfoliolg.Entity.Experiencia;
import com.portfoliolg.portfoliolg.Repository.ExperienciaRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

   

@Service
@Transactional
public class ExperienciaService {
    
    @Autowired
     ExperienciaRepository rExperiencia;
    
    public List<Experiencia> list(){
        return rExperiencia.findAll();
    }
    
    public Experiencia getOne(int id){
        Experiencia expe = rExperiencia.findById(id).orElse(null);
        return expe;
    }
       
    
    public void save(Experiencia expe){
        rExperiencia.save(expe);
    }
    
     public void delete(int id){
        rExperiencia.deleteById(id);
    }
    
    public void edit(Experiencia expe){
        rExperiencia.save(expe);
    }
    

    public List<Experiencia> findByPersonaId(Long personaId) {
        return rExperiencia.findByPersonaId(personaId);
    }

    
}
