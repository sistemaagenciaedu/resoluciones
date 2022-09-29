package resoluciones.example.demo.repositries;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import resoluciones.example.demo.entities.Resolucion;

import java.util.List;

@Repository
public interface ResolucionRepository extends JpaRepository<Resolucion,Long>, JpaSpecificationExecutor<Resolucion> {

    @Override
    List<Resolucion> findAll(Specification<Resolucion> spec);
}
