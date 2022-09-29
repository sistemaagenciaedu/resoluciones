package resoluciones.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import resoluciones.example.demo.entities.Resolucion;
import resoluciones.example.demo.entities.Usuario;
import resoluciones.example.demo.repositries.UsuarioRepository;
import resoluciones.example.demo.web.EncriptarPassword;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeControllers {
    @Autowired
    private UsuarioRepository ur;
    @GetMapping({"", "/index", "/home", "/"})
    public String home() {

        return "index";
    }
    @GetMapping("/administrador/crear-super-user")
    public String superUser() {

        List<Usuario> userLis = new ArrayList<>();
        userLis = ur.findAll();
        if (userLis.size() == 0) {
            Usuario usu = new Usuario();
            usu.setAlta(new Date());
            usu.setApellido("SuperAdmin");
            usu.setNombre("Admin");
            usu.setEmail("superadmin@bue.edu.ar");
            usu.setUsername(usu.getEmail());
            usu.setClave(EncriptarPassword.encriptarPassword("sistemas"));
            ur.save(usu);

        }
        return "index";
    }

}
