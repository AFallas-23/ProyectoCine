
package com.proyecto.service;

import com.proyecto.entity.Cliente;
import com.proyecto.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fernando
 */
@Service
public class ClienteService implements IClienteService{
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getAllCliente() {
        return (List<Cliente>)clienteRepository.findAll();
    }

    @Override
    public Cliente getClienteById(long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void delete(long id) {
        clienteRepository.deleteById(id);
    }
    
}
