package resoluciones.example.demo.services;

import resoluciones.example.demo.entities.Resolucion;

import java.util.List;

public interface ResolucionService {
    public List<Resolucion> findAllResolucion();
    public Resolucion saveResolucion(Resolucion resolucion);
    public void deleteResolucion(Resolucion resolucion);
    public void deleteResolucionById(Long id);
    public Resolucion findResolucion(Resolucion resolucion);
    public Resolucion findResolucionById(Long id);
    public List<Resolucion> getByFilter(String query,String order);
}
