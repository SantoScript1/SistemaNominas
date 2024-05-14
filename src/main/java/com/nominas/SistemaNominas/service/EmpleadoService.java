package com.nominas.SistemaNominas.service;

import com.nominas.SistemaNominas.model.Empleado;
import com.nominas.SistemaNominas.repository.IEmpleadoRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService implements IEmpleadoService{
    
    @Autowired
    private IEmpleadoRepository empleRepo;

    @Override
    public List<Empleado> getEmpleados() {
        List <Empleado> listaEmpleados = empleRepo.findAll();
        return listaEmpleados;
    }

    @Override
    public void saveEmpleado(Empleado emple) {
        empleRepo.save(emple);
    }

    @Override
    public void deleteEmpleado(Long id) {
        empleRepo.deleteById(id);
    }

    @Override
    public Empleado findEmpleado(Long id) {
        Empleado emple = empleRepo.findById(id).orElse(null);
        return emple;
    }

    @Override
    public void editEmpleado(Long idOriginal, 
                             Long idNuevo, 
                             String nuevoNombre, 
                             String nuevoApellido, 
                             String nuevoCorreo, 
                             String nuevaContrasenia, 
                             Date nuevaFechaNacimiento, 
                             String nuevoTelefono, 
                             String nuevaDireccion,
                             Double nuevoSalario,
                             String nuevoCargo) {
        // Buscar objeto original
        Empleado emple = this.findEmpleado(idOriginal);
        
        emple.setId(idNuevo);
        emple.setNombre(nuevoNombre);
        emple.setApellido(nuevoApellido);
        emple.setCorreoElectronico(nuevoCorreo);
        emple.setContrasenia(nuevaContrasenia);
        emple.setFechaNaciemiento(nuevaFechaNacimiento);
        emple.setTelefono(nuevoTelefono);
        emple.setDireccion(nuevaDireccion);
        emple.setSalario(nuevoSalario);
        emple.setCargo(nuevoCargo);
        
        this.saveEmpleado(emple);
    }
    
    
}
