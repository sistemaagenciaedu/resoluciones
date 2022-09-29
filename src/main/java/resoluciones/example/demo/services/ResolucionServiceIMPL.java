package resoluciones.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import resoluciones.example.demo.dto.ResolucionFilterDTO;
import resoluciones.example.demo.entities.Resolucion;
import resoluciones.example.demo.repositries.ResolucionRepository;
import resoluciones.example.demo.repositries.ResolucionSpecification;

import java.util.List;
@Service
public class ResolucionServiceIMPL implements ResolucionService{
    @Autowired
    private ResolucionRepository rr;
    @Autowired
    private ResolucionSpecification rs;
    @Override
    public List<Resolucion> findAllResolucion() {
        return rr.findAll();
    }

    @Override
    public Resolucion saveResolucion(Resolucion resolucion) {
        return rr.save(resolucion);
    }

    @Override
    public void deleteResolucion(Resolucion resolucion) {
 rr.delete(resolucion);
    }

    @Override
    public void deleteResolucionById(Long id) {
 rr.deleteById(id);
    }

    @Override
    public Resolucion findResolucion(Resolucion resolucion) {
        return findResolucionById(resolucion.getId());
    }

    @Override
    public Resolucion findResolucionById(Long id) {
        return rr.findById(id).orElse(null);
    }


    @Transactional(readOnly = true)
    @Override
    public List<Resolucion> getByFilter(String query,String order) {
        ResolucionFilterDTO ifd= new ResolucionFilterDTO(query, query, query, query, query, query, query, order);


        List <Resolucion>lista=rr.findAll(rs.getByFilters(ifd));
        return lista;
    }

}
