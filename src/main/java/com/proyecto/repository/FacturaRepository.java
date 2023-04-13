
package com.proyecto.repository;

import com.proyecto.entity.Factura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fernando
 */

@Repository
public interface FacturaRepository extends CrudRepository<Factura, Long>{
    
}
