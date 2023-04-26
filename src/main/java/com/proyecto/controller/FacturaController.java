
package com.proyecto.controller;

import com.proyecto.entity.Asiento;
import com.proyecto.entity.Cliente;
import com.proyecto.entity.Comida;
import com.proyecto.entity.Factura;
import com.proyecto.entity.Pelicula;
import com.proyecto.service.IAsientoService;
import com.proyecto.service.IClienteService;
import com.proyecto.service.IComidaService;
import com.proyecto.service.IFacturaService;
import com.proyecto.service.IPeliculaService;
import com.proyecto.service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FacturaController {
    @Autowired
    private IClienteService clienteService;
    
    @Autowired
    private IComidaService comidaService;
    
    @Autowired
    private IPeliculaService peliculaService;
    
    @Autowired
    private ISalaService salaService;
    
    @Autowired
    private IAsientoService asientoService;
    
    @Autowired
    private IFacturaService facturaService;
    
    
    @GetMapping("/factura")
    public String index(Model model){
        List<Factura> listaFactura = facturaService.getAllFactura();
        model.addAttribute("titulo", "Historial de facturas");
        model.addAttribute("facturas", listaFactura);
        return "facturas";
    }
    
    @GetMapping("/facturaC")
    public String crearFactura(Model model){
        List<Pelicula> listaPeliculas = peliculaService.getAllPelicula();
        List<Asiento> listaAsientos = asientoService.getAllAsiento();
        
        //Validacion para no usar asientos que ya fueron comprados
        for (int i = 0; i < listaAsientos.size(); i++) {
            
            if (listaAsientos.get(i).getEstado().equals("Ocupado")) {
                System.out.println(listaAsientos.get(i).getNum_asiento());
                listaAsientos.remove(i);
                i = i-1;   //Correccion porque cuando se quita un asiento la lista se mueve hacia atras entonces se debe volver a validar  
            }      
        }
      
        List<Comida> listaComidas = comidaService.getAllComida();
        List<Cliente> listaClientes = clienteService.getAllCliente();
        model.addAttribute("factura", new Factura());
        model.addAttribute("peliculas", listaPeliculas);
        model.addAttribute("asientos", listaAsientos);
        model.addAttribute("comidas", listaComidas);
        model.addAttribute("clientes", listaClientes);
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarFactura(@ModelAttribute Factura factura){
        facturaService.saveFactura(factura);
        //Al guardar tambien vamos a actualizar el estado del asiento para que no se pueda volver a comprar
        Asiento asiento = factura.getAsiento();
        asiento.setEstado("Ocupado");
        asientoService.saveAsiento(asiento);
        
        return "redirect:/factura"; //Redirigir a una pantalla de mostrar la factura, no todas
    }
    
    @GetMapping("/delete/{num_factura}")
    public String eliminarFactura(@PathVariable("num_factura") Long num_factura){
        facturaService.delete(num_factura);
        return "redirect:/factura";
    }
    
    
 
}
