package com.nominas.SistemaNominas.repository;

import com.nominas.SistemaNominas.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartamentoRepository extends JpaRepository <Departamento, Long>{
    
}
