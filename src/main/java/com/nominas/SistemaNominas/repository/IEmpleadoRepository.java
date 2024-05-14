package com.nominas.SistemaNominas.repository;

import com.nominas.SistemaNominas.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoRepository extends JpaRepository <Empleado, Long>{
    
}
