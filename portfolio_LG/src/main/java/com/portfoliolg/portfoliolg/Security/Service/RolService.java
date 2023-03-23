
package com.portfoliolg.portfoliolg.Security.Service;

import com.portfoliolg.portfoliolg.Security.Entity.Rol;
import com.portfoliolg.portfoliolg.Security.Enums.RolNombre;
import com.portfoliolg.portfoliolg.Security.Repository.IRolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepository;
    
    public Optional<Rol> getbyRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}