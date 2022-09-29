package resoluciones.example.demo.repositries;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import resoluciones.example.demo.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Usuario findByUsername(String username);

}