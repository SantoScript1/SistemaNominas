package com.nominas.SistemaNominas.controller;

import com.nominas.SistemaNominas.model.Empleado;
import com.nominas.SistemaNominas.service.IEmpleadoService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {
    
    @Autowired
    private IEmpleadoService empleServ;
    
    @GetMapping("/empleados/traer")
    public List<Empleado> getEmpleado() {
        return empleServ.getEmpleados();
    }
 
    @PostMapping("/empleados/crear")
    public String saveEmpleado(@RequestBody Empleado emple) {
        empleServ.saveEmpleado(emple);
        return "Empleado creado!";
    }
    
    @DeleteMapping("/empleados/borrar/{id}")
    public String deleteEmpleado(@PathVariable Long id) {
        empleServ.deleteEmpleado(id);
        return "Empleado eliminado";
    }
    
    @PutMapping ("/empleados/editar/{id_modificar}")
    public Empleado editEmpleado (@PathVariable Long id_original,
            @RequestParam(required=false, name="id") Long nuevoId,
            @RequestParam(required=false, name="nombre") String nuevoNombre,
            @RequestParam(required=false, name="apellido") String nuevoApellido,
            @RequestParam(required=false, name="correoElectronico") String nuevoCorreoElectronico,
            @RequestParam(required=false, name="contrasenia") String nuevaContrasenia,
            @RequestParam(required=false, name="fechaNacimiento") Date nuevaFechaNacimiento,
            @RequestParam(required=false, name="telefono") String nuevoTelefono,
            @RequestParam(required=false, name="direccion") String nuevaDireccion,
            @RequestParam(required=false, name="salario") Double nuevoSalario,
            @RequestParam(required=false, name="cargo") String nuevoCargo) {
            
        empleServ.editEmpleado(id_original, nuevoId, nuevoNombre, nuevoApellido,
                nuevoCargo, nuevaContrasenia, nuevaFechaNacimiento, nuevoTelefono,
                nuevaDireccion, nuevoSalario, nuevoCargo);
        
        Empleado emple = empleServ.findEmpleado(nuevoId);
        return emple;
    }
}