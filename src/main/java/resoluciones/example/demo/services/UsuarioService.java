package resoluciones.example.demo.services;


import resoluciones.example.demo.entities.Usuario;

import java.util.List;

public interface UsuarioService {

    public Usuario createUsuario(Usuario usuario);
    public List<Usuario> findAllUsuario();
    public Usuario saveUsuario(Usuario usuario);
    public void deleteUsuario(Usuario usuario);
    public Usuario findUsuario(Usuario usuario);
    public Usuario findUsuarioById(Long id);


}