

package com.proyecto.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 *
 * @author Fernando
 */
@Entity
@Table(name = "asientos")
public class Asiento {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private String num_asiento; /*A1, A2....*/
    private String estado; /*Ocupado, Disponible*/

    public Asiento() {
    }

    
   @ManyToOne
   @JoinColumn(name="num_sala")
    private Sala sala;    

    public String getNum_asiento() {
        return num_asiento;
    }

    public void setNum_asiento(String num_asiento) {
        this.num_asiento = num_asiento;
    }
    
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

 
    
    

}
