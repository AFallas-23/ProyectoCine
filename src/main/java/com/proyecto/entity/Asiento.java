

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
    
   @ManyToOne
   @JoinColumn(name="num_sala")
    private Sala num_sala;    

    public String getNum_asiento() {
        return num_asiento;
    }

    public void setNum_asiento(String num_asiento) {
        this.num_asiento = num_asiento;
    }

    public Sala getNum_sala() {
        return num_sala;
    }

    public void setNum_sala(Sala num_sala) {
        this.num_sala = num_sala;
    }
    
    

}
