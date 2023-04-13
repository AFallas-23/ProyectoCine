
package com.proyecto.service;

import com.proyecto.entity.Asiento;
import com.proyecto.repository.AsientoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fernando
 */
@Service
public class AsientoService implements IAsientoService{
    @Autowired
    private AsientoRepository asientoRepository;

    @Override
    public List<Asiento> getAllAsiento() {
        return (List<Asiento>)asientoRepository.findAll();
    }

    @Override
    public Asiento getAsientoById(String num_asiento) {
        return asientoRepository.findById(num_asiento).orElse(null);
    }

    @Override
    public void delete(String num_asiento) {
        asientoRepository.deleteById(num_asiento);
        
    }

    @Override
    public void saveAsiento(Asiento asiento) {
        asientoRepository.save(asiento);
    }
    
    
    

}
