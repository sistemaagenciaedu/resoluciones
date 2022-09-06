package resoluciones.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import resoluciones.example.demo.entities.Resolucion;

@Controller
@RequestMapping("/")
public class HomeControllers {

    @GetMapping("")
    private String index(Model model){
        var nombre="hernan";
        model.addAttribute("nombre",nombre);
        return "index";
    }


}
