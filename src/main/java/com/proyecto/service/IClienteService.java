
package com.proyecto.service;

import com.proyecto.entity.Cliente;
import java.util.List;

/**
 *
 * @author Fernando
 */
public interface IClienteService {
    public List<Cliente> getAllCliente();
    public Cliente getClienteById (long id);
    public void saveCliente (Cliente cliente);
    public void delete (long id);
    public Cliente findByNombre (String username);
    public String encryptPassword(String password);
 
}
