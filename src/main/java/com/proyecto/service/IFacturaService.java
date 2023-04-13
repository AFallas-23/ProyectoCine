
package com.proyecto.service;

import com.proyecto.entity.Factura;
import java.util.List;

/**
 *
 * @author Fernando
 */
public interface IFacturaService {
    public List<Factura> getAllFactura();
    public Factura getFacturaById (long id);
    public void saveFactura (Factura factura);
    public void delete (long id);
}
