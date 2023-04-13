
package com.proyecto.service;

import com.proyecto.entity.Comida;
import java.util.List;

/**
 *
 * @author Fernando
 */
public interface IComidaService {
    public List<Comida> getAllComida();
    public Comida getComidaById (long id);

}
