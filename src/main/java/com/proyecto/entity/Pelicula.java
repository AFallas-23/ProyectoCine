

package com.proyecto.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 *
 * @author Fernando
 */

@Entity
@Table(name = "peliculas")
public class Pelicula {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    
    private long id; /*Para un mejor manejo*/
   
   
    private String nombre;
    private String fecha_estreno;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_estreno() {
        return fecha_estreno;
    }

    public void setFecha_estreno(String fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }
    
    
    
}
