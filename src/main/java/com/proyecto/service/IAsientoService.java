
package com.proyecto.service;

import com.proyecto.entity.Asiento;
import java.util.List;

/**
 *
 * @author Fernando
 */
public interface IAsientoService {
    public List<Asiento> getAllAsiento();
    public Asiento getAsientoById (String num_asiento);
}
