
package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {
     
    @GetMapping("/PInicio")
    public String index(){
        return "/PInicio";
    }
}
