package com.nominas.SistemaNominas.service;

import com.nominas.SistemaNominas.model.Departamento;
import java.util.List;

public interface IDepartamentoService {
    // Llamar a todos los elementos
    public List<Departamento> getDepartamentos();
    
    // Crear un elemento
    public void saveDepartamento(Departamento depar);
    
    // Borrar un elemento
    public void deleteDepartamento(Long id);
    
    // Buscar un solo objeto
    public Departamento findDepartamento(Long id);
}
