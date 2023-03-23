
package com.portfoliolg.portfoliolg.Service;

import com.portfoliolg.portfoliolg.Entity.Red;
import com.portfoliolg.portfoliolg.Repository.RedRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RedService {
    @Autowired
    RedRepository rRed;
      
    
    public List<Red> list(){
        return rRed.findAll();
    }
    
    public Red getOne(int id){
        Red re= rRed.findById(id).orElse(null);
        return re;
    }
    
       
    public void save(Red re){
        rRed.save(re);
    }
    
     public void delete(int id){
        rRed.deleteById(id);
    }
     
    public void edit(Red re){
        rRed.save(re);
    }
    
    
    public List<Red> findByPersonaId(Long personaId) {
        return rRed.findByPersonaId(personaId);
    }
}