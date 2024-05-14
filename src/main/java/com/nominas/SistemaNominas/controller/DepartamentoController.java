package com.nominas.SistemaNominas.controller;

import com.nominas.SistemaNominas.model.Departamento;
import com.nominas.SistemaNominas.service.IDepartamentoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartamentoController {
    
    @Autowired
    private IDepartamentoService depaServ;
    
    @GetMapping("/departamentos/traer")
    public List<Departamento> getDepartamento() {
        return depaServ.getDepartamentos();
    }
 
    @PostMapping("/departamentos/crear")
    public String saveEmpleado(@RequestBody Departamento depa) {
        depaServ.saveDepartamento(depa);
        return "Departamento creado!";
    }
    
    @DeleteMapping("/departamentos/borrar/{id}")
    public String deleteEmpleado(@PathVariable Long id) {
        depaServ.deleteDepartamento(id);
        return "Departamento eliminado";
    }
}
