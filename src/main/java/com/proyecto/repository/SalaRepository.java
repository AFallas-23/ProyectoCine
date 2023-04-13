
package com.proyecto.repository;

import com.proyecto.entity.Sala;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fernando
 */

@Repository
public interface SalaRepository extends CrudRepository<Sala, Long>{
    
}
