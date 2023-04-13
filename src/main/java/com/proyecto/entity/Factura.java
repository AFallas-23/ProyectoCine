

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
@Table(name = "facturas")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long num_factura;
    
    private String total;
    private String fecha;
    
    @ManyToOne  //FK
    @JoinColumn(name="id_cliente")
    private Cliente cliente;
    
    @ManyToOne
    @JoinColumn(name="id_pelicula")
    private Pelicula pelicula;
    
    @ManyToOne
    @JoinColumn(name="num_asiento")
    private Asiento asiento;
    
    @ManyToOne
    @JoinColumn(name="id_comida")
    private Comida comida;

    public long getNum_factura() {
        return num_factura;
    }

    public void setNum_factura(long num_factura) {
        this.num_factura = num_factura;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }


    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    
    
    
    
    
    
    
    
}
