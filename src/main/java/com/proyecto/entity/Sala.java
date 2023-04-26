

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
@Table(name = "salas")
public class Sala {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long num_sala;
   
   
    private String max_personas;
    private String tipo_sala; /*VIP, Comun, 3D, VIP 3D*/
    private int costo_entrada;

    public long getNum_sala() {
        return num_sala;
    }

    public void setNum_sala(long num_sala) {
        this.num_sala = num_sala;
    }

    public String getMax_personas() {
        return max_personas;
    }

    public void setMax_personas(String max_personas) {
        this.max_personas = max_personas;
    }

    public String getTipo_sala() {
        return tipo_sala;
    }

    public void setTipo_sala(String tipo_sala) {
        this.tipo_sala = tipo_sala;
    }

    public int getCosto_entrada() {
        return costo_entrada;
    }

    public void setCosto_entrada(int costo_entrada) {
        this.costo_entrada = costo_entrada;
    }
    
    
    
}
