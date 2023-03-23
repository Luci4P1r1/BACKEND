
package com.portfoliolg.portfoliolg.Repository;

import com.portfoliolg.portfoliolg.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Integer>{
    
    
}
