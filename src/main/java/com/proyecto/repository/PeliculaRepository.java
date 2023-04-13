
package com.proyecto.repository;

import com.proyecto.entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fernando
 */

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Long> {
    
}
