package resoluciones.example.demo.repositries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import resoluciones.example.demo.entities.Resolucion;
@Repository
public interface ResolucionRepository extends JpaRepository<Resolucion,Long> {
}
