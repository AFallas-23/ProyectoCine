
package com.proyecto.service;

import com.proyecto.entity.Comida;
import com.proyecto.repository.ComidaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fernando
 */
@Service
public class ComidaService implements IComidaService{
    @Autowired
    private ComidaRepository comidaRepository;

    @Override
    public List<Comida> getAllComida() {
        return (List<Comida>)comidaRepository.findAll();
    }

    @Override
    public Comida getComidaById(long id) {
        return comidaRepository.findById(id).orElse(null);
    }
    
}
