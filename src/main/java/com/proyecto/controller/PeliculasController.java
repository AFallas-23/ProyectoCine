
package com.proyecto.controller;


import com.proyecto.entity.Pelicula;
import com.proyecto.service.IPeliculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PeliculasController {
    //Esto le va a enviar cada pelicula en la base de datos a la pagina de inicio
    //Ya no hace falta el InicioController
    
    
    @Autowired
    private IPeliculaService peliculaService;
    
    /*
    1Bat
    2John
    3Gato
    4Una Es
    5Screa*/
    //Enviar informacion de peliculas a la pagina de inicio
    @GetMapping("/PInicio")
    public String PInicio(Model model) {
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        Pelicula pelicula1 = listaPelicula.get(0);
        model.addAttribute("pelicula1", pelicula1);
        Pelicula pelicula2 = listaPelicula.get(1);
        model.addAttribute("pelicula2", pelicula2);
        Pelicula pelicula3 = listaPelicula.get(2);
        model.addAttribute("pelicula3", pelicula3);
        Pelicula pelicula4 = listaPelicula.get(3);
        model.addAttribute("pelicula4", pelicula4);
        Pelicula pelicula5 = listaPelicula.get(4);
        model.addAttribute("pelicula5", pelicula5);
        return "PInicio";
    }
    
    //Enviar informacion de peliculas a los info peli
    //Son varios debido a no poder cargar las imagenes dinamicamente
    @GetMapping("/InfoPeli")
    public String InfoPeli(Model model) {
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        Pelicula pelicula1 = listaPelicula.get(0);
        model.addAttribute("pelicula1", pelicula1);
        Pelicula pelicula2 = listaPelicula.get(1);
        model.addAttribute("pelicula2", pelicula2);
        Pelicula pelicula3 = listaPelicula.get(2);
        model.addAttribute("pelicula3", pelicula3);
        Pelicula pelicula4 = listaPelicula.get(3);
        model.addAttribute("pelicula4", pelicula4);
        Pelicula pelicula5 = listaPelicula.get(4);
        model.addAttribute("pelicula5", pelicula5);
        return "InfoPeli";
    }
    
    @GetMapping("/InfoPeli2")
    public String InfoPeli2(Model model) {
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        Pelicula pelicula1 = listaPelicula.get(0);
        model.addAttribute("pelicula1", pelicula1);
        Pelicula pelicula2 = listaPelicula.get(1);
        model.addAttribute("pelicula2", pelicula2);
        Pelicula pelicula3 = listaPelicula.get(2);
        model.addAttribute("pelicula3", pelicula3);
        Pelicula pelicula4 = listaPelicula.get(3);
        model.addAttribute("pelicula4", pelicula4);
        Pelicula pelicula5 = listaPelicula.get(4);
        model.addAttribute("pelicula5", pelicula5);
        return "InfoPeli2";
    }
    
    @GetMapping("/InfoPeli3")
    public String InfoPeli3(Model model) {
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        Pelicula pelicula1 = listaPelicula.get(0);
        model.addAttribute("pelicula1", pelicula1);
        Pelicula pelicula2 = listaPelicula.get(1);
        model.addAttribute("pelicula2", pelicula2);
        Pelicula pelicula3 = listaPelicula.get(2);
        model.addAttribute("pelicula3", pelicula3);
        Pelicula pelicula4 = listaPelicula.get(3);
        model.addAttribute("pelicula4", pelicula4);
        Pelicula pelicula5 = listaPelicula.get(4);
        model.addAttribute("pelicula5", pelicula5);
        return "InfoPeli3";
    }
    
    @GetMapping("/InfoPeli4")
    public String InfoPeli4(Model model) {
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        Pelicula pelicula1 = listaPelicula.get(0);
        model.addAttribute("pelicula1", pelicula1);
        Pelicula pelicula2 = listaPelicula.get(1);
        model.addAttribute("pelicula2", pelicula2);
        Pelicula pelicula3 = listaPelicula.get(2);
        model.addAttribute("pelicula3", pelicula3);
        Pelicula pelicula4 = listaPelicula.get(3);
        model.addAttribute("pelicula4", pelicula4);
        Pelicula pelicula5 = listaPelicula.get(4);
        model.addAttribute("pelicula5", pelicula5);
        return "InfoPeli4";
    }
    
    @GetMapping("/InfoPeli5")
    public String InfoPeli5(Model model) {
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        Pelicula pelicula1 = listaPelicula.get(0);
        model.addAttribute("pelicula1", pelicula1);
        Pelicula pelicula2 = listaPelicula.get(1);
        model.addAttribute("pelicula2", pelicula2);
        Pelicula pelicula3 = listaPelicula.get(2);
        model.addAttribute("pelicula3", pelicula3);
        Pelicula pelicula4 = listaPelicula.get(3);
        model.addAttribute("pelicula4", pelicula4);
        Pelicula pelicula5 = listaPelicula.get(4);
        model.addAttribute("pelicula5", pelicula5);
        return "InfoPeli5";
    }
  
}
