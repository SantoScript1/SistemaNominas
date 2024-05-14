package com.nominas.SistemaNominas.controller;

import com.nominas.SistemaNominas.model.Rol;
import com.nominas.SistemaNominas.service.IRolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RolController {
        
    @Autowired
    private IRolService depaServ;
    
    @GetMapping("/departamentos/traer")
    public List<Rol> getDepartamento() {
        return depaServ.getRoles();
    }
 
    @PostMapping("/departamentos/crear")
    public String saveEmpleado(@RequestBody Rol rol) {
        depaServ.saveRol(rol);
        return "Departamento creado!";
    }
    
    @DeleteMapping("/departamentos/borrar/{id}")
    public String deleteEmpleado(@PathVariable Long id) {
        depaServ.deleteRol(id);
        return "Departamento eliminado";
    }
}
