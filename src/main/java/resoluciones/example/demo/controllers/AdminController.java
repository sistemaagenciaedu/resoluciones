package resoluciones.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import resoluciones.example.demo.entities.Resolucion;
import resoluciones.example.demo.entities.Usuario;
import resoluciones.example.demo.repositries.UsuarioRepository;
import resoluciones.example.demo.services.ResolucionImporter;
import resoluciones.example.demo.services.ResolucionService;
import resoluciones.example.demo.web.EncriptarPassword;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/admin")
public class AdminController {
     @Autowired
     private ResolucionService rs;
@Autowired
private ResolucionImporter ri;
    @Autowired
    private UsuarioRepository ur;

    @GetMapping("")
    private String index(Model model,@AuthenticationPrincipal User user){
     model.addAttribute("resolucion",new Resolucion());
     model.addAttribute("resoluciones2",rs.findAllResolucion());
     model.addAttribute("usuario",new Usuario());
        return "panel";
    }

    @PostMapping ("/resolucion/save")
    private String guardarResolucion(Resolucion resolucion,Model model){
    rs.saveResolucion(resolucion);
        model.addAttribute("resolucion",new Resolucion());
        model.addAttribute("resoluciones2",rs.findAllResolucion());
       return "redirect:/admin/";
    }

    @GetMapping("/eliminar-resolucion")
    public String deleteResolucion(@RequestParam(required = false, name = "id") Long id) {
        Resolucion eliminado = rs.findResolucionById(id);

        if (eliminado != null) {

            rs.deleteResolucion(eliminado);


            return "redirect:/admin/";

        } else {
            return "redirect:/admin/";

        }


    }

    @PostMapping("/import/excel")
    public String ImportToMySql(@RequestParam("file") MultipartFile file, Model model) throws IOException {
List<Resolucion> lista=ri.excelImport(file);
for (Resolucion reso: lista){
    rs.saveResolucion(reso);
}
        return "redirect:/admin/";
    }

    @PostMapping ("/guardar-user")
    public String superUser(Usuario usuario) {


            Usuario usu = new Usuario();
            usu.setAlta(new Date());
            usu.setApellido(usuario.getApellido());
            usu.setNombre(usuario.getNombre());
            usu.setEmail(usuario.getEmail());
            usu.setUsername(usu.getEmail());
            usu.setClave(EncriptarPassword.encriptarPassword(usuario.getClave()));
            usu.setPermisos(usuario.getPermisos());
            ur.save(usu);
        return "redirect:/admin/listausuarios";


    }
    @GetMapping("/listausuarios")
    private String listaUser(Model model){
        model.addAttribute("resolucion",new Resolucion());
        model.addAttribute("usuario",new Usuario());
        model.addAttribute("lisusuarios",ur.findAll());

        return "usuarios";
    }

    @GetMapping("/eliminar-user")
    public String deleteUser(@RequestParam(required = false, name = "id") Long id) {
        Usuario eliminado = ur.findById(id).orElse(null);

        if (eliminado != null) {

            ur.delete(eliminado);


            return "redirect:/admin/listausuarios";

        } else {
            return "redirect:/admin/listausuarios";

        }


    }

    @GetMapping("/buscar/resolucion")
    public String exportar(Model model,
                           @RequestParam(required = false, name = "query") String query,

                           @RequestParam(required = false, defaultValue = "ASC") String order
    ) {
        List<Resolucion> lista = new ArrayList<>();
        if (query.equalsIgnoreCase("")) {
            lista = rs.findAllResolucion();
        } else {


            lista = rs.getByFilter(query,order);
        }


        model.addAttribute("resolucion",new Resolucion());
        model.addAttribute("resoluciones2",lista);
        model.addAttribute("usuario",new Usuario());
        return "panel";
    }


}
