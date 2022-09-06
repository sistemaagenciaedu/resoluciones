package resoluciones.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import resoluciones.example.demo.entities.Resolucion;
import resoluciones.example.demo.repositries.ResolucionRepository;

import java.util.List;

public class ResolucionServiceIMPL implements ResolucionService{
    @Autowired
    private ResolucionRepository rr;
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
}
