package com.nominas.SistemaNominas.repository;

import com.nominas.SistemaNominas.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository <Rol, Long>{
    
}
