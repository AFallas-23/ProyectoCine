
package com.proyecto.controller;

import com.proyecto.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Fernando
 */
@Controller
public class ClienteController {
    //Para poder realizar registros de clientes
    //Hay que buscar como poder encriptar la contraseña para guardarla encripta en la base da datos
    //BCrypt
    @Autowired
    private IClienteService clienteService;
    
    
    
    

}
