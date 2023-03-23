
package com.portfoliolg.portfoliolg.Repository;

import com.portfoliolg.portfoliolg.Entity.Habilidad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HabilidadRepository extends JpaRepository<Habilidad, Integer> {
    List<Habilidad> findByPersonaId(Long personaId);
}