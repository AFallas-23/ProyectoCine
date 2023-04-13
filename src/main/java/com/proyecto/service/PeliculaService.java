
package com.proyecto.service;

import com.proyecto.entity.Pelicula;
import com.proyecto.repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fernando
 */
@Service
public class PeliculaService implements IPeliculaService{
    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> getAllPelicula() {
        return (List<Pelicula>)peliculaRepository.findAll();
        
    }

    @Override
    public Pelicula getPeliculaById(long id) {
        return peliculaRepository.findById(id).orElse(null);
        
    }
}
