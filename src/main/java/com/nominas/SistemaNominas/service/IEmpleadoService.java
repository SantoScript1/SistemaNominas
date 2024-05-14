package com.nominas.SistemaNominas.service;

import com.nominas.SistemaNominas.model.Empleado;
import java.util.Date;
import java.util.List;

public interface IEmpleadoService {
    
    // Llamar a todos los elementos
    public List<Empleado> getEmpleados();
    
    // Crear un elemento
    public void saveEmpleado(Empleado emple);
    
    // Borrar un elemento
    public void deleteEmpleado(Long id);
    
    // Modificar un elemento
    public void editEmpleado(Long idOriginal, Long idNuevo, String nuevoNombre
   , String nuevoApellido, String nuevoCorreo, String nuevaContrasenia,
    Date nuevaFechaNacimiento, String nuevoTelefono, String nuevaDireccion, Double nuevoSalario
    , String nuevoCargo);
    
    // Buscar un solo objeto
    public Empleado findEmpleado(Long id);
}
