
package com.proyecto.repository;

import com.proyecto.entity.Comida;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fernando
 */

@Repository
public interface ComidaRepository extends CrudRepository<Comida, Long>{
    
}
