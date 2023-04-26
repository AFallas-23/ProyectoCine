
package com.proyecto.controller;

import com.proyecto.entity.Cliente;
import com.proyecto.service.IClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {
    //Para poder realizar registros de clientes
    //Hay que buscar como poder encriptar la contraseña para guardarla encripta en la base da datos
    //BCrypt
    
    @Autowired
    private IClienteService clienteService;
    
    @GetMapping("/clienteR")
    public String registrarCliente(Model model){
        model.addAttribute("cliente", new Cliente());
        return "registroC";
    }
    
    @PostMapping("/saveC")
    public String guardarCliente(@ModelAttribute Cliente cliente){  
        //Se definen rangos y estado automaticamente
        cliente.setPermissions("USER");
        cliente.setRoles("USER");
        cliente.setActive(1);
        //Falta encriptar contraseña
        clienteService.saveCliente(cliente);
        return "redirect:/login";
    }
    
    @GetMapping("/cliente")
    public String indexC(Model model){
        List<Cliente> listaClientes = clienteService.getAllCliente();
        model.addAttribute("clientes", listaClientes);
        return "clientes";
    }
    
//    
//    @GetMapping("/editPersona/{id}")
//    public String editarPersona(@PathVariable("id") Long idPersona, Model model){
//        Persona persona = personaService.getPersonaById(idPersona);
//        List<Pais> listaPaises = paisService.listCountry();
//        model.addAttribute("persona", persona);
//        model.addAttribute("paises", listaPaises);
//        return "crear";
//    }
//    
//    @GetMapping("/delete/{id}")
//    public String eliminarPersona(@PathVariable("id") Long idPersona){
//        personaService.delete(idPersona);
//        return "redirect:/persona";
//    }
//    
    
    

}
