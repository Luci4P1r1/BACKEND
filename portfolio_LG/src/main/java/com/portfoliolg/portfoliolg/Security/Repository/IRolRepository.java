
package com.portfoliolg.portfoliolg.Security.Repository;

import com.portfoliolg.portfoliolg.Security.Entity.Rol;
import com.portfoliolg.portfoliolg.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
