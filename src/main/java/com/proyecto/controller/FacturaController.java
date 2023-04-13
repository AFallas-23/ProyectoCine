
package com.proyecto.controller;

import com.proyecto.entity.Asiento;
import com.proyecto.entity.Comida;
import com.proyecto.entity.Factura;
import com.proyecto.entity.Pelicula;
import com.proyecto.entity.Sala;
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

/**
 *
 * @author Fernando
 */
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
        model.addAttribute("titulo", "Facturas");
        model.addAttribute("facturas", listaFactura);
        return "facturas";
    }
    
    @GetMapping("/facturaC")
    public String crearFactura(Model model){
        List<Pelicula> listaPeliculas = peliculaService.getAllPelicula();
        List<Sala> listaSalas = salaService.getAllSala();
        List<Asiento> listaAsientos = asientoService.getAllAsiento();
        List<Comida> listaComidas = comidaService.getAllComida();
        model.addAttribute("factura", new Factura());
        model.addAttribute("peliculas", listaPeliculas);
        model.addAttribute("salas", listaSalas);
        model.addAttribute("asientos", listaAsientos);
        model.addAttribute("comidas", listaComidas);
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarFactura(@ModelAttribute Factura factura){
        facturaService.saveFactura(factura);
        return "redirect:/factura";
    }
    
//    @GetMapping("/editPersona/{id}")
//    public String editarPersona(@PathVariable("id") Long idPersona, Model model){
//        Persona persona = personaService.getPersonaById(idPersona);
//        List<Pais> listaPaises = paisService.listCountry();
//        model.addAttribute("persona", persona);
//        model.addAttribute("paises", listaPaises);
//        return "crear";
//    }
    
    @GetMapping("/delete/{num_factura}")
    public String eliminarPersona(@PathVariable("num_factura") Long num_factura){
        facturaService.delete(num_factura);
        return "redirect:/factura";
    }
 
}
