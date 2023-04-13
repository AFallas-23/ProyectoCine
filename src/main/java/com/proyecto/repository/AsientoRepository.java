
package com.proyecto.repository;

import com.proyecto.entity.Asiento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fernando
 */

@Repository
public interface AsientoRepository extends CrudRepository<Asiento, String>{
    
}
