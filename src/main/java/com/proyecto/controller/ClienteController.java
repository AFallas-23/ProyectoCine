
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
        //Encriptar contraseña
        cliente.setPassword(clienteService.encryptPassword(cliente.getPassword()));
        clienteService.saveCliente(cliente);
        return "redirect:/login";
    }
    
    @PostMapping("/saveE")  //Esta funcion es para guardar el cliente que edita el admin
    public String guardarClienteEditado(@ModelAttribute Cliente cliente){  
        //Se definen rangos y estado automaticamente
        //Encriptar contraseña
        cliente.setPassword(clienteService.encryptPassword(cliente.getPassword()));
        clienteService.saveCliente(cliente);
        return "redirect:/cliente";
    }
    
    @GetMapping("/cliente")
    public String indexC(Model model){
        List<Cliente> listaClientes = clienteService.getAllCliente();
        model.addAttribute("clientes", listaClientes);
        return "clientes";
    }
    
    
    @GetMapping("/editCliente/{id}")
    public String editarCliente(@PathVariable("id") Long idCliente, Model model){
        Cliente cliente = clienteService.getClienteById(idCliente);
        model.addAttribute("cliente", cliente);
        return "registroE"; //Es similar al registro pero tiene más funciones para el administrador
    }
    
    @GetMapping("/deleteCliente/{id}")
    public String eliminarCliente(@PathVariable("id") Long idCliente){
        clienteService.delete(idCliente);
        return "redirect:/cliente";
    }
    
    
    

}
