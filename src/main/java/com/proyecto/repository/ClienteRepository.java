
package com.proyecto.repository;

import com.proyecto.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fernando
 */

@Repository
public interface ClienteRepository extends CrudRepository <Cliente, Long> {
    
}
