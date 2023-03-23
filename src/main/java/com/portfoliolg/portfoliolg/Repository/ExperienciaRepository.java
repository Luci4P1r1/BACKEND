
package com.portfoliolg.portfoliolg.Repository;

import com.portfoliolg.portfoliolg.Entity.Experiencia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Integer>{
   List<Experiencia> findByPersonaId(Long personaId);
}