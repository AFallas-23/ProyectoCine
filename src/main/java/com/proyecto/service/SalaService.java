
package com.proyecto.service;

import com.proyecto.entity.Sala;
import com.proyecto.repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fernando
 */
@Service
public class SalaService implements ISalaService{
    @Autowired
    private SalaRepository salaRepository;

    @Override
    public List<Sala> getAllSala() {
        return (List<Sala>)salaRepository.findAll();
    }

    @Override
    public Sala getSalaById(long num_sala) {
        return salaRepository.findById(num_sala).orElse(null);
    }
    
}
