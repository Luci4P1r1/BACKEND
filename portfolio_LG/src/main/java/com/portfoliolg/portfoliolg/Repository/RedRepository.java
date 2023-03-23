
package com.portfoliolg.portfoliolg.Repository;

import com.portfoliolg.portfoliolg.Entity.Red;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RedRepository extends JpaRepository<Red, Integer>{
    public Optional<Red> findByUrl(String url);
    public boolean existsByUrl (String url);
    
    List<Red> findByPersonaId(Long personaId);
}