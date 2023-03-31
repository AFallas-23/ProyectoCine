/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.entity;



/**
 *
 * @author Fernando
 */

//@Entity
//@Table(name = "peliculas")
public class Pelicula {
  //  @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    
    private int id; /*Para un mejor manejo*/
    private String nombre;
    private String fecha_estreno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
