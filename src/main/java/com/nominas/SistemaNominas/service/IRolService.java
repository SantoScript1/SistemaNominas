package com.nominas.SistemaNominas.service;

import com.nominas.SistemaNominas.model.Rol;
import java.util.List;

public interface IRolService {
    // Llamar a todos los elementos
    public List<Rol> getRoles();
    
    // Crear un elemento
    public void saveRol(Rol rol);
    
    // Borrar un elemento
    public void deleteRol(Long id);
    
    // Buscar un solo objeto
    public Rol findRol(Long id);
}
