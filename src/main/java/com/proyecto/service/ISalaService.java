
package com.proyecto.service;

import com.proyecto.entity.Sala;
import java.util.List;

/**
 *
 * @author Fernando
 */
public interface ISalaService {
    public List<Sala> getAllSala();
    public Sala getSalaById (long num_sala);
}
