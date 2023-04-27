package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SnacksController {

    @GetMapping("/Snacks")
    public String Snacks() {
        return "/Snacks";
    }
}
