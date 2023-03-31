/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.entity;
/*No se han instalado las dependencias, por eso da errores*/

/**
 *
 * @author Fernando
 */
//@Entity
//@Table(name = "salas")
public class Sala {
  //  @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int num_sala;
    private String max_personas;
    private String tipo_sala; /*VIP, Comun, 3D, VIP 3D*/
    private String costo_entrada;

    public int getNum_sala() {
        return num_sala;
    }

    public void setNum_sala(int num_sala) {
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

    public String getCosto_entrada() {
        return costo_entrada;
    }

    public void setCosto_entrada(String costo_entrada) {
        this.costo_entrada = costo_entrada;
    }
    
    
    
}
